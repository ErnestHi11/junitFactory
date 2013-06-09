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

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SimpleClassNameMapperTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private SimpleClassNameMapper simpleClassNameMapper;

    @Test
    public void getTestClassNameReturnsSimpleClassNameWithTestAppended() {
        assertThat(simpleClassNameMapper.getTestClassName(String.class),
                Is.is(String.class.getSimpleName() + "Test"));
    }

    @Test
    public void getTestClassNameThrowsNullPointerExceptionWhenClassIsNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Class can not be null.");
        simpleClassNameMapper.getTestClassName(null);
    }

    @Before
    public void setUp() {
        simpleClassNameMapper = new SimpleClassNameMapper();
    }
}
