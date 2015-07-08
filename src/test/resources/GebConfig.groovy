/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

driver = {
            new RemoteWebDriver(new URL("http://windows.ci-server.local"), DesiredCapabilities.Firefox())
        }

baseUrl = "http://gebish.org"
