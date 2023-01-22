package com.springAss.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppAss extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] classes = new Class [] {AssServletConfig.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings = new String[] {"/"};
		return mappings;
	}

	

}
