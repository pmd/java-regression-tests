// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java17;

public class LocalVars {
    
    public void aMethod() {
        String sealed = null;

        sealed = this.getClass().getName();

        // error: sealed or non-sealed local classes are not allowed
        // sealed class LocalSealedClass {}
    }
}
