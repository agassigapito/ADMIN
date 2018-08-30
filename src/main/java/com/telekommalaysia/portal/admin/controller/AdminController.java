package com.telekommalaysia.portal.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.dto.AdminDTO;
import com.telekommalaysia.portal.admin.service.AdminService;

import io.swagger.annotations.ApiParam;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping(value = "/admin/landing")
	public ResponseEntity<?> getAdminPermissions(
			@ApiParam(value = "refer to portal DB for userID's", required = true) @RequestParam String userId) {
		AdminDTO newAdminDTO = new AdminDTO();

		if (!StringUtils.isEmpty(adminService.getAdminDTO(userId))) {
			newAdminDTO = adminService.getAdminDTO(userId);
			newAdminDTO.setsAMAccountName(userId);
			ResponseEntity<?> responseEntity = new ResponseEntity<>(newAdminDTO, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

}
