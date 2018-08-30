package com.telekommalaysia.portal.admin.dto.dms.out;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileDTO {

	private String extraField;

	private MultipartFile[] files;

	public String getExtraField() {
		return extraField;
	}

	public void setExtraField(String extraField) {
		this.extraField = extraField;
	}

	public MultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}

	// getters and setters
}