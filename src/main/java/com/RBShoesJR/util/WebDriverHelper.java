package com.RBShoesJR.util;

import java.awt.Toolkit;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverHelper {
	
	public static WebDriver createDriver(String browser, String windowsChromeDriver, String windowsIEDriver, 
			String windowsGeckoDriver, String windowsEdgeDriver, String macChromeDriver, String macIEDriver, String macGeckoDriver, 
			String linuxChromeDriver, String linuxGeckoDriver, String runTestFromXMLMultiBrowser, String browserRemote) throws MalformedURLException
		{
			String osName = System.getProperty("os.name");
			System.out.println(System.getProperty("os.name"));		
			WebDriver driver = null;		
			if(osName.contains("Windows")) {
				
				if(runTestFromXMLMultiBrowser.equalsIgnoreCase("true")) {
					
					if(browserRemote.equalsIgnoreCase("headless")) {
						
						File file = new File("C:\\SeleniumJars\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
						System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
						driver = new PhantomJSDriver();
					}
					
					else if(browserRemote.equalsIgnoreCase("chromeRemote")) {
						
						System.out.println("Opening Chrome Driver");					
						System.setProperty("webdriver.chrome.driver",windowsChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",windowsChromeDriver);		            			            
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
						
					}
					else if(browserRemote.equalsIgnoreCase("chromeRemoteHeadless")) {
						
						System.out.println("Opening Chrome Driver");					
						System.setProperty("webdriver.chrome.driver",windowsChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",windowsChromeDriver);
			            options.addArguments("--headless");	
			            options.addArguments("--window-size=1560,840");
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
						
					}
					else if(browserRemote.equalsIgnoreCase("firefoxRemote")) {
						
						 System.setProperty("webdriver.gecko.driver",windowsGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();							
						    capabilities.setCapability("marionette",true);
							driver = new FirefoxDriver(capabilities);
						
					}
					
					else if(browserRemote.equalsIgnoreCase("firefoxRemoteHeadless")) {
						
						 System.setProperty("webdriver.gecko.driver",windowsGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);					    
						    FirefoxOptions options = new FirefoxOptions();
					        options.addArguments("--headless");
					        options.addArguments("--window-size=1560,840");
							driver = new FirefoxDriver(options);
						
					}
					
					else if(browserRemote.equalsIgnoreCase("edgeRemote")) {
							
						System.setProperty("webdriver.edge.driver",windowsEdgeDriver);
						EdgeOptions options = new EdgeOptions();
						options.setPageLoadStrategy("eager");
						driver = new EdgeDriver();
							
						}
					else
					{
						throw new InvalidParameterException(browserRemote + "- is not a valid web browser for remote driver.");
					}
				}
				
				else {
					
					if(browser.equalsIgnoreCase("headless")) {
						
//						driver = new HtmlUnitDriver();
						File file = new File("C:\\SeleniumJars\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
						System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
						driver = new PhantomJSDriver(); 
						
					}
					
					else if(browser.equalsIgnoreCase("Firefox")) {
							
					    System.setProperty("webdriver.gecko.driver",windowsGeckoDriver);
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					    capabilities.setCapability("marionette",true);
						driver = new FirefoxDriver(capabilities);
						
					}
					else if(browser.equalsIgnoreCase("FireFoxHeadless")) {
						
						System.setProperty("webdriver.gecko.driver",windowsGeckoDriver);
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					    capabilities.setCapability("marionette",true);					    
					    FirefoxOptions options = new FirefoxOptions();
				        options.addArguments("--headless");
				        options.addArguments("--window-size=1560,840");
						driver = new FirefoxDriver(options);  
						
					}
					else if(browser.equalsIgnoreCase("Chrome"))
					{
						System.setProperty("webdriver.chrome.driver",windowsChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",windowsChromeDriver);	            				            
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
			            
			            //	driver = new ChromeDriver();
					}
					else if(browser.equalsIgnoreCase("ChromeHeadless"))
					{
						System.setProperty("webdriver.chrome.driver",windowsChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",windowsChromeDriver);			            			         
			            options.addArguments("--headless");
			            options.addArguments("--window-size=1560,840");
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					else if(browser.equalsIgnoreCase("chromeGalaxyS5"))
					{
						Map<String, String> mobileEmulation = new HashMap<>();
						mobileEmulation.put("deviceName", "Galaxy S5");
						
						System.setProperty("webdriver.chrome.driver",windowsChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",windowsChromeDriver);			            			         
			            options.setExperimentalOption("mobileEmulation", mobileEmulation);
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					else if(browser.equalsIgnoreCase("IE"))
					{
						System.setProperty("webdriver.ie.driver",windowsIEDriver);			
						driver = new InternetExplorerDriver();			
					}
					else if(browser.equalsIgnoreCase("Edge"))
					{
						System.setProperty("webdriver.edge.driver",windowsEdgeDriver);
						EdgeOptions options = new EdgeOptions();
						options.setPageLoadStrategy("eager");
						driver = new EdgeDriver();
					}
											
					else
					{
						throw new InvalidParameterException(browser + "- is not a valid web browser for web driver.");
					}
				}
				
			}	
			
			if(osName.contains("Mac")) {
				
				if(runTestFromXMLMultiBrowser.equalsIgnoreCase("true")) {
					
					if(browserRemote.equalsIgnoreCase("headless")) {
						
						driver = new HtmlUnitDriver();
					}
					
					else if(browserRemote.equalsIgnoreCase("chromeRemote")) {
						System.out.println("Opening Chrome Driver");					
						DesiredCapabilities capability = DesiredCapabilities.chrome();
						capability.setBrowserName("chrome");
						capability.setPlatform(Platform.ANY);
						driver = new ChromeDriver(capability);
					}
					else if(browserRemote.equalsIgnoreCase("chromeRemoteHeadless")) {
						System.out.println("Opening Chrome Driver");					
						DesiredCapabilities capability = DesiredCapabilities.chrome();
						ChromeOptions options = new ChromeOptions();
						capability.setBrowserName("chrome");
						options.addArguments("--headless");
						options.addArguments("--window-size=1560,840");
						capability.setPlatform(Platform.ANY);
						driver = new ChromeDriver(capability);
					}
					else if(browserRemote.equalsIgnoreCase("firefoxRemote")) {
						System.out.println("Opening FireFox Driver");					
						DesiredCapabilities capability = DesiredCapabilities.firefox();
						capability.setBrowserName("internetExplorer");
						capability.setPlatform(Platform.ANY);
						driver = new FirefoxDriver(capability);
					}
					else if(browserRemote.equalsIgnoreCase("firefoxRemoteHeadless")) {						
						 System.setProperty("webdriver.gecko.driver",macGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);					    
						    FirefoxOptions options = new FirefoxOptions();
					        options.addArguments("--headless");
					        options.addArguments("--window-size=1560,840");
							driver = new FirefoxDriver(options);
						
					}
					else
					{
						throw new InvalidParameterException(browserRemote + "- is not a valid web browser for remote driver.");
					}
				}
				
				else {
				
					if(browser.equalsIgnoreCase("Firefox"))
					{				
						System.setProperty("webdriver.gecko.driver",macGeckoDriver);
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					    capabilities.setCapability("marionette",true);
						driver = new FirefoxDriver(capabilities);
					}
					else if(browser.equalsIgnoreCase("firefoxHeadless")) {
						
						 System.setProperty("webdriver.gecko.driver",macGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);					    
						    FirefoxOptions options = new FirefoxOptions();
					        options.addArguments("--headless");
					        options.addArguments("--window-size=1560,840");
							driver = new FirefoxDriver(options);
						
					}
					else if(browser.equalsIgnoreCase("Chrome"))
					{
						System.setProperty("webdriver.chrome.driver", macChromeDriver);
						driver = new ChromeDriver();								
					}
					else if(browser.equalsIgnoreCase("ChromeHeadless"))
					{
						System.setProperty("webdriver.chrome.driver",macChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",macChromeDriver);			            			         
			            options.addArguments("--headless");
			            options.addArguments("--window-size=1560,840");
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					else if(browser.equalsIgnoreCase("chromeGalaxyS5"))
					{
						Map<String, String> mobileEmulation = new HashMap<>();
						mobileEmulation.put("deviceName", "Galaxy S5");
						
						System.setProperty("webdriver.chrome.driver",macChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",macChromeDriver);			            			         
			            options.setExperimentalOption("mobileEmulation", mobileEmulation);
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					else
					{
						throw new InvalidParameterException(browser + "- is not a valid web browser for web driver.");
					}		
				}
			}	
			
			if(osName.contains("Linux")) {
				
				if(runTestFromXMLMultiBrowser.equalsIgnoreCase("true")) {
					
					if(browser.equalsIgnoreCase("headlessRemote")) {
						
						driver = new HtmlUnitDriver();
						
					}
					
					else if(browserRemote.equalsIgnoreCase("chromeRemote")) {
						System.out.println("Opening Chrome Driver");					
						System.setProperty("webdriver.chrome.driver",linuxChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",linuxChromeDriver);			            
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					else if(browserRemote.equalsIgnoreCase("chromeRemoteHeadless")) {
						System.out.println("Opening Chrome Driver");					
						System.setProperty("webdriver.chrome.driver",linuxChromeDriver);				
					 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			            ChromeOptions options = new ChromeOptions();
			            capabilities.setCapability("chrome.binary",linuxChromeDriver);			            			           
			            options.addArguments("--headless");
			            options.addArguments("--window-size=1560,840");
			            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
			            driver = new ChromeDriver(capabilities);
					}
					
					else if(browser.equalsIgnoreCase("firefoxRemote")) {	
						DesiredCapabilities capability = DesiredCapabilities.firefox();
						capability.setBrowserName("firefox");
						capability.setPlatform(Platform.LINUX);
						driver = new RemoteWebDriver(new URL(linuxGeckoDriver), capability);		
					}
					else if(browserRemote.equalsIgnoreCase("firefoxRemoteHeadless")) {
						
						 System.setProperty("webdriver.gecko.driver",linuxGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);					    
						    FirefoxOptions options = new FirefoxOptions();
					        options.addArguments("--headless");
					        options.addArguments("--window-size=1560,840");
							driver = new FirefoxDriver(options);						
					}
					else
					{
						throw new InvalidParameterException(browserRemote + "- is not a valid web browser for remote driver.");
					}
				}
				
				else {
					
						if(browser.equalsIgnoreCase("headless")) {
							
							driver = new HtmlUnitDriver();
							
						}					
						else if(browser.equalsIgnoreCase("Firefox")) {						
							System.setProperty("webdriver.gecko.driver",linuxGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);
							driver = new FirefoxDriver(capabilities);
						}
						else if(browser.equalsIgnoreCase("firefoxHeadless")) {	
							System.out.println("Opening Gecko Driver Headless");
							System.setProperty("webdriver.gecko.driver",linuxGeckoDriver);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						    capabilities.setCapability("marionette",true);					    
						    FirefoxOptions options = new FirefoxOptions();
					        options.addArguments("--headless");
					        options.addArguments("--window-size=1560,840");
							driver = new FirefoxDriver(options);							
						}
						else if(browser.equalsIgnoreCase("Chrome"))
						{
							System.out.println("Opening Chrome Driver");					
							System.setProperty("webdriver.chrome.driver",linuxChromeDriver);				
						 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				            ChromeOptions options = new ChromeOptions();
				            capabilities.setCapability("chrome.binary",linuxChromeDriver);			            
				            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
				            driver = new ChromeDriver(capabilities);								
						}
						else if(browser.equalsIgnoreCase("ChromeHeadless")) {
							System.out.println("Opening Chrome Driver Headless");					
							System.setProperty("webdriver.chrome.driver",linuxChromeDriver);				
						 	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				            ChromeOptions options = new ChromeOptions();
				            capabilities.setCapability("chrome.binary",linuxChromeDriver);
				            options.addArguments("--headless");
				            options.addArguments("--window-size=1560,840");
				            capabilities.setCapability(ChromeOptions.CAPABILITY, options);		            
				            driver = new ChromeDriver(capabilities);								
						}
																
					else
					{
						throw new InvalidParameterException(browser + "- is not a valid web browser for web driver.");
					}		
				}
			
			}	
			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			Dimension dim = new Dimension(1560,840);
			
			if(browser.equalsIgnoreCase("headless")) {
				driver.manage().window().setSize(dim);
			}
			else {
				driver.manage().window().maximize();
			}
			return driver;
		}
		
		public static void quitDriver(WebDriver driver)
		{
			driver.quit();
		}

}