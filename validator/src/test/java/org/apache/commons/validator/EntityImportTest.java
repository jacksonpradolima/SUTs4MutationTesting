/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.validator;

import java.net.URL;
import java.util.Locale;
import org.junit.Ignore;


/**                                                       
 * Tests entity imports.
 *
 * @version $Revision: 1094751 $ $Date: 2011-04-18 23:17:40 +0200 (Mon, 18 Apr 2011) $
 */
@Ignore
public class EntityImportTest extends AbstractCommonTest {

    public EntityImportTest(String name) {
        super(name);
    }

    /**
     * Tests the entity import loading the <code>byteForm</code> form.
     */
    public void testEntityImport() throws Exception {
        URL url = getClass().getResource("EntityImportTest-config.xml");
        ValidatorResources resources = new ValidatorResources(url.toExternalForm());
        assertNotNull("Form should be found", resources.getForm(Locale.getDefault(), "byteForm"));
    }  

    /**
     * Tests loading ValidatorResources from a URL
     */
    public void testParseURL() throws Exception {
        URL url = getClass().getResource("EntityImportTest-config.xml");
        ValidatorResources resources = new ValidatorResources(url);
        assertNotNull("Form should be found", resources.getForm(Locale.getDefault(), "byteForm"));
    }
}
