
package com.mycompany.mavenproject3.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInitialization extends AbstractAnnotationConfigDispatcherServletInitializer{ 
@Override 
protected Class<?>[] getRootConfigClasses() { 
return new Class[] { AppConfig.class }; 
} 

@Override 
protected Class<?>[] getServletConfigClasses() { 
return null; 
} 

@Override 
protected String[] getServletMappings() { 
return new String[] { "/" }; 
} 
}

    

