package com.telekommalaysia.portal.admin.auditing;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.telekommalaysia.portal.admin.constant.Constants;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public String getCurrentAuditor() {
  	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    return (authentication == null || !authentication.isAuthenticated()) ? Constants.SYSTEM : authentication.getName();
	}

}
