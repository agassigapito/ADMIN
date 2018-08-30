package com.telekommalaysia.portal.admin.constant;

public interface Constants {

	int DEFAULT_PAGE_SIZE = 10;
	int DEFAULT_PAGE_NO = 0;
	String DEFAULT_ENCODING = "UTF-8";
	String IMAGE_TYPE = "jpg";
	String USER = "USER";
	String APP_PDF = "application/pdf";
	String SUPPORT_EMAIL = "support";
	String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";
	String NO_REPLY = "no-reply@gmail.com";
	String SYSTEM = "SYSTEM";
	String AUTHORITIES_KEY = "auth";
	String AUTHORIZATION_HEADER = "Authorization";
	String BEARER = "Bearer ";
	String[] COOKIES = { "JSESSIONID", "XSRF-TOKEN", AUTHORIZATION_HEADER };
	String[] IGNORE_CSRF_ANT_MATCHERS = { "/static/**", "/home/**", "/views/**", "/images/**", "/report/**",
			"/favicon.ico", "/webjars/**", "/swagger-resources/**", "/v2/**", "/api/**" };
	String[] IGNORE_WEB_ANT_MATCHERS = { "/static/**", "/home/**", "/views/**", "/images/**", "/report/**",
			"/favicon.ico" };

	int REST_API_PORT = 80;
	String REST_API_DOMAIN = "localhost";
	String SCHEME = "http";
	String REST_API_URL = SCHEME + "://" + REST_API_DOMAIN + ":" + REST_API_PORT;
	String ADMIN = "ADMIN";

	String SECRET = "12345678abcdefghijklmn";
	long EXPIRATION_TIME = 6000000; // 100 minutes
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_STRING = "Authorization";
	String SIGN_IN_URL = "/portallogin";
	String NEW_CUSTOMER = "/api/newcustomer/**";
	String PASSWORD_RESET = "/api/resetpassword/email_reset";
	String PASSWORD_SUCCESS = "/api/resetpassword/process";
	String VERIFY = "/api/new-user-verify/**";
	String VERIFYEXIST = "/api/exist-user-verify/**";
	String FAILED = "/api/failedlogin";
	String SWAGGER = "/swagger-ui.html#*";
	String IFRAME = "/api/payment**";
	String LOV = "http://10.2.21.141:8089/api/lov/**";
	String TEST = "/**s";

	String ISSUANCE_COUNTRY = "Issuance Country";
	String PASSPORT = "Passport";
	String NRIC = "NRIC";
	Integer NRIC_INT_VAL = 1;
	Integer PASSPORT_INT_VAL = 2;
	String CONTRACT_TYPE_INDIVIDUAL = "Z005";
	String CONTRACT_TYPE_CORPORATE = "Z004";

	String PORTAL_DATE_FORMAT = "dd/MM/yyyy";

	String STATUS_REFUND_APPLICABLE = "Applicable For Refund";
	String STATUS_NOT_APPLICABLE_FOR_REFUND = "Not applicable For Refund";
	String STATUS_REFUNDED = "Refunded";

	String ID_TYPE_NRIC = "NRIC";
	String ID_TYPE_PASSPORT = "Passport";

	String LOV_BUILDING = "Building Shortcut";
	String LOV_ISSUANCE_COUNTRY = "Issuance Country";
	String LOV_CAR_BRAND = "Brand";
	String LOV_COUNTRY = "Country Code";
	String LOV_STATE = "State";

	String PROPERTY_KEY = "key";
	String PROPERTY_VALUE = "value";

	String ENTRY_METHOD = "Entry Method: ";
	String EXIT_METHOD = "Exit Method: ";

	String MY_TIME_ZONE = "Asia/Malaysia";
	String STATUS_ACTIVE = "Active";
	String STATUS_INACTIVE = "Inactive";
	String STATUS_C = "c";
	String ZERO_DATE = "0000-00-00";
	String SESSION_TOKEN = "SessionToken";

	// Cofig Table
	String BAY_PRICE_GETTER = "Bay Price Getter";
	Integer BAY_PRICE_GETTER_ID = 10;
	Integer SESSION_MANAGEMENT_ID = 11;
	Integer ADMIN_SESSION_MANAGEMENT_ID = 12;
	String IS_ON = "1";
	String NRB = "nrb";
	// Time Constants
	String LOCAL_TIME_ZERO = "00:00";

	// Portal Transaction Log
	String SMARTCARD_REPLACEMENT = "SMARTCARD REPLACEMENT";

	// Smartcard Replacement
	String FAULTY = "Faulty";

	// Public user
	Integer MAX_ATTEMPTS = 3;
}
