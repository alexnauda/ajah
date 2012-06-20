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
package com.ajah.rfcmail.fetch;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Base class for fetching mail.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
@Data
public abstract class AbstractMailFetcher implements MailFetcher {

	private final List<MessageHandler> messageHandlers = new ArrayList<>();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addMessageHandler(final MessageHandler messageHandler) {
		this.messageHandlers.add(messageHandler);
	}

	@Override
	public void close() {
		for (final MessageHandler messageHandler : this.messageHandlers) {
			messageHandler.close();
		}
	}

}
