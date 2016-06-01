/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 01 19:27:32 GMT 2016
 */

package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Deuda_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "edu.uclm.esi.iso5.juegos.monopoly.dominio.Deuda"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
            java.lang.System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_45\\jre"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Giovani\\Downloads\\EvoSuite"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Giovani"); 
            java.lang.System.setProperty("java.awt.headless", "true"); 
                                java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Giovani\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.windows.WToolkit"); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("file.separator", "\\"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.Win32GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.awt.windows.WPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "C:\\Users\\Giovani\\AppData\\Local\\Temp\\EvoSuite_pathingJar3154705489151530888.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_45-b14"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_45"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.version", "25.45-b02"); 
    java.lang.System.setProperty("line.separator", "\r\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Windows 8.1"); 
    java.lang.System.setProperty("os.version", "6.3"); 
    java.lang.System.setProperty("path.separator", ";"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Giovani"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Deuda_ESTest_scaffolding.class.getClassLoader() ,
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Pagar",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Suerte",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.BarrioConHipotecaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PartidaYaEmpezadaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneElTurnoException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Tablero",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Carcel",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.HayMenosCasasException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Cobrar",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Calle",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Compania",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Barrio",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadosJugadoresException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.VayaALaCarcel",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.CajaDeComunidad",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Casilla",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaHipotecadaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Estacion",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.CasillaConPrecio",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.Tarjeta",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Deuda",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Parking",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Impuesto",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DebeSaldarLaDeudaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Salida",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.YaEstaHipotecadaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.DemasiadasCasasException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsEdificableException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoPoseeTodoElBarrioException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaEnLaCarcelException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Deuda_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoTieneOpcionDeCompraException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEsElPropietarioException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CapitalInsuficienteException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaHipotecadaException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.PocosJugadoresException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.CasillaNoVendibleException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.Dados",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.NoEstaEnLaCarcelException",
      "edu.uclm.esi.iso5.juegos.monopoly.dominio.excepciones.EstaEdificadaException"
    );
  }
}
