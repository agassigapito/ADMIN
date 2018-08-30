package com.telekommalaysia.portal.admin.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReferencesMappingHandler {
	
	private static ServletContext servletContext;

	@SuppressWarnings("unchecked")
	public static String getFromRefTable(String key, String servletAttribute) {
		Map<String, String> refTableMap = new HashMap<String, String>();
		refTableMap = (Map<String, String>) servletContext.getAttribute(servletAttribute);
		
		String value = "";
		
		if(refTableMap.containsKey(key)) {
			value = refTableMap.get(key);
		}
		
		return value;
	}
	
	@Autowired
	public void setServletContext(ServletContext servletContext) {
		ReferencesMappingHandler.servletContext = servletContext;
	}
}
