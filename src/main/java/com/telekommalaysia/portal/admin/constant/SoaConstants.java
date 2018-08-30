package com.telekommalaysia.portal.admin.constant;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public interface SoaConstants {
	String CONTRACT_TYPE_TENANCY = "Z002";
	String CONTRACT_TYPE_INDIVIDUAL_CP = "Z005";
	String CONTRACT_TYPE_CORPORATE_CP = "Z004";
	String SOA_DATE_FORMAT = "yyyy-MM-dd";
	String CARPARK_COMPANY_CODE = "1060";
	String CARPARK_INFO_BAY_TYPE_NRB = "NRB";
	String QUERY_DATE = ZonedDateTime.now().format(DateTimeFormatter.ofPattern(SOA_DATE_FORMAT));
	// String QUERY_DATE2 =System.currentTimeMillis();
	String CARPARK_INFO_BAY_TYPE_RB = "RB";
	String CARPARK_INFO_BAY_TYPE_SRB = "SRB";
	String USAGE_TYPE_OFFICE = "1";
	String USAGE_TYPE_CARPARK = "5";

	String CARDHOLDER_ID_TYPE_BPNO = "BPNo";
	String CARDHOLDER_ID_TYPE_NRIC = "NRIC";
	String CARDHOLDER_ID_TYPE_PASSPORT = "Passport";

	String CARDHOLDER_REQUEST_ID = "S007";

	String BP_CATEGORY_ORGANIZATION = "2";
}
