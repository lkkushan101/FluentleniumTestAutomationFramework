package Tests;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.fluentlenium.adapter.junit.*;
import org.fluentlenium.core.annotation.Page;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageClasses.LoginPage;
import PageClasses.HomePage;
import Utility.*;


public class LoginTest extends BaseClass {

		
		@Page
		LoginPage loginPage;
		@Page
		HomePage mainPage;
	    public WebDriver driver;
		    // Overrides the default driver
		  
		 @Test
		   
		    public void google_search() throws FileNotFoundException, IOException, ParseException {
	
		    	 JSONReader jsonRead = new JSONReader();
			    loginPage.goTo(jsonRead.readJSON("./Data/sel.json", "URL"));
		        loginPage.loginUI(jsonRead.readJSON("./Data/sel.json", "USER"), jsonRead.readJSON("./Data/sel.json", "PASSWORD"));
		        assertThat(window().title()).contains("Guru");
		        assertThat(this.mainPage.getHeadingText().contains("Guru99 Bank") );
		     
		        
		    }
	}

