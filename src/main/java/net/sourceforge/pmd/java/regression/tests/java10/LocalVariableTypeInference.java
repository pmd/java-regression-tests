// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

import java.util.ArrayList;

public class LocalVariableTypeInference {

    public void aMethod() {
        var list = new ArrayList<String>();  // infers ArrayList<String>
        var stream = list.stream();          // infers Stream<String>
    }

    public void asMethodParameter() {
        var s = "Java 10";
        print(s);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
