// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java16;

public class NonSealedIdentifier {
    public static void main(String[] args) {
        int result = 0;
        int non = 1;
        // sealed is a valid identifier name in both Java16 and Java16 Preview
        int sealed = 2;
        // non-sealed is a valid subtraction expression in both Java16 and Java16 Preview
        result = non-sealed;
        System.out.println(result);
    }
}
