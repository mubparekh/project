/*
 * $Header: /cvsroot/saxpath/saxpath/src/java/test/com/werken/saxpath/XPathReaderTest.java,v 1.12 2002/04/26 17:05:34 jstrachan Exp $
 * $Revision: 1.12 $
 * $Date: 2002/04/26 17:05:34 $
 *
 * ====================================================================
 *
 * Copyright (C) 2000-2002 werken digital.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions, and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions, and the disclaimer that follows 
 *    these conditions in the documentation and/or other materials 
 *    provided with the distribution.
 *
 * 3. The name "SAXPath" must not be used to endorse or promote products
 *    derived from this software without prior written permission.  For
 *    written permission, please contact license@saxpath.org.
 * 
 * 4. Products derived from this software may not be called "SAXPath", nor
 *    may "SAXPath" appear in their name, without prior written permission
 *    from the SAXPath Project Management (pm@saxpath.org).
 * 
 * In addition, we request (but do not require) that you include in the 
 * end-user documentation provided with the redistribution and/or in the 
 * software itself an acknowledgement equivalent to the following:
 *     "This product includes software developed by the
 *      SAXPath Project (http://www.saxpath.org/)."
 * Alternatively, the acknowledgment may be graphical using the logos 
 * available at http://www.saxpath.org/
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE SAXPath AUTHORS OR THE PROJECT
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 * ====================================================================
 * This software consists of voluntary contributions made by many 
 * individuals on behalf of the SAXPath Project and was originally 
 * created by bob mcwhirter <bob@werken.com> and 
 * James Strachan <jstrachan@apache.org>.  For more information on the 
 * SAXPath Project, please see <http://www.saxpath.org/>.
 * 
 * $Id: XPathReaderTest.java,v 1.12 2002/04/26 17:05:34 jstrachan Exp $
 */



package com.werken.saxpath;

import junit.framework.TestCase;

import org.saxpath.Axis;
import org.saxpath.Operator;
import org.saxpath.XPathHandler;
import org.saxpath.SAXPathException;
import org.saxpath.XPathSyntaxException;
import org.saxpath.conformance.ConformanceXPathHandler;

public class XPathReaderTest extends TestCase
{
    private ConformanceXPathHandler expected;
    private ConformanceXPathHandler actual;

    private XPathReader reader;
    private String      text;

    private String[] paths = {
        "/foo/bar[@a='1' and @b='2']",
        "/foo/bar[@a='1' and @b!='2']",
        "//attribute::*[.!='crunchy']",
        "'//*[contains(string(text()),'yada yada')]'",
    };

    private String[] bogusPaths = {
        "chyld::foo",
        "foo/tacos()",
        "*:foo",
    };

    public XPathReaderTest(String name)
    {
        super( name );
    }

    public void setUp()
    {
        setReader( new XPathReader() );
        setText( null );

        this.actual   = new ConformanceXPathHandler();
        this.expected = new ConformanceXPathHandler();
        
        getReader().setXPathHandler( actual() );
    }

    public void tearDown()
    {
        setReader( null );
        setText( null );
    }

    // --------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------


    public void testPaths()
    {
        XPathReader reader = new XPathReader();

        System.err.println("Valid Expressions");

        for ( int i = 0 ; i < paths.length ; ++i )
        {
            System.err.println("----------------------------------------");
            System.err.println( paths[i] );
            System.err.println("----------------------------------------");
            try
            {
                reader.parse( paths[i] );
            }
            catch (SAXPathException e)
            {
                e.printStackTrace();
                fail( e.getMessage() );
            }
            catch (Exception e)
            {
                fail( e.getMessage() );
            }
        }
    }

    public void testBogusPaths()
    {
        XPathReader reader = new XPathReader();

        System.err.println("Bogus Expressions");

        for ( int i = 0 ; i < bogusPaths.length ; ++i )
        {
            System.err.println("----------------------------------------");
            System.err.println( bogusPaths[i] );
            System.err.println("----------------------------------------");

            try
            {
                reader.parse( bogusPaths[i] );

                fail( "Should have thrown XPathSyntaxException" );
            }
            catch (XPathSyntaxException e)
            {
                // expected and correct
            }
            catch (SAXPathException e)
            {
                fail( e.getMessage() );
            }
            catch (Exception e)
            {
                fail( e.getMessage() );
            }
        }
    }

    public void testValidAxis()
    {
        XPathReader reader = new XPathReader();

        try
        {
            reader.parse( "child::foo" );
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testInvalidAxis()
    {
        XPathReader reader = new XPathReader();

        try
        {
            reader.parse( "chyld::foo" );
            fail( "Should have thrown XPathSyntaxException" );
        }
        catch (XPathSyntaxException e)
        {
            // expected and correct
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
                
    }

    public void testSimpleNameStep()
    {
        try
        {
            setText( "foo" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "foo");
            expected().endNameStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }

    }

    public void testNameStepWithAxisAndPrefix()
    {
        try
        {
            setText( "parent::foo:bar" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startNameStep( Axis.PARENT,
                                      "foo",
                                      "bar");
            expected().endNameStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testNodeStepWithAxis()
    {
        try
        {
            setText( "parent::node()" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startAllNodeStep( Axis.PARENT );

            expected().endAllNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testProcessingInstructionStepWithName()
    {
        try
        {
            setText( "parent::processing-instruction('cheese')" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startProcessingInstructionNodeStep( Axis.PARENT,
                                                           "cheese" );

            expected().endProcessingInstructionNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testProcessingInstructionStepNoName()
    {
        try
        {
            setText( "parent::processing-instruction()" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startProcessingInstructionNodeStep( Axis.PARENT,
                                                           "" );

            expected().endProcessingInstructionNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testAllNodeStep()
    {
        try
        {
            setText( "parent::node()" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startAllNodeStep( Axis.PARENT );

            expected().endAllNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testTextNodeStep()
    {
        try
        {
            setText( "parent::text()" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startTextNodeStep( Axis.PARENT );

            expected().endTextNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testCommentNodeStep()
    {
        try
        {
            setText( "parent::comment()" );

            getReader().setUpParse( getText() );

            getReader().step( true );

            expected().startCommentNodeStep( Axis.PARENT );

            expected().endCommentNodeStep();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testRelativeLocationPath()
    {
        try
        {
            setText( "foo/bar/baz" );

            getReader().setUpParse( getText() );

            getReader().locationPath( false );

            expected().startRelativeLocationPath();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "foo" );
            expected().endNameStep();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "bar" );
            expected().endNameStep();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "baz" );
            expected().endNameStep();

            expected().endRelativeLocationPath();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testAbsoluteLocationPath()
    {
        try
        {
            setText( "/foo/bar/baz" );

            getReader().setUpParse( getText() );

            getReader().locationPath( true );

            expected().startAbsoluteLocationPath();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "foo" );
            expected().endNameStep();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "bar" );
            expected().endNameStep();

            expected().startNameStep( Axis.CHILD,
                                      "",
                                      "baz" );
            expected().endNameStep();

            expected().endAbsoluteLocationPath();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    public void testNumberPredicate()
    {
        try
        {
            setText( "[1]" );

            getReader().setUpParse( getText() );

            getReader().predicate();

            expected().startPredicate();

            expected().startOrExpr();
            expected().startAndExpr();
            expected().startEqualityExpr();
            expected().startRelationalExpr();
            expected().startAdditiveExpr();
            expected().startMultiplicativeExpr();
            expected().startUnaryExpr();
            expected().startUnionExpr();
            expected().startPathExpr();
            expected().startFilterExpr();

            expected().number(1);

            expected().endFilterExpr();
            expected().endPathExpr();
            expected().endUnionExpr( false);
            expected().endUnaryExpr( Operator.NO_OP );
            expected().endMultiplicativeExpr( Operator.NO_OP );
            expected().endAdditiveExpr( Operator.NO_OP );
            expected().endRelationalExpr( Operator.NO_OP );
            expected().endEqualityExpr( Operator.NO_OP );
            expected().endAndExpr( false );
            expected().endOrExpr( false );

            expected().endPredicate();

            compare();
        }
        catch (SAXPathException e)
        {
            fail( e.getMessage() );
        }
    }

    // --------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------

    private void setText(String text)
    {
        this.text = text;
    }

    private String getText()
    {
        return this.text;
    }

    private void setReader(XPathReader reader)
    {
        this.reader = reader;
    }

    private XPathReader getReader()
    {
        return this.reader;
    }

    private void compare()
    {
        assertEquals( expected(),
                      actual() );
    }

    private ConformanceXPathHandler expected()
    {
        return this.expected;
    }

    private ConformanceXPathHandler actual()
    {
        return this.actual;
    }
}
