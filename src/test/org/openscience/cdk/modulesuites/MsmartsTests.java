/* $Revision$ $Author$ $Date$    
 * 
 * Copyright (C) 2007  Egon Willighagen <egonw@users.sf.net
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA. 
 */
package org.openscience.cdk.modulesuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openscience.cdk.coverage.SmartsCoverageTest;
import org.openscience.cdk.isomorphism.SMARTSTest;
import org.openscience.cdk.smiles.smarts.SMARTSQueryToolTest;
import org.openscience.cdk.smiles.smarts.parser.ParserTest;
import org.openscience.cdk.smiles.smarts.parser.RecursiveTest;
import org.openscience.cdk.smiles.smarts.parser.SMARTSSearchTest;
import org.openscience.cdk.smiles.smarts.parser.visitor.SmartsDumpVisitorTest;
import org.openscience.cdk.smiles.smarts.parser.visitor.SmartsQueryVisitorTest;

/**
 * TestSuite that runs all the sample tests for experimental classes.
 *
 * @cdk.module test-smarts
 */
@RunWith(value=Suite.class)
@SuiteClasses(value={
    SmartsCoverageTest.class,
    SMARTSTest.class,
    ParserTest.class,
    SMARTSSearchTest.class,
    RecursiveTest.class,
    SmartsDumpVisitorTest.class,
    SmartsQueryVisitorTest.class,
    SMARTSQueryToolTest.class
})
public class MsmartsTests {}
