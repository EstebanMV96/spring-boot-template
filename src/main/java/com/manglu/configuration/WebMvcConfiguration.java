package com.manglu.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.manglu.component.RequestTimeInterceptor;






@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{
	
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor rti;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(rti);
	}
	
	// UNCOMMENT THIS LINES IF YOU NEED REDIRECT ALL TRAFFIC FROM 80 PORT TO 443 PORT
	
//	@Bean
//    public ServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        tomcat.addAdditionalTomcatConnectors(redirectConnector());
//        return tomcat;
//    }
//
//    private Connector redirectConnector() {
//        Connector connector = new Connector(
//                TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
//        connector.setScheme("http");
//        connector.setPort(80);
//        connector.setSecure(false);
//        connector.setRedirectPort(443);
//        return connector;
//    }
	
	
	

}
