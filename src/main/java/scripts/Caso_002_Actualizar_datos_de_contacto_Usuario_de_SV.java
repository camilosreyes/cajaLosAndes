package scripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;


import Tools.tools;
import pageFactory.pageIndex;
import pageFactory.pageInformacionPersonalAntecendentesFamiliares;
import pageFactory.pageMenuCliente;
import pageFactory.pageInformacionPersonalDatosContacto;

public class Caso_002_Actualizar_datos_de_contacto_Usuario_de_SV {
	
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pageInformacionPersonalDatosContacto objInformacionDatosContacto;
	pageInformacionPersonalAntecendentesFamiliares objAntecedentesFamiliares;
	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_002_Actualizar_datos_de_contacto_Usuario_de_SV";
	String _method = "";
	
	String Caso = "Caso_002_Actualizar_datos_de_contacto_Usuario_de_SV";
	
	boolean continuar = true;
	
	@Test (priority = 0)
	public void ingresoPlataforma(){
		tools = new tools();
		try {
			tools.setUrl("https://misucursal.cajalosandes.cl/webcenter/portal/");
			tools.init();
			System.out.println("Se inicia el paso 1");
			Thread.sleep(500);
			System.out.println("Se llama al proceso de Tools, para cargar el driver");
			Thread.sleep(500);
			System.out.println("Se ejecuto el ChromeDriver e inicia el proceso de ejecucón");
			objIndex = new pageIndex(tools.getDriver());
			System.out.println("Se inicio la plataforma a Automatizar");
			Thread.sleep(2000);
			tools.screenshot("scripts", Caso , "ingresoPlataforma");
			
			Thread.sleep(300);			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
		}
	}
	
	@Test (priority = 1)
	public void ingresoPlataformaLogin(){
		if (continuar) {			
			try {
				System.out.println("Pasamos al paso 2");
				Thread.sleep(500);
				System.out.println("Comenzamos el proceso de ejecucion del caso de pruebas");
				Thread.sleep(500);				
				objIndex.textRut.sendKeys("16.767.568");
				Thread.sleep(500);				
				tools.screenshot("scripts", Caso, "ingresoPlataformaLogin_Rut");
				objIndex.textDv.sendKeys("9");
				Thread.sleep(500);				
				tools.screenshot("scripts", Caso, "ingresoPlataformaLogin_Dv");
				objIndex.textPass.sendKeys("pabSolar88x");
				Thread.sleep(500);
				tools.screenshot("scripts", Caso , "ingresoPlataformaLogin_Pass");
				objIndex.btnIngresar.click();
				Thread.sleep(2000);				
				tools.screenshot("scripts", Caso, "ingresoPlataformaLogin_PresionarBoton");
				System.out.println("Se captura imagen del paso, del caso de prueba");
				Thread.sleep(4000);
				
			} catch (Exception e) {
				continuar = false;
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	@Test (priority = 2)
	public void visualizarInicioCliente(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				Thread.sleep(1000);
				System.out.println("El caso ha finalizado, comienza a respaldar el ultimo paso");
				tools.screenshot("scripts", Caso, "cerrarBrowser");
				System.out.println("Se captura imagen del paso, del caso de prueba");
				Thread.sleep(2000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}	
	}	
		
		@Test (priority = 3)
		public void ingresoModuloMisDatos(){
			if (continuar) {			
				try {	
					objMenuCliente = new pageMenuCliente(tools.getDriver());
					objInformacionDatosContacto = new pageInformacionPersonalDatosContacto(tools.getDriver());
					
					System.out.println("Pasamos al paso 4");
					Thread.sleep(1000);
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					System.out.println("Se captura imagen del paso, del caso de prueba");
					Thread.sleep(2000);
					objMenuCliente.linkMisDatos.click();
					System.out.println("Ingreso al modulo mis datos");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					Thread.sleep(2000);
					
					
				} catch (Exception e) {
					tools.skipScript(e);
				}
			}else {			
				tools.skipPreviousMethod();
			}	
			
			
	}
		
		@Test (priority = 4)
		public void accederMenuModificarDatoscliente(){
			if (continuar) {			
				try {	

					System.out.println("Ingreso a actualizar datos");
					objInformacionDatosContacto.btnActualizarDatos.click();
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					Thread.sleep(5000);
					
				} catch (Exception e) {
					tools.skipScript(e);
				}
			}else {			
				tools.skipPreviousMethod();
			}		
		}
		
		@Test (priority = 5)
		public void modificarDatosCliente(){
			if (continuar) {			
				try {	
					
					objInformacionDatosContacto.textDireccion.clear();
					objInformacionDatosContacto.textDireccion.sendKeys("OSA MAYOR 622-B");
					Thread.sleep(3000);
					System.out.println("Ingreso valor a campo direccion");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					objInformacionDatosContacto.cboxRegion.sendKeys("Antofagasta");
					Thread.sleep(5000);
					System.out.println("Ingreso valor a campo Region");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					objInformacionDatosContacto.cboxCiudad.sendKeys("Tocopilla");
					Thread.sleep(5000);
					System.out.println("Ingreso valor a campo Ciudad");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					objInformacionDatosContacto.cboxComuna.sendKeys("Tocopilla");
					Thread.sleep(5000);
					System.out.println("Ingreso valor a campo Comuna");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					objInformacionDatosContacto.textTelefonoMovil.clear();
					Thread.sleep(3000);
					System.out.println("Ingreso valor a campo Telefono Movil");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					objInformacionDatosContacto.textTelefonoMovil.sendKeys("934067377");
					Thread.sleep(3000);
					objInformacionDatosContacto.cboxCodigoTelefonoEmpresa.sendKeys("2");
					objInformacionDatosContacto.textTelefonoEmpresa.clear();
					objInformacionDatosContacto.textTelefonoEmpresa.sendKeys("27654345");
					
				} catch (Exception e) {
					tools.skipScript(e);
				}
			}else {			
				tools.skipPreviousMethod();
			}		
		}
		
		@Test (priority = 6)
		public void guardarCambios(){
			if (continuar) {			
				try {	
					
					objInformacionDatosContacto.btnGuardarCambios.click();
					System.out.println("Presionar boton Guardar");
					tools.screenshot("scripts", Caso, "ingresoModuloMisDatos");
					Thread.sleep(8000);
					
					objInformacionDatosContacto.btnConfirmarCambios.click();
					Thread.sleep(10000);
					
					objInformacionDatosContacto.btnAceptarCambios.click();
					Thread.sleep(4000);
					
				} catch (Exception e) {
					tools.skipScript(e);
				}
			}else {			
				tools.skipPreviousMethod();
			}		
		}
		
		@Test (priority = 7)
		public void verDatosModificados(){
			if (continuar) {			
				try {	
					
					objAntecedentesFamiliares = new pageInformacionPersonalAntecendentesFamiliares(tools.getDriver());
					objAntecedentesFamiliares.btnAntecedentesFamiliares.click();
					Thread.sleep(3000);
					objInformacionDatosContacto.btnDatosContacto.click();
					Thread.sleep(3000);
					
					objInformacionDatosContacto.labelInformacionComercial.click();
					Thread.sleep(10000);
					tools.stop();
					
				} catch (Exception e) {
					tools.skipScript(e);
				}
			}else {			
				tools.skipPreviousMethod();
			}		
		}

}


//