package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class PageController {
	@Autowired
	ApplicationContext context;
	@RequestMapping(value = "/")
	public String init() {
		return "index";
	}
	

//	@RequestMapping(value = "/dev")
//	public String init() {
//		return "index";
//	}
//	@RequestMapping(value = "/test")
//	public String init() {
//		return "index";
//	}
//
//	@RequestMapping(value = "/api")
//	public String api(Model model) throws IOException {
//		// 取得/templates/layout/api底下所有html檔
//		final Resource[] resources = context.getResources("classpath*:templates/layout/api/*");
//		final Set<String> filePaths = findInputFileNames(resources);
//		model.addAttribute("htmlList", filePaths);
//		return "api";
//	}

	public Set<String> findInputFileNames(final Resource[] inputDirectoryResources) throws IOException {
		return Arrays.stream(inputDirectoryResources)
				.map(resource -> extractURI(resource))
				.collect(Collectors.toSet());
	}

	private String extractURI(Resource resource) {
		return resource.getFilename();
	}

}
