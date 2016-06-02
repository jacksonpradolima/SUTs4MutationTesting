/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 19:26:16 GMT 2016
 */

package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Dados_ESTest extends Dados_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 78 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - false
   * Goal 3. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - true
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - true
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - true
   * Goal 6. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 7. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 8. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 9. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 10. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 11. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:NonEmptyArray
   * Goal 12. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 13
   * Goal 13. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 15
   * Goal 14. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 16
   * Goal 15. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 17
   * Goal 16. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 20
   * Goal 17. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 22
   * Goal 18. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 27
   * Goal 19. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 28
   * Goal 20. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 29
   * Goal 21. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 30
   * Goal 22. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 32
   * Goal 23. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 24. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 25. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - InsertUnaryOp Negation
   * Goal 26. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - ReplaceComparisonOperator == -> !=
   * Goal 27. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceConstant - 0 -> 1
   * Goal 28. Weak Mutation 3: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceConstant - 1 -> 0
   * Goal 29. Weak Mutation 4: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> %
   * Goal 30. Weak Mutation 5: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> -
   * Goal 31. Weak Mutation 6: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> *
   * Goal 32. Weak Mutation 7: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> /
   * Goal 33. Weak Mutation 8: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 1 -> 0
   * Goal 34. Weak Mutation 9: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 0
   * Goal 35. Weak Mutation 10: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 1
   * Goal 36. Weak Mutation 11: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> -1
   * Goal 37. Weak Mutation 12: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 3
   * Goal 38. Weak Mutation 13: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> %
   * Goal 39. Weak Mutation 14: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> -
   * Goal 40. Weak Mutation 15: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> *
   * Goal 41. Weak Mutation 16: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> /
   * Goal 42. Weak Mutation 17: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 0 -> 1
   * Goal 43. Weak Mutation 18: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 0
   * Goal 44. Weak Mutation 19: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 1
   * Goal 45. Weak Mutation 20: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> -1
   * Goal 46. Weak Mutation 21: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 6
   * Goal 47. Weak Mutation 22: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 8
   * Goal 48. Weak Mutation 24: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceComparisonOperator != -> <
   * Goal 49. Weak Mutation 28: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 1 -> 0
   * Goal 50. Weak Mutation 29: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 0
   * Goal 51. Weak Mutation 30: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 1
   * Goal 52. Weak Mutation 31: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> -1
   * Goal 53. Weak Mutation 32: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 6
   * Goal 54. Weak Mutation 33: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 8
   * Goal 55. Weak Mutation 35: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceComparisonOperator != -> <
   * Goal 56. Weak Mutation 42: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 1 -> 0
   * Goal 57. Weak Mutation 43: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 0
   * Goal 58. Weak Mutation 44: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 1
   * Goal 59. Weak Mutation 45: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> -1
   * Goal 60. Weak Mutation 46: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 7
   * Goal 61. Weak Mutation 47: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 9
   * Goal 62. Weak Mutation 49: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceComparisonOperator != -> <
   * Goal 63. Weak Mutation 57: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 64. Weak Mutation 58: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 65. Weak Mutation 59: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:28 - ReplaceConstant - 1 -> 0
   * Goal 66. Weak Mutation 60: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:28 - ReplaceConstant - 0 -> 1
   * Goal 67. Weak Mutation 61: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceConstant - 0 -> 1
   * Goal 68. Weak Mutation 62: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceComparisonOperator == -> !=
   * Goal 69. Weak Mutation 63: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp Negation
   * Goal 70. Weak Mutation 64: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp +1
   * Goal 71. Weak Mutation 65: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp -1
   * Goal 72. Weak Mutation 66: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceConstant - 1 -> 0
   * Goal 73. Weak Mutation 67: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceArithmeticOperator + -> %
   * Goal 74. Weak Mutation 68: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceArithmeticOperator + -> -
   * Goal 75. Weak Mutation 69: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceArithmeticOperator + -> *
   * Goal 76. Weak Mutation 70: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceArithmeticOperator + -> /
   * Goal 77. Weak Mutation 71: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:30 - ReplaceConstant - 1 -> 0
   * Goal 78. Weak Mutation 72: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:30 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dados.maximo = (-2657);
      Random.setNextRandom((-1617));
      Dados.tirarDados();
      Dados.debug = true;
      int[] intArray0 = Dados.tirarDados();
      assertArrayEquals(new int[] {1619, 1620}, intArray0);
  }

  //Test case number: 1
  /*
   * 12 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:suma()I
   * Goal 3. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:Negative
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: Line 36
   * Goal 5. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 6. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 7. Weak Mutation 73: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 0 -> 1
   * Goal 8. Weak Mutation 74: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 1 -> 0
   * Goal 9. Weak Mutation 75: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> %
   * Goal 10. Weak Mutation 76: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> -
   * Goal 11. Weak Mutation 77: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> *
   * Goal 12. Weak Mutation 78: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> /
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = (-1601);
      Dados.result = intArray0;
      int int0 = Dados.suma();
      assertEquals((-1601), int0);
  }

  //Test case number: 2
  /*
   * 10 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 3. tirarDados()[I_java.lang.NullPointerException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 13
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 27
   * Goal 6. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 7. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - InsertUnaryOp Negation
   * Goal 8. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - ReplaceComparisonOperator == -> !=
   * Goal 9. Weak Mutation 57: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 10. Weak Mutation 58: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Dados.result = null;
      // Undeclared exception!
      try { 
        Dados.tirarDados();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados", e);
      }
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 3. tirarDados()[I_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 13
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 27
   * Goal 6. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 7. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - InsertUnaryOp Negation
   * Goal 8. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - ReplaceComparisonOperator == -> !=
   * Goal 9. Weak Mutation 57: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 10. Weak Mutation 58: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      Dados.result = intArray0;
      // Undeclared exception!
      try { 
        Dados.tirarDados();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados", e);
      }
  }

  //Test case number: 4
  /*
   * 19 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 3. tirarDados()[I_java.lang.ArithmeticException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 13
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 27
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 28
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 29
   * Goal 8. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 9. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - InsertUnaryOp Negation
   * Goal 10. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - ReplaceComparisonOperator == -> !=
   * Goal 11. Weak Mutation 57: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 12. Weak Mutation 58: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:27 - ReplaceConstant - 0 -> 1
   * Goal 13. Weak Mutation 59: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:28 - ReplaceConstant - 1 -> 0
   * Goal 14. Weak Mutation 60: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:28 - ReplaceConstant - 0 -> 1
   * Goal 15. Weak Mutation 61: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceConstant - 0 -> 1
   * Goal 16. Weak Mutation 62: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - ReplaceComparisonOperator == -> !=
   * Goal 17. Weak Mutation 63: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp Negation
   * Goal 18. Weak Mutation 64: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp +1
   * Goal 19. Weak Mutation 65: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:29 - InsertUnaryOp -1
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Dados.maximo = 0;
      // Undeclared exception!
      try { 
        Dados.tirarDados();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:suma()I
   * Goal 3. suma()I_java.lang.NullPointerException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: Line 36
   * Goal 5. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 6. Weak Mutation 73: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 0 -> 1
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Dados.result = null;
      // Undeclared exception!
      try { 
        Dados.suma();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados", e);
      }
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:suma()I
   * Goal 3. suma()I_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: Line 36
   * Goal 5. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 6. Weak Mutation 73: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 0 -> 1
   */

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[0];
      Dados.result = intArray0;
      // Undeclared exception!
      try { 
        Dados.suma();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados", e);
      }
  }

  //Test case number: 7
  /*
   * 82 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - false
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - true
   * Goal 3. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - false
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - true
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - false
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - true
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - false
   * Goal 8. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I3 Branch 1 IFEQ L13 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 9. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 10. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I28 Branch 2 IF_ICMPNE L17 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 11. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 12. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I41 Branch 3 IF_ICMPNE L20 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 13. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 14. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: I55 Branch 4 IF_ICMPNE L22 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:tirarDados()[I
   * Goal 15. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:NonEmptyArray
   * Goal 16. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 13
   * Goal 17. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 15
   * Goal 18. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 16
   * Goal 19. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 17
   * Goal 20. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 18
   * Goal 21. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 20
   * Goal 22. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 21
   * Goal 23. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 22
   * Goal 24. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 23
   * Goal 25. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I: Line 32
   * Goal 26. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 27. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I
   * Goal 28. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - InsertUnaryOp Negation
   * Goal 29. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:13 - ReplaceComparisonOperator == -> !=
   * Goal 30. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceConstant - 0 -> 1
   * Goal 31. Weak Mutation 3: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceConstant - 1 -> 0
   * Goal 32. Weak Mutation 4: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> %
   * Goal 33. Weak Mutation 5: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> -
   * Goal 34. Weak Mutation 6: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> *
   * Goal 35. Weak Mutation 7: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:15 - ReplaceArithmeticOperator + -> /
   * Goal 36. Weak Mutation 8: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 1 -> 0
   * Goal 37. Weak Mutation 9: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 0
   * Goal 38. Weak Mutation 10: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 1
   * Goal 39. Weak Mutation 11: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> -1
   * Goal 40. Weak Mutation 12: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceConstant - 2 -> 3
   * Goal 41. Weak Mutation 13: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> %
   * Goal 42. Weak Mutation 14: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> -
   * Goal 43. Weak Mutation 15: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> *
   * Goal 44. Weak Mutation 16: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:16 - ReplaceArithmeticOperator + -> /
   * Goal 45. Weak Mutation 17: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 0 -> 1
   * Goal 46. Weak Mutation 18: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 0
   * Goal 47. Weak Mutation 19: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 1
   * Goal 48. Weak Mutation 20: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> -1
   * Goal 49. Weak Mutation 21: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 6
   * Goal 50. Weak Mutation 22: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceConstant - 7 -> 8
   * Goal 51. Weak Mutation 23: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceComparisonOperator != -> -1
   * Goal 52. Weak Mutation 25: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:17 - ReplaceComparisonOperator != -> >
   * Goal 53. Weak Mutation 26: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:18 - ReplaceConstant - 0 -> 1
   * Goal 54. Weak Mutation 27: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:18 - ReplaceConstant - 1 -> 0
   * Goal 55. Weak Mutation 28: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 1 -> 0
   * Goal 56. Weak Mutation 29: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 0
   * Goal 57. Weak Mutation 30: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 1
   * Goal 58. Weak Mutation 31: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> -1
   * Goal 59. Weak Mutation 32: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 6
   * Goal 60. Weak Mutation 33: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceConstant - 7 -> 8
   * Goal 61. Weak Mutation 34: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceComparisonOperator != -> -1
   * Goal 62. Weak Mutation 35: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceComparisonOperator != -> <
   * Goal 63. Weak Mutation 36: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:20 - ReplaceComparisonOperator != -> >
   * Goal 64. Weak Mutation 37: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:21 - ReplaceConstant - 1 -> 0
   * Goal 65. Weak Mutation 38: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:21 - ReplaceConstant - 2 -> 0
   * Goal 66. Weak Mutation 39: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:21 - ReplaceConstant - 2 -> 1
   * Goal 67. Weak Mutation 40: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:21 - ReplaceConstant - 2 -> -1
   * Goal 68. Weak Mutation 41: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:21 - ReplaceConstant - 2 -> 3
   * Goal 69. Weak Mutation 42: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 1 -> 0
   * Goal 70. Weak Mutation 43: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 0
   * Goal 71. Weak Mutation 44: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 1
   * Goal 72. Weak Mutation 45: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> -1
   * Goal 73. Weak Mutation 46: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 7
   * Goal 74. Weak Mutation 47: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceConstant - 8 -> 9
   * Goal 75. Weak Mutation 48: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceComparisonOperator != -> -1
   * Goal 76. Weak Mutation 50: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:22 - ReplaceComparisonOperator != -> >
   * Goal 77. Weak Mutation 51: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 1 -> 0
   * Goal 78. Weak Mutation 52: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 3 -> 0
   * Goal 79. Weak Mutation 53: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 3 -> 1
   * Goal 80. Weak Mutation 54: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 3 -> -1
   * Goal 81. Weak Mutation 55: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 3 -> 2
   * Goal 82. Weak Mutation 56: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.tirarDados()[I:23 - ReplaceConstant - 3 -> 4
   */

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Dados.debug = true;
      Dados.tirarDados();
      Dados.tirarDados();
      Dados.tirarDados();
      Dados.tirarDados();
      int[] intArray0 = Dados.tirarDados();
      assertArrayEquals(new int[] {5, 5}, intArray0);
      
      int[] intArray1 = Dados.tirarDados();
      assertArrayEquals(new int[] {6, 2}, intArray1);
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.<init>()V: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:<init>()V
   * Goal 3. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.<init>()V
   * Goal 4. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.<init>()V
   */

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Dados dados0 = new Dados();
      assertFalse(Dados.debug);
  }

  //Test case number: 9
  /*
   * 12 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados:suma()I
   * Goal 3. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:Positive
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I: Line 36
   * Goal 5. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 6. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I
   * Goal 7. Weak Mutation 73: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 0 -> 1
   * Goal 8. Weak Mutation 74: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceConstant - 1 -> 0
   * Goal 9. Weak Mutation 75: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> %
   * Goal 10. Weak Mutation 76: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> -
   * Goal 11. Weak Mutation 77: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> *
   * Goal 12. Weak Mutation 78: edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados.suma()I:36 - ReplaceArithmeticOperator + -> /
   */

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = Dados.suma();
      assertEquals(0, int0);
  }
}
