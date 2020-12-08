package com.sais.cashoffice.CashOfficeTest.paypointmaster.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
	public static final Path templatesLocation = Paths.get("DebitFilesTemplates");
	public static final Path creditFilesLocation = Paths.get("PremiumCredits");
	public static final Path resources = Paths.get("Resources");
	
	public void store(MultipartFile file,Path dirLocation) {
		try {
			System.out.println(file.getOriginalFilename());
			System.out.println(dirLocation.toUri());
			File fileDir=new File(dirLocation.toString());
			if (!fileDir.exists()) {
				boolean createReportDir = fileDir.mkdir();				
			}
			Files.copy(file.getInputStream(), dirLocation.resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			throw new RuntimeException("failed to Save the file to server!");
		}
	}
}
