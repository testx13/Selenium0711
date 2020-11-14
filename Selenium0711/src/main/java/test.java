import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TESTGIT");
		String exePath= Paths.get("").toAbsolutePath().toString()+File.separator+"drivers"+ File.separator; // Seteando el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //Identificador el .exe para driver
		WebDriver driver=new ChromeDriver(); // Creacion en tiempo de ejecucion
		driver.get("https://www.google.com");
		
		
	}

}
