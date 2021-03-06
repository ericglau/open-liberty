/*******************************************************************************
 * Copyright (c) 2015, 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi12.fat.tests;

import org.junit.BeforeClass;

public class AroundConstructBeanTest extends AroundConstructTestBase {

    /*
     * (non-Javadoc)
     *
     * @see com.ibm.ws.cdi12.fat.tests.AroundConstructTestBase#getServletName()
     */
    @Override
    protected String getServletName() {
        // TODO Auto-generated method stub
        return "beanTestServlet";
    }

    @BeforeClass
    public static void setUp() throws Exception {
        AroundConstructTestBase.setUp();
    }

}
