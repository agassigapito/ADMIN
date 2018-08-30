package com.telekommalaysia.portal.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.dto.faultycard.FaultySmartCardDTO;
import com.telekommalaysia.portal.admin.dto.faultycard.IFaultyCardSaveDTO;
import com.telekommalaysia.portal.admin.model.soa.ResponseStatusWrapper;
import com.telekommalaysia.portal.admin.model.soa.smartcard.SmartCardRequestDTO;
import com.telekommalaysia.portal.admin.persist.entity.FaultySmartCard;
import com.telekommalaysia.portal.admin.service.FaultySmartCardService;
import com.telekommalaysia.portal.admin.service.soa.SmartCardProcessApiService;
import com.telekommalaysia.portal.admin.service.util.StatusMessageService;
import com.telekommalaysia.portal.admin.persist.entity.ReferenceTable;
import com.telekommalaysia.portal.admin.persist.repository.IReferenceTableRepository;

import io.swagger.annotations.ApiParam;

@RestController
public class FaultySmartCardController {

	@Autowired
	private FaultySmartCardService faultyService;

	@Autowired
	StatusMessageService statusMessageService;

	@Autowired
	private SmartCardProcessApiService smartCardProcessApiService;
	
	@Autowired
	private IReferenceTableRepository referenceTableRepository;

	@GetMapping(value = "/allfaultycards")
	public List<FaultySmartCardDTO>  getAllFaultyCards() {
		return faultyService.getAllFaultySmartCard();
	}

	// @PostMapping(value = "/faulty/smartcard/filter")
	// public List<FaultyCardTableDTO> filterFaultyCard(@RequestBody
	// IFaultyCardTableDTO dto) {
	// return faultyService.listOfFilteredFaultyCards(dto.getStatus(),
	// dto.getRefNo(), dto.getSmartCardNo(),
	// dto.getCompanyName(), dto.getFirstName(), dto.getLastName(), dto.getIdNo(),
	// dto.getDateRaised());
	// }

	@PostMapping(value = "/faulty/smartcard/save")
	public ResponseEntity<?> saveFaultyCards(@RequestBody IFaultyCardSaveDTO dto) {
		if (faultyService.savePendingFaultyCards(dto)) {

			ResponseEntity<?> responseEntity = new ResponseEntity<>(statusMessageService.getSuccessMessage(),
					HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	@PostMapping(value = "/faulty/smartcard/admin/accept")
	public ResponseEntity<?> saveAcceptedFaultyCards(@RequestBody IFaultyCardSaveDTO dto) {
		List<FaultySmartCardDTO> faultyList = faultyService.saveAcceptedFaultyCards(dto);
		if (!(faultyList.size() <= 0)) {

			ResponseEntity<List<FaultySmartCardDTO>> responseEntity = new ResponseEntity<List<FaultySmartCardDTO>>(faultyList,
					HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	@PostMapping(value = "/faulty/smartcard/admin/reject")
	public ResponseEntity<?> saveRejectedFaultyCards(@RequestBody IFaultyCardSaveDTO dto) {

		if (faultyService.saveRejectedFaultyCards(dto)) {

			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	@GetMapping(value = "/faulty/smartcard/search")
	public List<FaultySmartCardDTO> getFaultySmartCardSCMS(
			@ApiParam(value = "NRIC or Passport", required = true) @RequestParam String idType,
			@ApiParam(value = "example: 12345", required = true) @RequestParam String idNumber) {
		return faultyService.getPendingFaultyCard(idType, idNumber);
	}

	@PostMapping(value = "/faulty-smart-card/smart-card/process-api", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseStatusWrapper> initiateSmartCardReplacementProcessApi(
			@RequestBody SmartCardRequestDTO smartCardRequestDTO) {

		return smartCardProcessApiService.postSmartCardReplacementProcessAPI(smartCardRequestDTO);
	}

	@GetMapping(value = "/lov/{type}")
	public List<ReferenceTable> getListOfValues(@PathVariable String type) {
		return referenceTableRepository.findByTypeOrderByValue(type);
	}
}
