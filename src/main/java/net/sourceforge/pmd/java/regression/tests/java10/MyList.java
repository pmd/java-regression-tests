// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java10;

import java.util.List;

public class MyList {

    public void checkIterator(List<?> other) {
        var oit = other.iterator();
        oit.hasNext();
    }
}
