package scripts;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;

import Tools.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import pageFactory.pageCertificadosInformes;
import pageFactory.pageIndex;
import pageFactory.pageMenuCliente;
import pageFactory.pagePrestacionesComplementarias;

public class Caso_004_Ingreso_a_modulo_prestaciones_complementarias {
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pagePrestacionesComplementarias objPrestacionesComplementarias;

	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_004_Ingreso_a_modulo_prestaciones_complementarias";
	String _method = "";
	
	String Caso = "Caso_004_Ingreso_a_modulo_prestaciones_complementarias";
	
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
	public void ingresoPrestacionesComplementarias(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				objMenuCliente = new pageMenuCliente(tools.getDriver());
				System.out.println("Ingreso a prestaciones complementarias");
				objMenuCliente.linkPrestacionesComplementarias.click();
				tools.screenshot("scripts", "Caso", "ingresoPrestacionesComplementarias");
				Thread.sleep(4000);
				
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 3)
	public void volverAlHome(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 4");
				objPrestacionesComplementarias = new pagePrestacionesComplementarias(tools.getDriver());
				System.out.println("Volver al Home");
				objPrestacionesComplementarias.btnVolver.click();
				tools.screenshot("scripts", "Caso", "volverAlHome");
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
}
