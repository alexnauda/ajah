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
package test.ajah.email.velocity;

import org.junit.Assert;
import org.junit.Test;

import com.ajah.email.velocity.VelocityEmailMessage;
import com.ajah.util.data.format.EmailAddress;

/**
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
public class VelocityEmailMessageTest {

	/**
	 * Tests that a simple text email is working, no model used.
	 */
	@Test
	public static void basicEmail() {
		final VelocityEmailMessage vem = new VelocityEmailMessage(new EmailAddress("nobody@nobody.com"), new EmailAddress[] { new EmailAddress("someone@somewhere.com") });
		vem.setTextTemplate("/templates/email/simple.txt.vm");
		Assert.assertEquals(vem.getText(), "HELLO");
	}

}
