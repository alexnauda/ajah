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
package com.ajah.user.email.data;

import com.ajah.spring.jdbc.AjahDao;
import com.ajah.spring.jdbc.DataOperationResult;
import com.ajah.spring.jdbc.err.DataOperationException;
import com.ajah.user.email.Email;
import com.ajah.user.email.EmailId;

/**
 * Data operations on the "user" table.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
public interface EmailDao extends AjahDao<EmailId, Email> {

	@Override
	DataOperationResult<Email> insert(final Email email);

	/**
	 * Finds an email record by its email address.
	 * 
	 * @param address
	 *            The address to query, required.
	 * @return The matching email, if found.
	 * @throws DataOperationException
	 *             If the query could not be executed
	 */
	Email findByAddress(final String address) throws DataOperationException;

}
