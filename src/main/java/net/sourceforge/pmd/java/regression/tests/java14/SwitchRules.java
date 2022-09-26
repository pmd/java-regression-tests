// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java14;

/**
 *
 * @see <a href="https://openjdk.java.net/jeps/325">JEP 325: Switch Expressions (Preview)</a>
 */
public class SwitchRules {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static void main(String[] args) {
        int day = WEDNESDAY;

        switch (day) {
          case MONDAY, FRIDAY, SUNDAY -> System.out.println("  6");
          case TUESDAY                -> System.out.println("  7");
          case THURSDAY, SATURDAY     -> System.out.println("  8");
          case WEDNESDAY              -> { System.out.println("  9"); }
          default                     -> throw new IllegalArgumentException();
        }
    }
}
