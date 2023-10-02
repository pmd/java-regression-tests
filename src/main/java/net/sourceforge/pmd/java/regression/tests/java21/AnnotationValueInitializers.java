// SPDX-License-Identifier: BSD-3-Clause
package net.sourceforge.pmd.java.regression.tests.java21;

/*
 * Tests parsing after supporting String Templates. "}" is ambiguous.
 */

@MyAnnotation(a = { "a" }, b = "b") // "}" might be recognized as STRING_TEMPLATE_END, but it is not
class AnnotationValueInitializers { }

@MyAnnotation(a = { "a" }, b = "#b") // "}" might be recognized as STRING_TEMPLATE_END, but it is not
class AnnotationValueInitializers2 { }
