// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

public class LocalVariableTypeInference_varAsIdentifier {
    public static void main(String... args) {
        var var = 1;

        System.out.println("var = " + var);
    }
}
