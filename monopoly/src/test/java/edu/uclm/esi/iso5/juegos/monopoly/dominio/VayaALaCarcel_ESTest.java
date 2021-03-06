/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 19:46:10 GMT 2016
 */

package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class VayaALaCarcel_ESTest extends VayaALaCarcel_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 21 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - false
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel:<init>(I)V
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - false in context: 
   * Goal 5. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:Positive
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: Line 12
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 15
   * Goal 8. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 16
   * Goal 9. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 17
   * Goal 10. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 11. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I
   * Goal 12. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 13. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I
   * Goal 14. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceVariable j -> propietario
   * Goal 15. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceComparisonOperator == -> !=
   * Goal 16. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:16 - ReplaceVariable j -> propietario
   * Goal 17. Weak Mutation 3: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:17 - ReplaceConstant - 9 -> 0
   * Goal 18. Weak Mutation 4: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:17 - ReplaceConstant - 9 -> 1
   * Goal 19. Weak Mutation 5: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:17 - ReplaceConstant - 9 -> -1
   * Goal 20. Weak Mutation 6: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:17 - ReplaceConstant - 9 -> 8
   * Goal 21. Weak Mutation 7: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:17 - ReplaceConstant - 9 -> 10
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VayaALaCarcel vayaALaCarcel0 = new VayaALaCarcel(2);
      Jugador jugador0 = new Jugador("8#|");
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      Tablero tablero0 = new Tablero();
      jugador0.setTablero(tablero0);
      jugador0.addTarjeta(quedaLibreDeLaCarcel0, 2);
      int int0 = vayaALaCarcel0.operaciones(jugador0);
      assertFalse(jugador0.tieneTarjetaDeSalirDeLaCarcel());
      assertEquals(9, int0);
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - false
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel:<init>(I)V
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - false in context: 
   * Goal 5. operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I_java.lang.NullPointerException_IMPLICIT
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: Line 12
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 15
   * Goal 8. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 16
   * Goal 9. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 10. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I
   * Goal 11. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 12. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceVariable j -> propietario
   * Goal 13. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceComparisonOperator == -> !=
   * Goal 14. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:16 - ReplaceVariable j -> propietario
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VayaALaCarcel vayaALaCarcel0 = new VayaALaCarcel(2);
      Jugador jugador0 = new Jugador("8#|");
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      jugador0.addTarjeta(quedaLibreDeLaCarcel0, 2);
      // Undeclared exception!
      try { 
        vayaALaCarcel0.operaciones(jugador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador", e);
      }
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - true
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel:<init>(I)V
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: I4 Branch 1 IFEQ L15 - true in context: 
   * Goal 5. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:Positive
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V: Line 12
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 15
   * Goal 8. edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I: Line 19
   * Goal 9. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 10. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I
   * Goal 11. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.<init>(I)V
   * Goal 12. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I
   * Goal 13. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceVariable j -> propietario
   * Goal 14. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:15 - ReplaceComparisonOperator == -> !=
   * Goal 15. Weak Mutation 8: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:19 - ReplaceConstant - 10 -> 0
   * Goal 16. Weak Mutation 9: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:19 - ReplaceConstant - 10 -> 1
   * Goal 17. Weak Mutation 10: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:19 - ReplaceConstant - 10 -> -1
   * Goal 18. Weak Mutation 11: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:19 - ReplaceConstant - 10 -> 9
   * Goal 19. Weak Mutation 12: edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;)I:19 - ReplaceConstant - 10 -> 11
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VayaALaCarcel vayaALaCarcel0 = new VayaALaCarcel(1);
      Jugador jugador0 = new Jugador("Compa\uFFFD\uFFFDa de Aguas");
      int int0 = vayaALaCarcel0.operaciones(jugador0);
      assertEquals(10, int0);
  }
}
