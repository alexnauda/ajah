/*
 *  Copyright 2013 Eric F. Savage, code@efsavage.com
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
package com.ajah.oauth.data;

import com.ajah.oauth.OAuthProvider;
import com.ajah.oauth.OAuthToken;
import com.ajah.oauth.OAuthTokenId;
import com.ajah.spring.jdbc.AjahDao;
import com.ajah.spring.jdbc.err.DataOperationException;
import com.ajah.user.UserId;

/**
 * Basic data operations for {@link OAuthToken}.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
public interface OAuthTokenDao extends AjahDao<OAuthTokenId, OAuthToken> {

	/**
	 * Loads a token by its token value.
	 * 
	 * @param provider
	 *            The OAuth provider.
	 * @param userId
	 *            The user seeking to authenticate.
	 * @param oauthToken
	 *            The token value to load.
	 * @return The matching token, if found.
	 * @throws DataOperationException
	 *             If the query could not be executed.
	 */
	OAuthToken load(final OAuthProvider provider, final UserId userId, final String oauthToken) throws DataOperationException;

	/**
	 * Loads a token by its id value.
	 * 
	 * @param provider
	 *            The OAuth provider.
	 * @param userId
	 *            The user seeking to authenticate.
	 * @param oAuthTokenId
	 *            The token ID to load.
	 * @return The matching token, if found.
	 * @throws DataOperationException
	 *             If the query could not be executed.
	 */
	OAuthToken load(final OAuthProvider provider, final UserId userId, final OAuthTokenId oAuthTokenId) throws DataOperationException;

}
