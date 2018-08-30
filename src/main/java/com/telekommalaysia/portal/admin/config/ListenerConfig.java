package com.telekommalaysia.portal.admin.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.request.RequestContextListener;


public class ListenerConfig implements WebApplicationInitializer {
	
	private static final Logger log = LoggerFactory.getLogger(ListenerConfig.class);
	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		log.info("Started listening to session.");
		sc.addListener(new RequestContextListener());
		log.info("Exit listening to session.");
	}
	

}
