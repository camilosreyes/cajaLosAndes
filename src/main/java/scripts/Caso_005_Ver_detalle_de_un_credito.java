package scripts;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;

import Tools.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import pageFactory.pageDetalleCreditos;
import pageFactory.pageIndex;
import pageFactory.pageMenuCliente;

public class Caso_005_Ver_detalle_de_un_credito {
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pageDetalleCreditos objDetalleCreditos;

	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_005_Ver_detalle_de_un_credito";
	String _method = "";
	String Caso = "Caso_005_Ver_detalle_de_un_credito";
	
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
	public void ingresarMisCreditos(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				System.out.println("Ingreso al menu Mis creditos");
				objMenuCliente = new pageMenuCliente(tools.getDriver());
				objMenuCliente.linkMisCreditos.click();
				tools.screenshot("scripts", Caso, "ingresarMisCreditos");
				Thread.sleep(3000);
				
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 3)
	public void ingresarDetalleCredito(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 4");
				System.out.println("Ingreso al menu Mis creditos");
				objMenuCliente.linkDetalleCredito.click();
				tools.screenshot("scripts", Caso, "ingresarDetalleCredito");
				Thread.sleep(6000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 4)
	public void volverAlHome(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 5");
				objDetalleCreditos = new pageDetalleCreditos(tools.getDriver());
				System.out.println("Volver al home");
				objDetalleCreditos.btnVolverHome.click();
				tools.screenshot("scripts", Caso, "volverAlHome");
				Thread.sleep(3000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
}
