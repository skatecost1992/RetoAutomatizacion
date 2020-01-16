/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inio.com.pe.Elementos;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
 
/**
 * @author USER
 */
public class PaginaPrincipal {
    
   public void paginaPrincipal(){
   
        System.setProperty("webdriver.chrome.driver","D:\\Repos\\RetoAutomatizacion\\RetoAutomatizacion\\Driver\\chromedriver.exe");
        //*[@id="navbar"]/div[2]/div[2]/div[3]/form/div/div/input
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.linio.com.pe/");
          
        try {
            driver.findElement(By.xpath("//*[@id=\"feed-manual-1\"]/div/div[1]/a[3]/div[1]/picture/img")).click();
            //driver.findElement(By.id("buy-now")).sendKeys("carro");
            //driver.findElement(By.className("form-control")).sendKeys("carro");
            driver.findElement(By.id("buy-now")).click();
            
             driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
             driver.findElement(By.xpath("//*[@id=\"alert-add-to-cart\"]/div/div/div[4]/a")).click();
             String s=driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/span/a")).getText();
             String Elemento = "Redmi Note 8 Versi?n Global 64GB 4GB RAM - Azul";
             System.out.println("\n \n \n Elemento añadido al carrito de compras"+s);
             if (s==s){
                JOptionPane.showMessageDialog(null, "SE REGIDSTRO CON EXITO EN EL CARRITO DE COMPRAS EL PRODUCTO");
             }else {
                JOptionPane.showMessageDialog(null, "NO SE REGISTRO EL PRODUCTO");
             }
             
             
          }catch (Exception  e) {
             System.out.print("El error presentado " + e);
              
	 //   driver.close();
	   //driver.quit();
	  }	
   }
}
