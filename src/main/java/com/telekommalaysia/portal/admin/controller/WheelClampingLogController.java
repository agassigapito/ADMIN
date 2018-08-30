package com.telekommalaysia.portal.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.telekommalaysia.portal.admin.dto.WheelClampingLogCreationDTO;
import com.telekommalaysia.portal.admin.dto.dms.DmsDocumentDTO;
import com.telekommalaysia.portal.admin.dto.dms.in.DownloadFileDTO;
import com.telekommalaysia.portal.admin.persist.entity.WheelClampingLog;
import com.telekommalaysia.portal.admin.service.WheelClampingLogService;
import com.telekommalaysia.portal.admin.service.util.DmsService;

/**
 * @author agassi.d.h.agapito
 *
 */
@RestController
public class WheelClampingLogController {

	private final Logger logger = LoggerFactory.getLogger(WheelClampingLogController.class);

	@Autowired
	private WheelClampingLogService wheelClampingService;

	@Autowired
	private DmsService dmsService;

	@GetMapping(value = "/admin/wheelclampinglog/findall")
	public ResponseEntity<?> getAllWheelClampingLog(@RequestHeader("SessionToken") String authToken) {
		List<WheelClampingLog> listWheelClampingLog = new ArrayList<>();

		listWheelClampingLog = wheelClampingService.findAllWheelClampingLog();
		if (!listWheelClampingLog.equals(null)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(listWheelClampingLog, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			return responseEntity;
		}
	}

	@GetMapping(value = "/admin/wheelclampinglog/findone/{clampTagNumber}")
	public ResponseEntity<?> getWheelClampingLog(@PathVariable String clampTagNumber) {

		WheelClampingLog wheelClampingLog = new WheelClampingLog();

		wheelClampingLog = wheelClampingService.getWheelClampingLog(clampTagNumber);
		if (wheelClampingLog != null) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(wheelClampingLog, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			return responseEntity;
		}
	}

	@GetMapping(value = "/admin/wheelclampinglog/creation/getdropdownlists")
	public ResponseEntity<?> getDropDownLists() {
		WheelClampingLogCreationDTO wheelClampingLogCreation = new WheelClampingLogCreationDTO();
		wheelClampingLogCreation = wheelClampingService.getWheelClampingLogDropDownLists();

		if (!(wheelClampingLogCreation == null)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(wheelClampingLogCreation, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			return responseEntity;
		}
	}

	@PostMapping(value = "/admin/wheelclampinglog/creation/create")
	public ResponseEntity<?> createWheelClampingLog(@RequestBody WheelClampingLog wheelClampingLog) {
		WheelClampingLog newWheelClampingLog = new WheelClampingLog();
		wheelClampingService.createWheelClampingLog(wheelClampingLog);
		newWheelClampingLog = wheelClampingService.getWheelClampingLog(wheelClampingLog.getClampTagNumber());
		if (newWheelClampingLog != null) {
			ResponseEntity<String> responseEntity = new ResponseEntity<>("Wheel Clamping Log Saved",
					HttpStatus.CREATED);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Error Saving", HttpStatus.BAD_REQUEST);
			return responseEntity;
		}

	}

	@PostMapping(value = "/admin/wheelclampinglog/edit")
	public ResponseEntity<?> editWheelClampingLog(@RequestBody WheelClampingLog wheelClampingLog) {
		if (wheelClampingService.updateWheelClampingLog(wheelClampingLog)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Wheel Clamping Log Saved", HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Error Saving", HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@GetMapping(value = "/admin/wheelclampinglog/edit/getListOfDocuments")
	public ResponseEntity<?> getListOfDmsDocument(String companyCode, String customerNumber, String pageSize,
			String type) {

		ResponseEntity<DmsDocumentDTO> dmsDocumentDTO;
		dmsDocumentDTO = dmsService.getListOfDocuments(companyCode, customerNumber, pageSize, type);
		if (!(dmsDocumentDTO == null)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(dmsDocumentDTO, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Error download", HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@GetMapping(value = "/admin/wheelclampinglog/edit/download")
	public ResponseEntity<?> downloadFile(Integer documentId, String type) {

		ResponseEntity<DownloadFileDTO> downloadFile;
		downloadFile = dmsService.downloadFile(documentId, type);
		if (!(downloadFile == null)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(downloadFile, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Error download", HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	/**
	 * Wheel Clamping Log API to download images from DMS
	 * 
	 * @param companyCode
	 * @param customerNumber
	 * @param pageSize
	 * @param type
	 * @return
	 */
	@GetMapping(value = "/admin/wheelclampinglog/edit/downloadallimages")
	public ResponseEntity<?> downloadAllImages(@RequestParam String companyCode, @RequestParam String customerNumber,
			@RequestParam String pageSize, @RequestParam String type) {

		List<DownloadFileDTO> downloadFiles;
		downloadFiles = dmsService.downloadMultipleWheelClampImages(companyCode, customerNumber, pageSize, type);
		if (!(downloadFiles == null)) {
			ResponseEntity<?> responseEntity = new ResponseEntity<>(downloadFiles, HttpStatus.OK);
			return responseEntity;
		} else {
			ResponseEntity<?> responseEntity = new ResponseEntity<>("Error download", HttpStatus.BAD_REQUEST);
			return responseEntity;
		}
	}

	@PostMapping("/admin/wheelclampinglog/create/uploadfilesmulti")
	public ResponseEntity<?> uploadFilesMulti(@RequestParam("files") MultipartFile[] uploadfiles) {

		logger.debug("Multiple file upload!");

		// Get file name
		String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
				.filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

		if (StringUtils.isEmpty(uploadedFileName)) {
			return new ResponseEntity<>("please select a file!", HttpStatus.OK);
		}

		try {

			dmsService.saveUploadedFiles((Arrays.asList(uploadfiles)));

		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("Successfully uploaded - " + uploadedFileName, HttpStatus.OK);

	}

	@PostMapping("/admin/wheelclampinglog/create/uploadfile")
	public ResponseEntity<?> uploadFile(@RequestParam("files") MultipartFile uploadfile) {

		logger.debug("Single file upload!");

		if (uploadfile.isEmpty()) {
			return new ResponseEntity<>("please select a file!", HttpStatus.OK);
		}

		try {

			dmsService.saveUploadedFiles(Arrays.asList(uploadfile));

		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("Successfully uploaded - " + uploadfile.getOriginalFilename(), new HttpHeaders(),
				HttpStatus.OK);

	}

	/**
	 * Wheel Clamping Log API to upload image to DMS
	 * 
	 * @param multipartFile
	 * @return
	 * @throws IOException
	 */
	@PostMapping("admin/wheelclampinglog/create/uploadimage")
	public String handleFileUpload(@RequestParam("user-file") MultipartFile multipartFile,
			@RequestParam String fileName) throws IOException {

		if (dmsService.uploadImage(multipartFile, fileName)) {
			return "file uploaded";
		}
		return "error";
	}
}
