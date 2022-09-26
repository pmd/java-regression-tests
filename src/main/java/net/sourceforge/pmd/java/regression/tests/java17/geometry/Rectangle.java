// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java17.geometry;

/**
 * @see <a href="https://openjdk.java.net/jeps/409">JEP 409: Sealed Classes</a>
 */
public sealed class Rectangle extends Shape 
    permits TransparentRectangle, FilledRectangle { }

