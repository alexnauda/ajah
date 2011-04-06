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
package com.ajah.util;

/**
 * Utilities for dealing with Strings.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
public class StringUtils {

	/**
	 * Looks for null or empty strings.
	 * 
	 * @param string
	 *            String to be tested, may be null
	 * @return true if string is null or zero-length
	 */
	public static boolean isBlank(String string) {
		return string == null || string.length() < 1;
	}

	/**
	 * Returns length of string, 0 if null.
	 * 
	 * @param string
	 *            String to be tested, may be null.
	 * @return length of string, 0 if null.
	 */
	public static int safeLength(String string) {
		return string == null ? 0 : string.length();
	}

	/**
	 * Converts camelCase text to regular text.
	 * 
	 * Example: "canOfSoda" converts to "can of soda".
	 * 
	 * Source: <a href=
	 * "http://stackoverflow.com/questions/2559759/how-do-i-convert-camelcase-into-human-readable-names-in-java"
	 * >Stack Overflow</a>
	 * 
	 * @param string
	 * @return String, de-camelcased.
	 */
	public static String splitCamelCase(String string) {
		return string.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	/**
	 * Capitalizes first letter of a String.
	 * 
	 * @see Character#toTitleCase(char)
	 * @param string
	 *            String to capitalized
	 * @return String, capitalized, may be null if null is passed in.
	 */
	public static String capitalize(String string) {
		if (StringUtils.isBlank(string)) {
			return string;
		}
		return Character.toTitleCase(string.charAt(0)) + string.substring(1);
	}

	/**
	 * Returns toString() for the object passed, if it is not null, otherwise
	 * returns null.
	 * 
	 * @see Object#toString()
	 * @param object
	 *            The object to check/toString()
	 * @return object.toString() or null
	 */
	public static String safeToString(Object object) {
		if (object == null) {
			return null;
		}
		return object.toString();
	}

}