// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java14;

/**
 * @see <a href="https://openjdk.java.net/jeps/361">JEP 361: Switch Expressions (Standard)</a>
 */
public class YieldStatements {
    {
        int a = 0, b = 0, bar = 0, foo = 0, e = 0;
        int yield = 0;
        yield = 2;  // should be an assignment
        this.yield (2); // should be a method call
        this.yield(a,b); // should be a method call


        yield = switch (e) { // must be a switch expr
        case 1 -> {
            this.yield(a,b); // should be a method call
            yield = 2;  // should be an assignment
            yield (2);  // should be a yield statement
        }
        case 2 -> {
            yield++bar; // should be a yield statement (++bar is an expression)
        }
        case 3 -> {
            yield--bar; // should be a yield statement (--bar is an expression)
        }
        case 4 -> {
            yield++;    // should be an increment (not an error)
            yield--;    // should be a decrement (not an error)

            if (true) yield(2);
            else yield 4;
        }
        case 5 -> {
            yield = switch (foo) { // putting a switch in the middles checks the reset behavior
                case 4 -> {yield(5);} // should be a yield statement
                default -> 5;
            };

            this.yield (0);       // should be a method call
            yield (2);      // should be a yield statement
        }
        default -> 0;
        };
    }

    public void yield(int a) {}
    public void yield(int a, int b) {}
}
