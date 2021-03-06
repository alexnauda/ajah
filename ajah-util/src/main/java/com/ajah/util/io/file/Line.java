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
package com.ajah.util.io.file;

import java.io.BufferedReader;

/**
 * Represents a line of data that can be accessed as different data types,
 * probably most useful as part of {@link LineIterator}.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
public class Line {

	private final String string;

	/**
	 * Creates a line based on a string of data, like from a
	 * {@link BufferedReader}.
	 * 
	 * @param string
	 *            The line as a string.
	 */
	public Line(final String string) {
		this.string = string;
	}

	/**
	 * Returns the line as a string.
	 * 
	 * @return the line as a string.
	 */
	public String getString() {
		return this.string;
	}

	/**
	 * Returns the line as a string.
	 * 
	 * @return the line as a string.
	 */
	@Override
	public String toString() {
		return this.string;
	}
}
