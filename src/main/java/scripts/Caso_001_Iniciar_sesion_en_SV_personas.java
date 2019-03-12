package scripts;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;

import Tools.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import pageFactory.pageIndex;


public class Caso_001_Iniciar_sesion_en_SV_personas {
	
	tools tools;
	pageIndex objIndex;

	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_001_Iniciar_sesion_en_SV_personas";
	String _method = "";
	
	String Caso = "Caso_001_Iniciar_sesion_en_SV_personas";
	
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
	public void cerrarBrowser(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				Thread.sleep(1000);
				System.out.println("El caso ha finalizado, comienza a respaldar el ultimo paso");
				tools.screenshot("scripts", Caso, "cerrarBrowser");
				System.out.println("Se captura imagen del paso, del caso de prueba");
				Thread.sleep(2000);
				System.out.println("Caso Finalizado correctamente");
				tools.stop();
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	

}
