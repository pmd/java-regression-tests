// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeInferenceForLoopEnhanced {
    private List<String> data = Arrays.asList("a", "b", "c");

    public void aMethod() {
        for (var s : data) {
            System.out.println(s);
        }
    }
}
