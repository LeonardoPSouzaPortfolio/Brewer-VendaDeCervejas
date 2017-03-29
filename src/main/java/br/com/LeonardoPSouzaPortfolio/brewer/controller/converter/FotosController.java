package br.com.LeonardoPSouzaPortfolio.brewer.controller.converter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotos")
public class FotosController {

	@PostMapping
	public String upload(@RequestParam("files[]") MultipartFile[] files) {
		System.out.println(">>> files: " + files[0].getSize());
		return "Ok!";
	}
	
}