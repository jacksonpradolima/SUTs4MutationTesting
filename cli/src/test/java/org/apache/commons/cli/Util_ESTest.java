/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 17:32:52 GMT 2016
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 20 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true
   * Goal 2. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - true
   * Goal 3. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I29 Branch 3 IFLE L46 - true
   * Goal 4. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true in context: 
   * Goal 5. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - true in context: 
   * Goal 6. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I29 Branch 3 IFLE L46 - true in context: 
   * Goal 7. [Output]: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:NonEmptyString
   * Goal 8. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 38
   * Goal 9. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 42
   * Goal 10. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 46
   * Goal 11. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 51
   * Goal 12. [METHOD] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 13. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 14. Weak Mutation 0: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:38 - ReplaceComparisonOperator != null -> = null
   * Goal 15. Weak Mutation 1: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - -- -> 
   * Goal 16. Weak Mutation 2: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - 0 -> 1
   * Goal 17. Weak Mutation 4: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceComparisonOperator <= -> ==
   * Goal 18. Weak Mutation 10: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceConstant - - -> 
   * Goal 19. Weak Mutation 11: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceConstant - 0 -> 1
   * Goal 20. Weak Mutation 13: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceComparisonOperator <= -> ==
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens(",-A0[I]tBQNCYS5re");
      assertEquals(",-A0[I]tBQNCYS5re", string0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;_java.lang.NullPointerException_IMPLICIT
   * Goal 2. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 65
   * Goal 3. [METHOD] org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;
   * Goal 4. Weak Mutation 16: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - " -> 
   * Goal 5. Weak Mutation 17: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - 0 -> 1
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.stripLeadingAndTrailingQuotes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 24 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 4 IFLE L65 - false
   * Goal 2. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I20 Branch 5 IFLE L69 - false
   * Goal 3. Branch org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 4 IFLE L65 - false in context: 
   * Goal 4. Branch org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I20 Branch 5 IFLE L69 - false in context: 
   * Goal 5. [Output]: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:NonEmptyString
   * Goal 6. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 65
   * Goal 7. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 67
   * Goal 8. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 69
   * Goal 9. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 71
   * Goal 10. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 73
   * Goal 11. [METHOD] org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;
   * Goal 12. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;
   * Goal 13. Weak Mutation 16: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - " -> 
   * Goal 14. Weak Mutation 17: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - 0 -> 1
   * Goal 15. Weak Mutation 18: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceComparisonOperator <= -> -1
   * Goal 16. Weak Mutation 21: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:67 - ReplaceConstant - 1 -> 0
   * Goal 17. Weak Mutation 22: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:69 - ReplaceConstant - " -> 
   * Goal 18. Weak Mutation 23: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:69 - ReplaceComparisonOperator <= -> -1
   * Goal 19. Weak Mutation 26: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceConstant - 0 -> 1
   * Goal 20. Weak Mutation 27: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceConstant - 1 -> 0
   * Goal 21. Weak Mutation 28: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceArithmeticOperator - -> +
   * Goal 22. Weak Mutation 29: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceArithmeticOperator - -> %
   * Goal 23. Weak Mutation 30: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceArithmeticOperator - -> *
   * Goal 24. Weak Mutation 31: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:71 - ReplaceArithmeticOperator - -> /
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"^>]sA\"\"\"");
      assertEquals("^>]sA\"\"", string0);
  }

  //Test case number: 3
  /*
   * 15 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 4 IFLE L65 - true
   * Goal 2. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I20 Branch 5 IFLE L69 - true
   * Goal 3. Branch org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 4 IFLE L65 - true in context: 
   * Goal 4. Branch org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: I20 Branch 5 IFLE L69 - true in context: 
   * Goal 5. [Output]: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:EmptyString
   * Goal 6. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 65
   * Goal 7. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 69
   * Goal 8. org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;: Line 73
   * Goal 9. [METHOD] org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;
   * Goal 10. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;
   * Goal 11. Weak Mutation 16: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - " -> 
   * Goal 12. Weak Mutation 17: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceConstant - 0 -> 1
   * Goal 13. Weak Mutation 19: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:65 - ReplaceComparisonOperator <= -> ==
   * Goal 14. Weak Mutation 22: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:69 - ReplaceConstant - " -> 
   * Goal 15. Weak Mutation 24: org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(Ljava/lang/String;)Ljava/lang/String;:69 - ReplaceComparisonOperator <= -> ==
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("");
      assertEquals("", string0);
  }

  //Test case number: 4
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true
   * Goal 2. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - true
   * Goal 3. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I29 Branch 3 IFLE L46 - false
   * Goal 4. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true in context: 
   * Goal 5. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - true in context: 
   * Goal 6. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I29 Branch 3 IFLE L46 - false in context: 
   * Goal 7. [Output]: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:EmptyString
   * Goal 8. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 38
   * Goal 9. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 42
   * Goal 10. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 46
   * Goal 11. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 48
   * Goal 12. [METHOD] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 13. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 14. Weak Mutation 0: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:38 - ReplaceComparisonOperator != null -> = null
   * Goal 15. Weak Mutation 1: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - -- -> 
   * Goal 16. Weak Mutation 2: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - 0 -> 1
   * Goal 17. Weak Mutation 4: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceComparisonOperator <= -> ==
   * Goal 18. Weak Mutation 10: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceConstant - - -> 
   * Goal 19. Weak Mutation 11: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceConstant - 0 -> 1
   * Goal 20. Weak Mutation 12: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:46 - ReplaceComparisonOperator <= -> -1
   * Goal 21. Weak Mutation 15: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:48 - ReplaceConstant - 1 -> 0
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("-");
      assertEquals("", string0);
  }

  //Test case number: 5
  /*
   * 18 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true
   * Goal 2. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - false
   * Goal 3. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - true in context: 
   * Goal 4. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 2 IFLE L42 - false in context: 
   * Goal 5. [Output]: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:EmptyString
   * Goal 6. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 38
   * Goal 7. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 42
   * Goal 8. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 44
   * Goal 9. [METHOD] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 10. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 11. Weak Mutation 0: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:38 - ReplaceComparisonOperator != null -> = null
   * Goal 12. Weak Mutation 1: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - -- -> 
   * Goal 13. Weak Mutation 2: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceConstant - 0 -> 1
   * Goal 14. Weak Mutation 3: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:42 - ReplaceComparisonOperator <= -> -1
   * Goal 15. Weak Mutation 6: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:44 - ReplaceConstant - 2 -> 0
   * Goal 16. Weak Mutation 7: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:44 - ReplaceConstant - 2 -> 1
   * Goal 17. Weak Mutation 8: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:44 - ReplaceConstant - 2 -> -1
   * Goal 18. Weak Mutation 9: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:44 - ReplaceConstant - 2 -> 3
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("--");
      assertEquals("", string0);
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * Goal 1. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - false
   * Goal 2. Branch org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L38 - false in context: 
   * Goal 3. [Output]: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:Null
   * Goal 4. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 38
   * Goal 5. org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;: Line 40
   * Goal 6. [METHOD] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 7. [METHODNOEX] org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;
   * Goal 8. Weak Mutation 0: org.apache.commons.cli.Util.stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;:38 - ReplaceComparisonOperator != null -> = null
   */

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens((String) null);
      assertNull(string0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.apache.commons.cli.Util.<init>()V: root-Branch
   * Goal 2. Branch org.apache.commons.cli.Util.<init>()V: root-Branch in context: 
   * Goal 3. [METHOD] org.apache.commons.cli.Util.<init>()V
   * Goal 4. [METHODNOEX] org.apache.commons.cli.Util.<init>()V
   */

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Util util0 = new Util();
  }
}
