/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 17:19:00 GMT 2016
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MissingArgumentException_ESTest extends MissingArgumentException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 11 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Ljava/lang/String;)V
   * Goal 5. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:Null
   * Goal 6. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 7. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 8. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V
   * Goal 9. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 10. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V
   * Goal 11. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = new MissingArgumentException("");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  //Test case number: 1
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Positive
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:True
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:False
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:True
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("", true, "{YK6{,7Dx?#^mI");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setRequired(true);
      Option option1 = missingArgumentException0.getOption();
      assertEquals('\u0000', option1.getValueSeparator());
  }

  //Test case number: 2
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Positive
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:True
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:True
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:True
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setValueSeparator('_');
      Option option1 = missingArgumentException0.getOption();
      assertSame(option1, option0);
  }

  //Test case number: 3
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Positive
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:True
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:True
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:True
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setOptionalArg(true);
      Option option1 = missingArgumentException0.getOption();
      assertTrue(option1.hasLongOpt());
  }

  //Test case number: 4
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Positive
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:True
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:True
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:True
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(64);
      Option option1 = missingArgumentException0.getOption();
      assertSame(option1, option0);
  }

  //Test case number: 5
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Negative
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:False
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:False
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:False
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArg());
  }

  //Test case number: 6
  /*
   * 22 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Negative
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getId()I:Positive
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:False
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 14. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 17. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 18. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 20. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 22. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option("GB1F", "|[Oq#@");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  //Test case number: 7
  /*
   * 21 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 4. Branch org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch in context: org.apache.commons.cli.MissingArgumentException:<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 5. Branch org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: root-Branch in context: org.apache.commons.cli.MissingArgumentException:getOption()Lorg/apache/commons/cli/Option;
   * Goal 6. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:getArgs()I:Zero
   * Goal 7. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArg()Z:False
   * Goal 8. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgName()Z:True
   * Goal 9. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasArgs()Z:False
   * Goal 10. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasLongOpt()Z:False
   * Goal 11. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasOptionalArg()Z:False
   * Goal 12. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:hasValueSeparator()Z:False
   * Goal 13. [Output]: org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;:NonNull:org.apache.commons.cli.Option:isRequired()Z:False
   * Goal 14. org.apache.commons.cli.MissingArgumentException.<init>(Ljava/lang/String;)V: Line 41
   * Goal 15. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 53
   * Goal 16. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: Line 54
   * Goal 17. org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;: Line 65
   * Goal 18. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 19. [METHOD] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   * Goal 20. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   * Goal 21. [METHODNOEX] org.apache.commons.cli.MissingArgumentException.getOption()Lorg/apache/commons/cli/Option;
   */

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option("", "org.apache.commons.cli.MissingArgumentException");
      option0.setArgs(0);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isRequired());
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V: root-Branch
   * Goal 2. <init>(Lorg/apache/commons/cli/Option;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 3. [METHOD] org.apache.commons.cli.MissingArgumentException.<init>(Lorg/apache/commons/cli/Option;)V
   */

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = null;
      try {
        missingArgumentException0 = new MissingArgumentException((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.apache.commons.cli.MissingArgumentException", e);
      }
  }
}
