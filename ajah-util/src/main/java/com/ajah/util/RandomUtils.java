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

import java.util.Random;

/**
 * Utilities for creating random data.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
public class RandomUtils {

	private static Random random = new Random();

	/**
	 * Returns a random number between the from and to parameters.
	 * 
	 * @see Random#nextDouble()
	 * @param from
	 *            The lowest allowable number.
	 * @param to
	 *            The highest allowable number.
	 * @return Random number between from and to.
	 */
	public static long getRandomNumber(long from, long to) {
		return from + (long) (random.nextDouble() * (to - from));
	}

}