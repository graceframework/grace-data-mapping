/* Copyright (C) 2010 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.datastore.mapping.document.config

import groovy.transform.CompileStatic

import org.grails.datastore.mapping.config.Property
import org.grails.datastore.mapping.config.SettingsBuilder

/**
 * Configures how a Java property maps to a Document attribute
 *
 * @author Graeme Rocher
 */
@CompileStatic
@SettingsBuilder
class Attribute extends Property {

    void setAttr(String name) {
        setTargetName(name)
    }

    void setAttribute(String name) {
        setTargetName(name)
    }

    void attr(String name) {
        setTargetName(name)
    }

    void attribute(String name) {
        setTargetName(name)
    }

}
