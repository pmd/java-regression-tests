// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

public class LocalVariableTypeInferenceForLoop {

    public void aMethod() {
        for (var i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
