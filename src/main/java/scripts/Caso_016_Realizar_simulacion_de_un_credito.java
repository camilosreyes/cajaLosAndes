package scripts;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;

import Tools.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;

import pageFactory.pageCotizaTuCredito;
import pageFactory.pageIndex;
import pageFactory.pageMenuCliente;

public class Caso_016_Realizar_simulacion_de_un_credito {
	tools tools;
	pageIndex objIndex;
	pageMenuCliente objMenuCliente;
	pageCotizaTuCredito objCotizaCredito;

	List<String> errores = new ArrayList<>();
	String _directory = "scripts";
	String _class = "Caso_016_Realizar_simulacion_de_un_credito";
	String _method = "";
	
	String Caso = "Caso_016_Realizar_simulacion_de_un_credito";
	
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
	public void ingresoSimularCredito(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 3");
				objMenuCliente = new pageMenuCliente(tools.getDriver());
				System.out.println("Ingreso a simular tu credito");
				objMenuCliente.btnSimulaCredito.click();
				tools.screenshot("scripts", "Caso", "ingresoSimularCredito");
				Thread.sleep(4000);	
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
	
	@Test (priority = 3)
	public void LlenarDatosCredito(){
		if (continuar) {			
			try {	
				System.out.println("Pasamos al paso 4");
				objCotizaCredito = new pageCotizaTuCredito(tools.getDriver());
				System.out.println("Datos de Afiliado");
				System.out.println("Ingresar fecha de ingreso a la empresa");
				objCotizaCredito.FechaIngresoEmpresa.sendKeys("24-10-2018");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Tipo de contrato");
				objCotizaCredito.rBtnIndefinido.click();
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Telefono de contacto");
				objCotizaCredito.textTelefonoContacto.sendKeys("954545321");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(4000);
				System.out.println("Ingresos de renta liquida");
				System.out.println("Ingreso ultima renta");
				objCotizaCredito.textUltimaRenta.sendKeys("500000");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Ingreso penultima renta");
				objCotizaCredito.textPenultimaRenta.sendKeys("500000");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Ingreso antepenultima renta");
				objCotizaCredito.textAntePenultimaRenta.sendKeys("450000");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				
				System.out.println("Condiciones del credito");
				objCotizaCredito.textMontoSolicitar.clear();
				Thread.sleep(1000);
				System.out.println("Ingreso monto a solicitar");
				objCotizaCredito.textMontoSolicitar.sendKeys("300000");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Cantidad de cuotas");
				objCotizaCredito.comboCuotas.sendKeys("6");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Meses de gracia");
				objCotizaCredito.comboMesesGracia.sendKeys("2");
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(3000);
				System.out.println("Seguro de cesantia");
				objCotizaCredito.checkSeguroCesantia.isSelected();
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
				Thread.sleep(4000);
				System.out.println("Evaluar credito");
				objCotizaCredito.btnEvaluar.click();
				tools.screenshot("scripts", "Caso", "LlenarDatosCredito");
			} catch (Exception e) {
				tools.skipScript(e);
			}
		}else {			
			tools.skipPreviousMethod();
		}		
	}
}
