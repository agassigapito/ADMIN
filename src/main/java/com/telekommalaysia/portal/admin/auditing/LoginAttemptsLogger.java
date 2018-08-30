package com.telekommalaysia.portal.admin.auditing;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.listener.AuditApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import com.telekommalaysia.portal.admin.persist.entity.AuditLogin;
import com.telekommalaysia.portal.admin.service.AuditService;

@Component
public class LoginAttemptsLogger {

	private static final Logger logger = LoggerFactory.getLogger(LoginAttemptsLogger.class);
	
	@Autowired private AuditService auditService;

	@EventListener
	public void auditEventHappened(AuditApplicationEvent auditApplicationEvent) {
		AuditEvent auditEvent = auditApplicationEvent.getAuditEvent();
		logger.info("Principal " + auditEvent.getPrincipal() + " - " + auditEvent.getType());

		WebAuthenticationDetails details = (WebAuthenticationDetails) auditEvent.getData().get("details");
		
		AuditLogin auditLogin = new AuditLogin(auditEvent.getPrincipal(),auditEvent.getType());
				
		if (details != null) {
			logger.info("  Remote IP address: " + details.getRemoteAddress());
			logger.info("  Session Id: " + details.getSessionId());
			logger.info("  Request URL: " + auditEvent.getData().get("requestUrl"));
			auditLogin.setRemoteIpAddress(details.getRemoteAddress());
			auditLogin.setSessionId(details.getSessionId());
			auditLogin.setRequestUrl(auditEvent.getData().get("requestUrl").toString());
		}
		
		auditService.addAudit(auditLogin);


	}
}
