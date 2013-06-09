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
 *Foundation, Inc.
 *51 Franklin Street
 *Fifth Floor,
 *Boston MA  02110-1301, USA.
 */
package org.lomaalta.juf;

/**
 * This interface should be used to get map a class name to the classname of the
 * JUnit test that will be generated.
 *
 * @author Ernest Hill
 *
 */
public interface ClassNameMapper {
    /**
     * Classname to be used for the generated JUnit test.
     * @param aClass the <code>Class</code> for which the test will be generated
     * @return a <code>String</code> containing that name to be used for
     * the generated class
     */
    String getTestClassName(Class<?> aClass);

}
