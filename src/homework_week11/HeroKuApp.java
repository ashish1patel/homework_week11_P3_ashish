package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - Project Name: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class HeroKuApp {

        public static void main(String[] args) {
            String baseUrl = "http://the-internet.herokuapp.com/login";

            // Launch the Chrome Browser
            WebDriver driver = new ChromeDriver();

            // Open the URL into browser
            driver.get(baseUrl);

            //Maximise Browser
            driver.manage().window().maximize();

            //We give Implicit wait to Driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //Get the title of the page
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            //Print the current url
            System.out.println("Current URL is: " + driver.getCurrentUrl());

            //Get the page source
            System.out.println("Page source is: " + driver.getPageSource());

            // Enter the email to email field
            WebElement userNameField = driver.findElement(By.id("username"));
            userNameField.sendKeys("ashish123@gmail.com");

            //Enter password to password field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("ashish123");

            //Close the browser
            driver.close();
        }

    }
