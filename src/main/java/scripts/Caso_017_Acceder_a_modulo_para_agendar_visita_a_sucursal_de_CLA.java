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
import pageFactory.pageMenuCliente;
import pageFactory.pagePlanificaVisita;

public class Caso_017_Acceder_a_modulo_para_agendar_visita_a_sucursal_de_CLA {
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pagePlanificaVisita objPlanificaVisita;

	
	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_017_Acceder_a_modulo_para_agendar_visita_a_sucursal_de_CLA";
	String _method = "";
	
	String Caso = "Caso_017_Acceder_a_modulo_para_agendar_visita_a_sucursal_de_CLA";
	
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
	public void ingresoSeleccionarSucursal(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				objMenuCliente = new pageMenuCliente(tools.getDriver());
				System.out.println("Agendar Hora");
				objMenuCliente.btnQuieroIr.click();
				tools.screenshot("scripts", "Caso", "ingresoSeleccionarSucursal");
				Thread.sleep(4000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 3)
	public void seleccionarZonaSucursal(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 4");
				objPlanificaVisita = new pagePlanificaVisita(tools.getDriver());
				objPlanificaVisita.lblSeleccionarSucursal.click();
				tools.screenshot("scripts", "Caso", "seleccionarZonaSucursal");
				Thread.sleep(3000);
				System.out.println("Seleccionar la zona");
				objPlanificaVisita.btnZonaCentro.click();
				tools.screenshot("scripts", "Caso", "seleccionarZonaSucursal");
				Thread.sleep(4000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 4)
	public void seleccionarSucursal(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 5");
				System.out.println("Seleccionar la sucursal");
				objPlanificaVisita.btnSanPablo.click();
				tools.screenshot("scripts", "Caso", "seleccionarSucursal");
				Thread.sleep(4000);
				
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
}
