package PageClasses;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FluentPage  { 
	@PageUrl("https://demo.guru99.com/v4/")

	    @FindBy(name="uid")
	    private FluentWebElement userNameInput;
		
		@FindBy(name="password")
	    private FluentWebElement passwordInput;
		
		@FindBy(name="btnLogin")
	    private FluentWebElement loginButton;
		
		public void navigateLoginPage (String pageURL)
		{
			goTo(pageURL);
		}
		
		public void loginUI(String userName, String password) throws FileNotFoundException, IOException, ParseException
		{
			
			userNameInput.fill().with(userName);
			passwordInput.fill().with(password);
			loginButton.click();
		}
	}


