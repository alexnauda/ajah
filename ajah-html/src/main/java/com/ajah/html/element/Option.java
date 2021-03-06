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
package com.ajah.html.element;

import java.io.IOException;
import java.io.Writer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ajah.util.StringUtils;

/**
 * p element
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Option extends AbstractHtmlCoreElement<Option> {

	private String value;
	private String text;

	/**
	 * Returns "paragraph"
	 * 
	 * @see com.ajah.html.element.AbstractNestableHtmlCoreElement#getName()
	 */
	@Override
	public String getName() {
		return "p";
	}

	@Override
	public Option getThis() {
		return this;
	}

	/**
	 * @see com.ajah.html.HtmlElement#render(java.io.Writer, int)
	 */
	@Override
	public void render(final Writer out, final int depth) throws IOException {
		for (int i = 0; i < depth; i++) {
			out.write("\t");
		}
		out.write("<option value=\"");
		out.write(this.value);
		out.write("\">");
		if (!StringUtils.isBlank(this.text)) {
			out.write(this.text);
		}
		out.write("</option>");
		if (depth >= 0) {
			out.write("\r\n");
		}
	}

	/**
	 * Fluent alias to {@link #setText(String)}.
	 * 
	 * @param newText
	 *            The text to set.
	 * @return The current instance.
	 */
	public Option text(final String newText) {
		setText(newText);
		return this;
	}

}
