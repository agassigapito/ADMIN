package com.telekommalaysia.portal.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.persist.entity.AdminPortalMessages;
import com.telekommalaysia.portal.admin.service.AdminPortalMessageService;

@RestController 
public class AdminPortalMessageController {

	@Autowired
	AdminPortalMessageService AdminPortalMessageService;
	
	@GetMapping(value="/api/getAdminMessage")
	public List<AdminPortalMessages> getMessages() {
		return AdminPortalMessageService.getMessages();
	}

}
