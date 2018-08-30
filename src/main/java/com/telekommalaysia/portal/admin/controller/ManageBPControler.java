package com.telekommalaysia.portal.admin.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.dto.BusinessPartnerDto;
import com.telekommalaysia.portal.admin.dto.BusinessPartnerSoaDto;
import com.telekommalaysia.portal.admin.service.PublicUserService;
import com.telekommalaysia.portal.admin.service.soa.SoaService;

@RestController
public class ManageBPControler {

	// ---------------------------------------------------------------------------------AdminBusinessPartner

	@Autowired
	private PublicUserService userService;

	@Autowired
	private SoaService soaService;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping(value = "/allbusinesspartner")
	public List<BusinessPartnerDto> getUsers() {
			logger.info("Returning all business partners");
			return userService.getAllBPT();
	}

	@PostMapping(value = "/bpdetailedinfo")
	public BusinessPartnerSoaDto getSoa(@RequestBody BusinessPartnerDto dto) {
		String email = dto.getEmail();
		return soaService.retrieveRE(email);
	}

	@PostMapping(value = "/businesspartner/activate")
	public ResponseEntity<?> changeToActive(@RequestBody BusinessPartnerDto dto) {
		if (userService.updateToActive(dto.getEmail(), dto.getLastModifiedBy())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/businesspartner/inactivate")
	public ResponseEntity<?> changeToInactive(@RequestBody BusinessPartnerDto dto) {
		if (userService.updateToInactive(dto.getEmail(), dto.getLastModifiedBy())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/businesspartner/suspend")
	public ResponseEntity<?> changeToSuspended(@RequestBody BusinessPartnerDto dto) {
		if (userService.updateToSuspended(dto.getEmail(), dto.getLastModifiedBy())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/businesspartner/unsuspend")
	public ResponseEntity<?> changeToNonSuspended(@RequestBody BusinessPartnerDto dto) {
		if (userService.updateToNonSuspended(dto.getEmail())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/businesspartner/filter") //
	public List<BusinessPartnerDto> filterUser(@RequestBody BusinessPartnerDto dto) {

		String firstname = dto.getFirstName();
		String lastname = dto.getLastName();
		String email = dto.getEmail();
		String accountType = dto.getAccountType();
		String accountSubType = dto.getAccountSubType();
		Date lastLogonF = dto.getLastLogonF();
		String status = dto.getStatus();
		boolean locked = dto.isLocked();
		boolean suspended = dto.isSuspended();

		return userService.getFilteredBPT(firstname, lastname, email, accountType, accountSubType, lastLogonF, status,
				locked, suspended);
	}

}
