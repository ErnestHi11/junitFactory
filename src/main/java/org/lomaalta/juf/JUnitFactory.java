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
 *Foundation, Inc.,
 *51 Franklin Street,
 *Fifth Floor,
 *Boston, MA  02110-1301, USA.
 */
package org.lomaalta.juf;

import java.io.File;
import java.util.Objects;

/**
 * This class can be used to generate a JUnit testcase from a given class file.
 * This class will use introspection to examine a given class and will create a
 * JUnit testcase sourcefile that implements a test method for each read/write
 * property.
 *
 * @author Ernest Hill
 *
 */
public class JUnitFactory {

    /**
     * Creates a <code>JUnitFactory</code> that can be used to generate a java
     * source file that implements a JUnit test case for the given
     * <code>Class</code>. The generated source fill will be placed in the
     * directory specified. The class in the generated source file will use the
     * name produced by invoking the the method
     * {@link ClassNameMapper#getTestClassName(Class);}
     *
     * @param aClass
     *            a <code>Class</code> for which Junit testcases will be
     *            generated
     * @param classNameMapper
     *            used to determine the name of the generated class
     * @param targetDirectory
     *            the directory where the generated source file will be placed
     * @exception NullPointerException
     *             will be thrown if Class, ClassNameMapper or targetDirectory
     *             are null
     */
    public JUnitFactory(final Class<?> aClass,
            final ClassNameMapper classNameMapper, final File targetDirectory) {
        Objects.requireNonNull(aClass, "Class can not be null.");
        Objects.requireNonNull(classNameMapper,
                "ClassNameMapper can not be null.");
        Objects.requireNonNull(targetDirectory,
                "Target directory can not be null.");
    }

}
