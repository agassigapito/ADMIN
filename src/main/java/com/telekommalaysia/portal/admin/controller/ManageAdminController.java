package com.telekommalaysia.portal.admin.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.dto.AdminDTO;
import com.telekommalaysia.portal.admin.dto.ResponseDTO;
import com.telekommalaysia.portal.admin.dto.admin.AdminCreateDto;
import com.telekommalaysia.portal.admin.persist.entity.Admin;
import com.telekommalaysia.portal.admin.persist.entity.AdminAssignedRoles;
import com.telekommalaysia.portal.admin.service.AdminAssignedRolesService;

@RestController
public class ManageAdminController {

	// ---------------------------------------------------------------------------------------------------------------AdminAndSomeRole

	@Autowired
	private AdminAssignedRolesService adminAssignedRolesService;


	@GetMapping(value = "/alladmin")
	public List<Admin> getAllAdminWithRole() {
		return adminAssignedRolesService.getAdmins();

	}

	@PostMapping(value = "/oneadmin")
	public Admin getOneAdminWithRole(@RequestBody AdminDTO dto) {
		return adminAssignedRolesService.getOneAdmin(dto.getId());

	}

	@PostMapping(value="/admin/create")
	public ResponseEntity<ResponseDTO> createAdmin(@RequestBody AdminCreateDto dto) throws ParseException{

		ResponseDTO responseDto = adminAssignedRolesService.createAdmin(dto.getEmail(), dto.getNameOfUser());
		ResponseEntity<ResponseDTO> responseEntity = new ResponseEntity<>(responseDto,responseDto.getResponseStatus());
		return responseEntity;

	}

	@PostMapping(value = "/admin/activate")
	public ResponseEntity<?> changeToActive(@RequestBody AdminDTO dto) {
		if (adminAssignedRolesService.updateToActive(dto.getId(),dto.getLastModifiedBy())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/admin/inactivate")
	public ResponseEntity<?> changeToInactive(@RequestBody AdminDTO dto) {
		if (adminAssignedRolesService.updateToInactive(dto.getId(),dto.getLastModifiedBy())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping(value = "/admin/delete")
	public ResponseEntity<?> deleteAdmin(@RequestBody AdminDTO dto) {
		if (adminAssignedRolesService.deleteAdmin(dto.getId())) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}



	@GetMapping(value="/alladminservices")
	public List<AdminAssignedRoles> getAllAdminServices() {
		return adminAssignedRolesService.getAdminServices();

	}



	@PostMapping(value = "/assignRole")
	public ResponseEntity<?> assignRole(@RequestBody Admin admin) {
		if (adminAssignedRolesService.createAdminService(admin)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}


	//-----------------------------------------------admin filter
	@PostMapping(value = "/admin/filter")
	public Set<Admin> filterAdmin(@RequestBody AdminDTO dto) {
		return adminAssignedRolesService.listOfFilteredAdmin(dto.isStatus(), dto.getEmail(), dto.getFirstName(), dto.getLastName(), dto.getRoles(),dto.getLastLogonF(), dto.getLastModifiedF(), dto.getLastModifiedBy());
	}

}
