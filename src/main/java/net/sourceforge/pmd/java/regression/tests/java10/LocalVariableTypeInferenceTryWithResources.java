// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

import java.io.FileInputStream;

public class LocalVariableTypeInferenceTryWithResources {

    public void aMethod() throws Exception {
        String filename = "file.txt";
        try (var in = new FileInputStream(filename)) {

        }
    }
}
