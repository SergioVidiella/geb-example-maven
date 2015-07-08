/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

driver = {
            new RemoteWebDriver(new URL("http://192.168.2.122:4444/wd/hub"), DesiredCapabilities.internetExplorer())
        }

baseUrl = "http://gebish.org"
