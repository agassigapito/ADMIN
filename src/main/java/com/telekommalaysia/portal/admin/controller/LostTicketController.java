package com.telekommalaysia.portal.admin.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.constant.Constants;
import com.telekommalaysia.portal.admin.dto.LostTicketDTO;
import com.telekommalaysia.portal.admin.dto.ParkingFeeDTO;
import com.telekommalaysia.portal.admin.dto.ReferenceNoDTO;
import com.telekommalaysia.portal.admin.dto.TotalFeeDTO;
import com.telekommalaysia.portal.admin.model.soa.LostTicketLog;
import com.telekommalaysia.portal.admin.service.LostTicketService;

import io.swagger.annotations.ApiParam;

@RestController
public class LostTicketController {
	
	@Autowired
	LostTicketService lostTicketService;
	
	@GetMapping(value = "/lost-ticket")
	public ResponseEntity<?> getLostTickets() {
		return new ResponseEntity<>(lostTicketService.getLostTicketLogList(), HttpStatus.OK);
	}

	@PostMapping(value = "/lost-ticket/save")
	public ResponseEntity<?> saveLostTicketLog(@RequestBody LostTicketLog lostTicketLog) {
		LostTicketDTO lostTicketDto = lostTicketService.save(lostTicketLog);
		
		if(lostTicketDto != null) {
			return new ResponseEntity<>(lostTicketDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping(value = "/lost-ticket/refund")
	public ResponseEntity<?> refundTicketLog(@RequestBody LostTicketLog lostTicketLog) {
		LostTicketDTO lostTicketDto = lostTicketService.refund(lostTicketLog);
		
		if(lostTicketDto != null) {
			return new ResponseEntity<>(lostTicketDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/lost-ticket/{referenceNo}")
	public ResponseEntity<?> getLostTicketLog(@PathVariable String referenceNo) {
		LostTicketDTO lostTicketDto = lostTicketService.getLostTicketLog(referenceNo);
		
		if(lostTicketDto != null) {
			return new ResponseEntity<>(lostTicketDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/parking-fee")
	public ResponseEntity<?> getParkingFee(
			@ApiParam(value = "Uptown 1", required = true) @RequestParam String building,
			@ApiParam(value = "Standard", required = true) @RequestParam String parkingType,
			@ApiParam(value = "Weekday", required = true) @RequestParam String parkingRate,
			@ApiParam(value = "2018-03-21 10:23:23", required = true) @RequestParam String dateTimeIn,
			@ApiParam(value = "2018-03-21 12:00:00", required = true) @RequestParam String receiptTimeStamp) {
		
		ParkingFeeDTO parkingFeeDto = lostTicketService.getParkingFee(building, parkingType, parkingRate, dateTimeIn, receiptTimeStamp);
		
		if(parkingFeeDto != null) {
			return new ResponseEntity<>(parkingFeeDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/lost-ticket/total-fee")
	public ResponseEntity<?> getTotal(
			@ApiParam(value = "Uptown 1", required = true) @RequestParam String levyFee,
			@ApiParam(value = "Uptown 1", required = true) @RequestParam String parkingFee) {
		
		TotalFeeDTO totalFeeDto = lostTicketService.getTotal(levyFee, parkingFee);
		
		if(totalFeeDto != null) {
			return new ResponseEntity<>(totalFeeDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/lost-ticket/building")
	public ResponseEntity<?> getBuildingList() {
		
		Set<String> buildingList = lostTicketService.getListOfValues(Constants.LOV_BUILDING, Constants.PROPERTY_KEY);
		
		if(buildingList != null) {
			return new ResponseEntity<>(buildingList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/issuance-country")
	public ResponseEntity<?> getIssuanceCountryList() {
		Set<String> countryList = lostTicketService.getListOfValues(Constants.LOV_ISSUANCE_COUNTRY, Constants.PROPERTY_VALUE);
		
		if(countryList != null) {
			return new ResponseEntity<>(countryList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/car-brand")
	public ResponseEntity<?> getCarBrandList() {
		Set<String> carBrandList = lostTicketService.getListOfValues(Constants.LOV_CAR_BRAND, Constants.PROPERTY_VALUE);
		
		if(carBrandList != null) {
			return new ResponseEntity<>(carBrandList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/country")
	public ResponseEntity<?> getCountryList() {
		Set<String> countryList = lostTicketService.getListOfValues(Constants.LOV_COUNTRY, Constants.PROPERTY_VALUE);
		
		if(countryList != null) {
			return new ResponseEntity<>(countryList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/state")
	public ResponseEntity<?> getStateList() {
		Set<String> stateList = lostTicketService.getListOfValues(Constants.LOV_STATE, Constants.PROPERTY_VALUE);
		
		if(stateList != null) {
			return new ResponseEntity<>(stateList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/lost-ticket/reference-generator")
	public ResponseEntity<?> generateReferenceNo() {
		ReferenceNoDTO refNoDTO = lostTicketService.generateReferenceNo();
		
		if(refNoDTO != null) {
			return new ResponseEntity<>(refNoDTO, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}
