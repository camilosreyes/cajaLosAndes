package scripts;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;

import Tools.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import pageFactory.pageCartolaBeneficios;
import pageFactory.pageDescargarInstructivo;
import pageFactory.pageIndex;
import pageFactory.pageMenuCliente;

public class Caso_012_Descargar_Instructivo_cartola_beneficios {
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pageCartolaBeneficios objCartolaBeneficios;
	pageDescargarInstructivo objDescargarInstructivo;
	
	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_012_Descargar_Instructivo_cartola_beneficios";
	String _method = "";
	
	String Caso = "Caso_012_Descargar_Instructivo_cartola_beneficios";
	
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
			tools.screenshot("scripts", "Caso", "ingresoPlataforma");
			
			Thread.sleep(300);			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
		}
	}
	
	@Test (priority = 1)
	public void ingresoPlataformaLogin(){
		//tools = new Tools();
		if (continuar) {			
			try {
				System.out.println("Pasamos al paso 2");
				Thread.sleep(500);
				System.out.println("Comenzamos el proceso de ejecucion del caso de pruebas");
				Thread.sleep(500);				
				objIndex.textRut.sendKeys("16.767.568");
				Thread.sleep(500);				
				tools.screenshot("scripts", "Caso", "ingresoPlataformaLogin");
				objIndex.textDv.sendKeys("9");
				Thread.sleep(500);				
				tools.screenshot("scripts", "Caso", "ingresoPlataformaLogin");
				objIndex.textPass.sendKeys("pabSolar88x");
				Thread.sleep(500);
				tools.screenshot("scripts", "Caso", "ingresoPlataformaLogin");
				objIndex.btnIngresar.click();
				Thread.sleep(2000);				
				tools.screenshot("scripts", "Caso", "ingresoPlataformaLogin");
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
	public void IngresoCartolaDeBeneficios(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 2");
				objMenuCliente = new pageMenuCliente(tools.getDriver());
				System.out.println("Ingreso a submenu cartola de beneficios");
				objMenuCliente.linkCartolaBeneficios.click();
				tools.screenshot("scripts", "Caso", "IngresoCartolaDeBeneficios");
				Thread.sleep(5000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 3)
	public void descargarCartola(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 2");
				objCartolaBeneficios = new pageCartolaBeneficios(tools.getDriver());
				System.out.println("Selecciona el periodo");
				objCartolaBeneficios.lblSeleccionarPeriodo.click();
				tools.screenshot("scripts", "Caso", "descargarCartola");
				Thread.sleep(3000);
				System.out.println("Ingreso a la cartola segun el periodo");
				objCartolaBeneficios.linkDetalleCartola.click();
				tools.screenshot("scripts", "Caso", "descargarCartola");
				Thread.sleep(10000);
				System.out.println("Descargar la cartola");
				objCartolaBeneficios.linkDescargarCartola.click();
				tools.screenshot("scripts", "Caso", "descargarCartola");
				
				Thread.sleep(5000);
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
}
