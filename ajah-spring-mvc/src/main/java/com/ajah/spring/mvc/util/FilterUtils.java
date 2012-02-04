/*
 *  Copyright 2011 Eric F. Savage, code@efsavage.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.ajah.spring.mvc.util;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.Registration;
import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;

/**
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
public class FilterUtils {

	/**
	 * Convenience method for adding a filter to all requests.
	 * 
	 * @see ServletContext#addFilter(String, Class)
	 * @param filterClass
	 *            The class of Filter to instantiate.
	 * @param servletContext
	 */
	public static void add(Class<? extends Filter> filterClass, ServletContext servletContext) {
		FilterRegistration.Dynamic reg = servletContext.addFilter(filterClass.getName(), filterClass);
		reg.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
	}

	/**
	 * Convenience method for adding a filter that is available as a Spring
	 * bean/service to all requests.
	 * 
	 * @see ServletContext#addFilter(String, Class)
	 * @param filterClass
	 *            The class of Filter to instantiate.
	 * @param appContext
	 *            The application context to find the bean in.
	 * @param servletContext
	 * @return The Dynamic Mapping created by this method.
	 */
	public static Dynamic add(Class<? extends Filter> filterClass, ApplicationContext appContext, ServletContext servletContext) {
		Filter filter = appContext.getBean(filterClass);
		FilterRegistration.Dynamic reg = servletContext.addFilter(filterClass.getName(), filter);
		reg.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
		return reg;
	}

	/**
	 * Convenience method for adding a filter that is available as a Spring
	 * bean/service to a servlet.
	 * 
	 * @see ServletContext#addFilter(String, Class)
	 * @param filterClass
	 *            The class of Filter to instantiate.
	 * @param appContext
	 *            The application context to find the bean in.
	 * @param servletContext
	 * @param servletRegistration
	 *            The servlet to add this filter to.
	 * @return The Dynamic Mapping created by this method.
	 */
	public static Dynamic add(Class<? extends Filter> filterClass, ApplicationContext appContext, ServletContext servletContext, Registration servletRegistration) {
		Filter filter = appContext.getBean(filterClass);
		FilterRegistration.Dynamic reg = servletContext.addFilter(filterClass.getName(), filter);
		reg.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), false, servletRegistration.getName());
		return reg;
	}

}
