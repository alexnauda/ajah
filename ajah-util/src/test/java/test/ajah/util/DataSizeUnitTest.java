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
package test.ajah.util;

import org.junit.Assert;
import org.junit.Test;

import com.ajah.util.data.DataSizeUnit;

/**
 * Tests {@link DataSizeUnit}.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
public class DataSizeUnitTest {

	/**
	 * Test to make sure basic operations are working.
	 */
	@Test
	public void basicTests() {
		Assert.assertEquals(DataSizeUnit.BIT.getBits() * 8, DataSizeUnit.BYTE.getBits());
	}

}
