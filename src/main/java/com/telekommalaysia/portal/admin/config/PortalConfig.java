package com.telekommalaysia.portal.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortalConfig {

	@Value("${tmportal.soa.system.api.ip}")
	private String systemsApiIPAddr;

	@Value("${tmportal.soa.process.api.ip}")
	private String processApiIPAddr;

	@Value ("${tmportal.dms.documents.ip}")
	private String dmsServiceDocumentsIPAddr;

	@Value ("${tmportal.dms.document.ip}")
	private String dmsServiceDocumentIPAddr;

	@Value ("${tmportal.env.ip}")
	private String envServiceIPAddr;

	@Value("${tmportal.dms.document.ip.up}")
	private String documentUpIPAddr;

	@Value("${tmportal.dms.document.ip.up.username}")
	private String documentUpIPUsername;

	@Value("${tmportal.dms.document.ip.up.password}")
	private String documentUpIPPassword;

	@Value("${tmportal.dms.document.ip.up.port}")
	private String documentUpIpPortAddr;

	@Value("${server.port}")
	private int serverPort;



	public String getDocumentUpIPUsername() {
		return documentUpIPUsername;
	}

	public void setDocumentUpIPUsername(String documentUpIPUsername) {
		this.documentUpIPUsername = documentUpIPUsername;
	}

	public String getDocumentUpIPPassword() {
		return documentUpIPPassword;
	}

	public void setDocumentUpIPPassword(String documentUpIPPassword) {
		this.documentUpIPPassword = documentUpIPPassword;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public String getDocumentUpIpPortAddr() {
		return documentUpIpPortAddr;
	}

	public void setDocumentUpIpPortAddr(String documentUpIpPortAddr) {
		this.documentUpIpPortAddr = documentUpIpPortAddr;
	}

	public String getDocumentUpIPAddr() {
		return documentUpIPAddr;
	}

	public void setDocumentUpIPAddr(String documentUpIPAddr) {
		this.documentUpIPAddr = documentUpIPAddr;
	}

	public String getEnvServiceIPAddr() {
		return envServiceIPAddr;
	}

	public void setEnvServiceIPAddr(String envServiceIPAddr) {
		this.envServiceIPAddr = envServiceIPAddr;
	}

	public String getDmsServiceDocumentsIPAddr() {
		return dmsServiceDocumentsIPAddr;
	}

	public void setDmsServiceDocumentsIPAddr(String dmsServiceDocumentsIPAddr) {
		this.dmsServiceDocumentsIPAddr = dmsServiceDocumentsIPAddr;
	}

	public String getDmsServiceDocumentIPAddr() {
		return dmsServiceDocumentIPAddr;
	}

	public void setDmsServiceDocumentIPAddr(String dmsServiceDocumentIPAddr) {
		this.dmsServiceDocumentIPAddr = dmsServiceDocumentIPAddr;
	}

	public String getSystemsApiIPAddr() {
		return systemsApiIPAddr;
	}

	public void setSystemsApiIPAddr(String systemsApiIPAddr) {
		this.systemsApiIPAddr = systemsApiIPAddr;
	}

	public String getProcessApiIPAddr() {
		return processApiIPAddr;
	}

	public void setProcessApiIPAddr(String processApiIPAddr) {
		this.processApiIPAddr = processApiIPAddr;
	}


}
