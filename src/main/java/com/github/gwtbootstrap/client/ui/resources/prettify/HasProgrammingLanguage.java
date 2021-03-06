/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.resources.prettify;

/**
 * Interface for components that have a programming language property.
 * 
 * @since 2.0.3.0
 * 
 * @author Carlos Alexandro Becker
 * 
 */
public interface HasProgrammingLanguage {

	/**
	 * Sets the programming language.
	 * 
	 * @param programmingLanguage
	 *            the programming language
	 */
	void setLang(String programmingLanguage);
}
