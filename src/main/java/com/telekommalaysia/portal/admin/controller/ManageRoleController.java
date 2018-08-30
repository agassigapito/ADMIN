package com.telekommalaysia.portal.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.dto.ResponseDTO;
import com.telekommalaysia.portal.admin.persist.entity.Permissions;
import com.telekommalaysia.portal.admin.persist.entity.Roles;
import com.telekommalaysia.portal.admin.persist.repository.IPermissionsRepository;
import com.telekommalaysia.portal.admin.persist.repository.IPublicUserRepository;
import com.telekommalaysia.portal.admin.persist.repository.IRolesRepository;
import com.telekommalaysia.portal.admin.service.RolesService;

@RestController
public class ManageRoleController {

	@Autowired
	private IRolesRepository iRolesRepository;

	@Autowired
	private IPermissionsRepository iPermissionsRepository;

	@Autowired
	private RolesService rolesService;

	@GetMapping(value = "/manageRole")
	public List<Roles> listRole() {
		return iRolesRepository.findAll();
	}

	@PostMapping(value = "/createRole")
	public ResponseEntity<?> createRole(@RequestBody Roles role) {
		ResponseDTO responseDto = rolesService.createRole(role);
		ResponseEntity<ResponseDTO> responseEntity = new ResponseEntity<>(responseDto, responseDto.getResponseStatus());

			return responseEntity;

	}

	@PostMapping(value = "/updateRole")
	public ResponseEntity<?> updateRole(@RequestBody Roles role) {
		if (rolesService.updateRole(role)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}
	// @GetMapping(value = "roles/{id}")
	// public Roles get(@PathVariable Integer id) {
	// return rolesRepository.findOne(id);
	// }

	@GetMapping(value = "/managePermissions")
	public List<Permissions> listPerm() {
		return iPermissionsRepository.findAll();
	}

	@GetMapping(value = "/getSingleRole")
	public ResponseEntity<Roles> getSingleRole(@RequestParam Integer id) {
		if (rolesService.getRole(id)) {
			Roles roles = new Roles();
			roles = iRolesRepository.findOne(id);
			ResponseEntity<Roles> responseEntity = new ResponseEntity<>(roles, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<Roles> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	// child delete
	@PostMapping(value = "/deletePermissions")
	public ResponseEntity<?> deleteAssignedPerm(@RequestBody Permissions permissions) {
		Integer id = permissions.getPermissionId();
		if (rolesService.deleteByRoleLinkId(id)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	@PostMapping(value = "/delete/roles/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable Integer id) {

		ResponseDTO responseDto = rolesService.deleteRoleById(id);
		ResponseEntity<ResponseDTO> responseEntity = new ResponseEntity<>(responseDto,responseDto.getResponseStatus());
		return responseEntity;
	}

	@Autowired
	private IPublicUserRepository iPublicUserRepository;

	@PostMapping(value = "/filter")
	public List<Roles> getRolesByStatusAndPermissions(@RequestBody Roles roles) {
		String status = roles.getStatus();
		List<Permissions> permissions = roles.getPermissions();
		List<Roles> rolesList = rolesService.findByStatusAndPermissions(status, permissions);
		return rolesList;
	}
}
