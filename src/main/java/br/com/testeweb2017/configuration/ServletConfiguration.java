package br.com.testeweb2017.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppWebConfiguration.class, JPAConfig.class, JpaProducaoConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	//@Override
	//public void onStartup(ServletContext servletContext) throws ServletException {
	//	super.onStartup(servletContext);
	//	servletContext.addListener(RequestContextListener.class);
	//	servletContext.setInitParameter("spring.profile.active", "prod");
	//}
}
