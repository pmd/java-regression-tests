// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java16;

/**
 * @see <a href="https://openjdk.java.net/jeps/395">JEP 395: Records</a>
 */
public record Point(int x, int y) {

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("p = " + p);
    }
}
