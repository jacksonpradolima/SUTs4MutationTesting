/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 19:31:02 GMT 2016
 */

package edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class NoTieneOpcionDeCompraException_ESTest extends NoTieneOpcionDeCompraException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException.<init>()V: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException:<init>()V
   * Goal 3. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException.<init>()V
   * Goal 4. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException.<init>()V
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoTieneOpcionDeCompraException noTieneOpcionDeCompraException0 = new NoTieneOpcionDeCompraException();
  }
}
