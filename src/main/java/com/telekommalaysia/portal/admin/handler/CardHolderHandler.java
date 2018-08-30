package com.telekommalaysia.portal.admin.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telekommalaysia.portal.admin.constant.Constants;
import com.telekommalaysia.portal.admin.dto.soa.CardHoldersDTO;
import com.telekommalaysia.portal.admin.dto.soa.CarparkDTO;
import com.telekommalaysia.portal.admin.dto.soa.TenanciesDTO;
import com.telekommalaysia.portal.admin.model.soa.scms.CPDetails;
import com.telekommalaysia.portal.admin.model.soa.scms.CardHolderDetails;
import com.telekommalaysia.portal.admin.model.soa.scms.Tenancy;
import com.telekommalaysia.portal.admin.persist.entity.ReferenceTable;
import com.telekommalaysia.portal.admin.persist.repository.IReferenceTableRepository;
import com.telekommalaysia.portal.admin.service.ReferenceTableService;

@Service
public class CardHolderHandler {

	private static final Logger log = LoggerFactory.getLogger(CardHolderHandler.class);

	@Autowired
	ReferenceTableService referenceTableService;

	@Autowired
	IReferenceTableRepository referenceTableRepo;

	/**
	 * Method to get the Id type of the person.
	 *
	 * First parameter should be the NRIC and the second parameter is the Passport
	 * Number
	 *
	 * @param NRIC
	 * @param password
	 * @return
	 */
	public String getIdType(String NRIC, String passportNumber) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName);
		log.debug(Constants.EXIT_METHOD + methodName);
		if (!StringUtils.isEmpty(NRIC)) {
			return "NRIC";
		} else if (!StringUtils.isEmpty(passportNumber)) {
			return "Passport";
		} else {
			return "Invalid";
		}

	}

	public String getIdNo(String NRIC, String passportNumber) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName);
		log.debug(Constants.EXIT_METHOD + methodName);
		if (!StringUtils.isEmpty(NRIC)) {
			return NRIC;
		} else {
			return passportNumber;
		}

	}

	public String getCountryCode(String country) {
		String countryCode = "";
		String countryKey = "";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName);

		if (country.length() == 3) {
			countryKey = referenceTableService.getUniqueValue("Issuance Country", country);
			countryCode = referenceTableService.getUniqueKey("Country Code", countryKey);
		} else if (country.length() > 3) {
			countryCode = referenceTableService.getUniqueKey("Country Code", country);
		} else if (country.length() == 2) {
			countryCode = country;
		}
		log.debug(Constants.EXIT_METHOD + methodName);
		return countryCode;
	}

	public String getCountryName(String country) {
		String countryName = "";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName + " country = " + country);

		if (country.length() == 3) {
			countryName = referenceTableService.getUniqueValue("Issuance Country", country);
		} else if (country.length() > 3) {
			countryName = country;

		} else if (country.length() == 2) {
			countryName = referenceTableService.getUniqueValue("Country Code", country);
		}
		log.debug(Constants.EXIT_METHOD + methodName);
		return countryName;

	}

	/**
	 * Method to get the Issuace country given the country retrieved from SCMS
	 * Cardholder.
	 *
	 * @param country
	 * @return
	 */
	public String getIssuanceCountry(String country) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName + " country = " + country);

		StringBuilder issuanceCountry = new StringBuilder("");

		String countryName = getCountryName(country);
		issuanceCountry = new StringBuilder(referenceTableService.getUniqueKey("Issuance Country", countryName));

		log.debug(Constants.EXIT_METHOD + methodName);
		return issuanceCountry.toString();
	}

	public String getBrand(String brandModel) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName);

		List<ReferenceTable> userList = referenceTableRepo.findByType("Brand");
		StringBuilder newBrand = new StringBuilder("");
		for (ReferenceTable brand : userList) {

			if (brandModel.contains(brand.getValue() + "-")) {

				newBrand = new StringBuilder(brand.getValue());
			}
		}

		if (newBrand.toString().equals("")) {
			if (brandModel.indexOf("-") == -1) {
				newBrand = new StringBuilder("");
			} else {
				int i = brandModel.indexOf("-");
				newBrand = new StringBuilder(brandModel.substring(0, i - 1));
			}
		}
		log.debug(Constants.EXIT_METHOD + methodName);
		return newBrand.toString();
	}

	public String getModel(String brand, String brandModel) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.debug(Constants.ENTRY_METHOD + methodName);

		if (!StringUtils.isEmpty(brand)) {

			Integer start = (brand.length()) + 1;
			Integer end = (brandModel.length());
			String model = brandModel.substring(start, end);
			log.debug(Constants.EXIT_METHOD + methodName);
			return model;

		} else {
			log.debug(Constants.EXIT_METHOD + methodName);
			return brandModel;
		}

	}

	public String removePassportDash(String idNo, String idType) {
		String passportNumber = "";
		if (Constants.PASSPORT.equalsIgnoreCase(idType)) {
			passportNumber = idNo.replaceAll("-", "");
			return passportNumber;
		} else {
			return idNo;
		}

	}

	public String removePassportDash(String idNo) {
		String issuanceCountry = idNo.substring(0, 3);
		List<String> listOfIssuanceCountry = new ArrayList<>();
		List<ReferenceTable> listOfReferenceTable = new ArrayList<>();
		listOfReferenceTable = referenceTableRepo.findByTypeIgnoreCaseOrderByValue(Constants.ISSUANCE_COUNTRY);
		for (ReferenceTable referenceTable : listOfReferenceTable) {
			listOfIssuanceCountry.add(referenceTable.getKey());
		}
		if (listOfIssuanceCountry.contains(issuanceCountry)) {
			String passportNumber = idNo.replaceAll("-", "");
			return passportNumber;
		} else {
			return idNo;
		}

	}

	public String getIdType(int idType) {
		if (Constants.NRIC_INT_VAL == idType) {
			return Constants.NRIC;
		} else if (Constants.PASSPORT_INT_VAL == idType) {
			return Constants.PASSPORT;
		} else {
			return Constants.PASSPORT;
		}
	}

	public Integer getIdTypeInt(String idType) {
		if (Constants.NRIC.equalsIgnoreCase(idType)) {
			return Constants.NRIC_INT_VAL;
		} else if (Constants.PASSPORT.equalsIgnoreCase(idType)) {
			return Constants.PASSPORT_INT_VAL;
		} else {
			return 0;
		}
	}

	public static CardHoldersDTO resetBayNoForNRB(CardHoldersDTO cardHolder) {
		Set<CarparkDTO> carparks = cardHolder.getSetOfCarparks();
		if (!carparks.isEmpty()) {
			for (CarparkDTO carparkDTO : carparks) {
				if (Constants.NRB.equalsIgnoreCase(carparkDTO.getBayType())) {
					carparkDTO.setBayNum("");
				}
			}
			cardHolder.setSetOfCarparks(carparks);
		}
		return cardHolder;

	}

	public static CardHolderDetails resetBayNoForNRB(CardHolderDetails cardHolder) {
		List<CPDetails> carparks = cardHolder.getCpDetailsList();
		if (!carparks.isEmpty()) {
			for (CPDetails carparkDTO : carparks) {
				if (Constants.NRB.equalsIgnoreCase(carparkDTO.getBayType())) {
					carparkDTO.setBayNo("");
					;
				}
			}
			cardHolder.setCpDetailsList(carparks);
		}
		return cardHolder;

	}

	public static String resetBayNoForNRB(String bayType, String bayNo) {
		return Constants.NRB.equalsIgnoreCase(bayType) ? "" : bayNo;

	}

	public static boolean isActive(CardHoldersDTO cardHolder) {
		if (Constants.STATUS_ACTIVE.equalsIgnoreCase(cardHolder.getCardStatus())
				|| Constants.STATUS_INACTIVE.equalsIgnoreCase(cardHolder.getCardStatus())) {
			if (Constants.STATUS_ACTIVE.equalsIgnoreCase(cardHolder.getCardHolderStatus())) {
				return true;
			}
		}

		return false;

	}

	public static boolean isActive(CardHolderDetails cardHolder) {
		if (Constants.STATUS_ACTIVE.equalsIgnoreCase(cardHolder.getCardStatus())
				|| Constants.STATUS_INACTIVE.equalsIgnoreCase(cardHolder.getCardStatus())) {
			if (Constants.STATUS_ACTIVE.equalsIgnoreCase(cardHolder.getCardHolderStatus())) {
				return true;
			}
		}

		return false;

	}

	public static boolean isCarparkActive(CardHolderDetails cardHolder) {
		if (!cardHolder.getCpDetailsList().isEmpty()) {
			if (Constants.STATUS_ACTIVE.equalsIgnoreCase(cardHolder.getCpDetailsList().get(0).getCarParkStatus())
					|| Constants.STATUS_INACTIVE
							.equalsIgnoreCase(cardHolder.getCpDetailsList().get(0).getCarParkStatus())) {
				return true;
			}
		}
		return false;

	}

	public static boolean isTenancyActive(CardHolderDetails cardHolder) {
		List<Tenancy> tenancies = cardHolder.getTenancyList();
		if (!tenancies.isEmpty()) {
			for (Tenancy tenancy : tenancies) {
				if (Constants.STATUS_ACTIVE.equalsIgnoreCase(tenancy.getBuildingStatus())
						|| Constants.STATUS_INACTIVE.equalsIgnoreCase(tenancy.getBuildingStatus())) {
					return true;
				}
			}

		}
		return false;

	}

	public static boolean isCarparkActive(CardHoldersDTO cardHolder) {
		Set<CarparkDTO> carparks = cardHolder.getSetOfCarparks();
		if (!carparks.isEmpty()) {
			for (CarparkDTO carparkDTO : carparks) {
				if (Constants.STATUS_ACTIVE.equalsIgnoreCase(carparkDTO.getCpStatus())
						|| Constants.STATUS_INACTIVE.equalsIgnoreCase(carparkDTO.getCpStatus())) {
					return true;
				}
			}

		}
		return false;

	}

	public static boolean isTenancyActive(CardHoldersDTO cardHolder) {
		Set<TenanciesDTO> tenancies = cardHolder.getSetOfTenancies();
		if (!tenancies.isEmpty()) {
			for (TenanciesDTO tenancy : tenancies) {
				if (Constants.STATUS_ACTIVE.equalsIgnoreCase(tenancy.getBuildingStatus())
						|| Constants.STATUS_INACTIVE.equalsIgnoreCase(tenancy.getBuildingStatus())) {
					return true;
				}
			}

		}
		return false;

	}
}
