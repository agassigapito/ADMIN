package com.telekommalaysia.portal.admin.config;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.telekommalaysia.portal.admin.persist.entity.ApiConfig;
import com.telekommalaysia.portal.admin.persist.entity.ReferenceTable;
import com.telekommalaysia.portal.admin.persist.repository.ApiConfigRepository;
import com.telekommalaysia.portal.admin.persist.repository.IReferenceTableRepository;

@Configuration
public class ApplicationProperties {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private IReferenceTableRepository refTableRepository;

	@Autowired
	private ApiConfigRepository apiConfigRepository;


	@PostConstruct
	public void init() throws SQLException {

		Map<String, String> refTableListMap = new HashMap<String, String>();

		for(ReferenceTable refTable : refTableRepository.findAll()) {
			refTableListMap.put(refTable.getKey(), refTable.getValue());
		}

		servletContext.setAttribute("REFERENCE_TABLE", refTableListMap);

		Map<String, String> urlTableMap = new HashMap<String, String>();

		for(ApiConfig url : apiConfigRepository.findAll()) {
			urlTableMap.put(url.getInterfaceId(), url.getEndpointUrl());
		}

		servletContext.setAttribute("API_CONFIG", urlTableMap);
	}
}
