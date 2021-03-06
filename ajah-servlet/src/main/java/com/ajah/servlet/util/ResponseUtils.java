/*
 *  Copyright 2012 Eric F. Savage, code@efsavage.com
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
package com.ajah.servlet.util;

import javax.servlet.http.HttpServletResponse;

import com.ajah.util.date.CalendarUnit;

/**
 * Utilities related to HTTP responses.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
public class ResponseUtils {

	/**
	 * Sets the expires header on a response.
	 * 
	 * @param response
	 *            The response to expire, required.
	 * @param quantity
	 *            The quantity of time
	 * @param calendarUnit
	 *            The unit of time
	 */
	public static void setExpires(final HttpServletResponse response, final long quantity, final CalendarUnit calendarUnit) {
		response.setDateHeader("Expires", System.currentTimeMillis() + (calendarUnit.getMillis() * quantity));
	}

}
