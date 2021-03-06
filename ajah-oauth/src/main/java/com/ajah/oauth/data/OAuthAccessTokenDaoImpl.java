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

import org.springframework.stereotype.Repository;

import com.ajah.oauth.OAuthAccessToken;
import com.ajah.oauth.OAuthAccessTokenId;
import com.ajah.oauth.OAuthProvider;
import com.ajah.spring.jdbc.AbstractAjahDao;
import com.ajah.spring.jdbc.criteria.Criteria;
import com.ajah.spring.jdbc.err.DataOperationException;
import com.ajah.user.UserId;

/**
 * MySQL implementation of {@link OAuthAccessTokenDao}.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
@Repository
public class OAuthAccessTokenDaoImpl extends AbstractAjahDao<OAuthAccessTokenId, OAuthAccessToken, OAuthAccessToken> implements OAuthAccessTokenDao {

	@Override
	public OAuthAccessToken load(final OAuthProvider provider, final UserId userId, final OAuthAccessTokenId oAuthAccessTokenId) throws DataOperationException {
		return find(new Criteria().eq("provider", provider).eq(userId).eq(oAuthAccessTokenId));
	}

}
