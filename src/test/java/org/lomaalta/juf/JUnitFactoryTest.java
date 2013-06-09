/*
 *Copyright (C) 2013  name of Ernest Hill
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA. *
 */
package org.lomaalta.juf;

import java.io.File;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnitFactoryTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private JUnitFactory jUnitFactory;
    private ClassNameMapper classNameMapper;
    private File targetDirectory;

    @Test
    public void constructorThrowsNullPointerExceptionIfClassIsNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Class can not be null.");
        new JUnitFactory(null, classNameMapper, targetDirectory);
    }

    @Test
    public void constructorThrowsNullPointerExceptionIfClassNameMapperIsNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("ClassNameMapper can not be null.");
        new JUnitFactory(String.class, null, targetDirectory);
    }

    @Test
    public void constructorThrowsNullPointerExceptionIfTargetDirectoryIsNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Target directory can not be null.");
        new JUnitFactory(String.class, classNameMapper, null);
    }

    @Before
    public void setUp() {
        classNameMapper = EasyMock.createMock(ClassNameMapper.class);
        targetDirectory = new File("dummy");
    }

}
