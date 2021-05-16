package com.example.demo.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	private static String UPLOAD_FOLDER = "E://test//";
	private static String Download_FOLDER="E://download//";
	@GetMapping("/")
	public String index() {
		return "upload";
	}
	@PostMapping("/upload")
	public String upload(@RequestParam("file")MultipartFile file) {
		if(file.isEmpty()) {
			return "upload";
		}
		try {
			byte[] bt=file.getBytes();
			Path path=Paths.get(UPLOAD_FOLDER+file.getOriginalFilename());
			Files.write(path, bt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
	}
	@GetMapping("/download/{filename:.+}")
	@ResponseBody
	public void download(HttpServletRequest req,HttpServletResponse res,@PathVariable("filename")String filename) throws IOException {
		File file=new File(UPLOAD_FOLDER+filename);
		if(file.exists()) {
			String mimeType=URLConnection.guessContentTypeFromName(file.getName());
			if(mimeType==null) {
				mimeType="application/octet-stream";
			}
			res.setContentType(mimeType);
			res.setContentLength((int) file.length());
			res.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));
			InputStream is=new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(is, res.getOutputStream());
		}
		
	}
}
