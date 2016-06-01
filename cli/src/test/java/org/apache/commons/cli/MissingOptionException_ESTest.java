/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 17:20:09 GMT 2016
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.cli.MissingOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MissingOptionException_ESTest extends MissingOptionException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 6 covered goals:
   * Goal 1. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch
   * Goal 2. <init>(Ljava/util/List;)V_java.lang.NullPointerException_IMPLICIT
   * Goal 3. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 77
   * Goal 4. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 78
   * Goal 5. [METHOD] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 6. Weak Mutation 0: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:77 - ReplaceConstant - Missing required option -> 
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingOptionException missingOptionException0 = null;
      try {
        missingOptionException0 = new MissingOptionException((List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.apache.commons.cli.MissingOptionException", e);
      }
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. Branch org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: root-Branch in context: org.apache.commons.cli.MissingOptionException:<init>(Ljava/lang/String;)V
   * Goal 4. Branch org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch in context: org.apache.commons.cli.MissingOptionException:getMissingOptions()Ljava/util/List;
   * Goal 5. [Output]: org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;:Null
   * Goal 6. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: Line 43
   * Goal 7. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: Line 66
   * Goal 8. [METHOD] org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V
   * Goal 9. [METHOD] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   * Goal 10. [METHODNOEX] org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V
   * Goal 11. [METHODNOEX] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MissingOptionException missingOptionException0 = new MissingOptionException((String) null);
      List list0 = missingOptionException0.getMissingOptions();
      assertNull(list0);
  }

  //Test case number: 2
  /*
   * 35 covered goals:
   * Goal 1. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - true
   * Goal 4. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true
   * Goal 5. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - false
   * Goal 6. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - true
   * Goal 7. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - false
   * Goal 8. Branch org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch in context: org.apache.commons.cli.MissingOptionException:<init>(Ljava/util/List;)V
   * Goal 9. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - true in context: 
   * Goal 10. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true in context: 
   * Goal 11. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - false in context: 
   * Goal 12. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - true in context: 
   * Goal 13. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - false in context: 
   * Goal 14. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: Line 43
   * Goal 15. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 55
   * Goal 16. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 56
   * Goal 17. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 77
   * Goal 18. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 78
   * Goal 19. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 79
   * Goal 20. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 81
   * Goal 21. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 82
   * Goal 22. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 84
   * Goal 23. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 85
   * Goal 24. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 87
   * Goal 25. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 91
   * Goal 26. [METHOD] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 27. [METHODNOEX] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 28. Weak Mutation 0: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:77 - ReplaceConstant - Missing required option -> 
   * Goal 29. Weak Mutation 1: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceConstant - 1 -> 0
   * Goal 30. Weak Mutation 2: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceComparisonOperator != -> ==
   * Goal 31. Weak Mutation 3: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceConstant - s -> 
   * Goal 32. Weak Mutation 4: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:79 - ReplaceConstant - :  -> 
   * Goal 33. Weak Mutation 5: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:82 - ReplaceComparisonOperator == -> !=
   * Goal 34. Weak Mutation 6: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:85 - ReplaceComparisonOperator == -> !=
   * Goal 35. Weak Mutation 7: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:87 - ReplaceConstant - ,  -> 
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "Y$;>6Sn&w#d1!G6");
      linkedList0.add((Object) "Y$;>6Sn&w#d1!G6");
      MissingOptionException missingOptionException0 = new MissingOptionException((List) linkedList0);
  }

  //Test case number: 3
  /*
   * 36 covered goals:
   * Goal 1. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch
   * Goal 4. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - false
   * Goal 5. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true
   * Goal 6. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - false
   * Goal 7. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - true
   * Goal 8. Branch org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch in context: org.apache.commons.cli.MissingOptionException:getMissingOptions()Ljava/util/List;
   * Goal 9. Branch org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch in context: org.apache.commons.cli.MissingOptionException:<init>(Ljava/util/List;)V
   * Goal 10. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - false in context: 
   * Goal 11. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true in context: 
   * Goal 12. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - false in context: 
   * Goal 13. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I48 Branch 3 IFEQ L85 - true in context: 
   * Goal 14. [Output]: org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;:NonNull:java.util.List:size()I:Positive
   * Goal 15. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: Line 43
   * Goal 16. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 55
   * Goal 17. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 56
   * Goal 18. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 77
   * Goal 19. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 78
   * Goal 20. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 79
   * Goal 21. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 81
   * Goal 22. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 82
   * Goal 23. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 84
   * Goal 24. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 85
   * Goal 25. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 91
   * Goal 26. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: Line 66
   * Goal 27. [METHOD] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 28. [METHOD] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   * Goal 29. [METHODNOEX] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 30. [METHODNOEX] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   * Goal 31. Weak Mutation 0: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:77 - ReplaceConstant - Missing required option -> 
   * Goal 32. Weak Mutation 1: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceConstant - 1 -> 0
   * Goal 33. Weak Mutation 2: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceComparisonOperator != -> ==
   * Goal 34. Weak Mutation 4: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:79 - ReplaceConstant - :  -> 
   * Goal 35. Weak Mutation 5: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:82 - ReplaceComparisonOperator == -> !=
   * Goal 36. Weak Mutation 6: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:85 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "Y$;>6Sn&w#d1!G6");
      MissingOptionException missingOptionException0 = new MissingOptionException((List) linkedList0);
      List list0 = missingOptionException0.getMissingOptions();
      assertEquals(1, list0.size());
  }

  //Test case number: 4
  /*
   * 31 covered goals:
   * Goal 1. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch
   * Goal 2. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch
   * Goal 4. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - true
   * Goal 5. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true
   * Goal 6. Branch org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: root-Branch in context: org.apache.commons.cli.MissingOptionException:getMissingOptions()Ljava/util/List;
   * Goal 7. Branch org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: root-Branch in context: org.apache.commons.cli.MissingOptionException:<init>(Ljava/util/List;)V
   * Goal 8. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I13 Branch 1 IF_ICMPNE L78 - true in context: 
   * Goal 9. Branch org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: I36 Branch 2 IFEQ L82 - true in context: 
   * Goal 10. [Output]: org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;:NonNull:java.util.List:isEmpty()Z:True
   * Goal 11. [Output]: org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;:NonNull:java.util.List:size()I:Zero
   * Goal 12. org.apache.commons.cli.MissingOptionException.<init>(Ljava/lang/String;)V: Line 43
   * Goal 13. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 55
   * Goal 14. org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V: Line 56
   * Goal 15. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 77
   * Goal 16. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 78
   * Goal 17. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 79
   * Goal 18. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 81
   * Goal 19. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 82
   * Goal 20. org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;: Line 91
   * Goal 21. org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;: Line 66
   * Goal 22. [METHOD] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 23. [METHOD] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   * Goal 24. [METHODNOEX] org.apache.commons.cli.MissingOptionException.<init>(Ljava/util/List;)V
   * Goal 25. [METHODNOEX] org.apache.commons.cli.MissingOptionException.getMissingOptions()Ljava/util/List;
   * Goal 26. Weak Mutation 0: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:77 - ReplaceConstant - Missing required option -> 
   * Goal 27. Weak Mutation 1: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceConstant - 1 -> 0
   * Goal 28. Weak Mutation 2: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceComparisonOperator != -> ==
   * Goal 29. Weak Mutation 3: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:78 - ReplaceConstant - s -> 
   * Goal 30. Weak Mutation 4: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:79 - ReplaceConstant - :  -> 
   * Goal 31. Weak Mutation 5: org.apache.commons.cli.MissingOptionException.createMessage(Ljava/util/List;)Ljava/lang/String;:82 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
      List list1 = missingOptionException0.getMissingOptions();
      assertEquals(0, list1.size());
  }
}
