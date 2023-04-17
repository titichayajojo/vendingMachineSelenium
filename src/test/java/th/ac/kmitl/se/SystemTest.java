package th.ac.kmitl.se;

import org.graphwalker.java.annotation.AfterExecution;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SystemTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://fekmitl.pythonanywhere.com/kratai-bin");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

        // welcome
        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        driver.findElement(By.id("start")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_cancel")));
        driver.findElement(By.id("btn_cancel")).click();

        // welcome
        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        driver.findElement(By.id("start")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();

        // error_order
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();

        // error_order
        alert.accept();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_check_out")));
        driver.findElement(By.id("btn_check_out")).click();

        // confirming
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_change")));
        driver.findElement(By.id("btn_change")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_check_out")));
        driver.findElement(By.id("btn_check_out")).click();

        // confirming
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_confirm")));
        driver.findElement(By.id("btn_confirm")).click();

        // paying
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();
        // error_pay

        // paying
        WebElement text_input = driver.findElement(By.name("txt_credit_card_num"));
        text_input.sendKeys("1234567890123456");
        text_input = driver.findElement(By.name("txt_name_on_card"));
        text_input.sendKeys("Adam Smith");
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();

        // collecting
        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumThai")));
        driver.findElement(By.className("ImgTumThai")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumThai")));
        driver.findElement(By.className("ImgTumThai")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumThai")));
        driver.findElement(By.className("ImgTumThai")).click();

        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumPoo")));
        driver.findElement(By.className("ImgTumPoo")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumPoo")));
        driver.findElement(By.className("ImgTumPoo")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.className("ImgTumPoo")));
        driver.findElement(By.className("ImgTumPoo")).click();
        // welcome
        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));

    }

    @Test
    public void test2() throws java.io.IOException {
        System.out.println("Test 2");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));

        // welcome
        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        driver.findElement(By.id("start")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();

        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_check_out")));
        driver.findElement(By.id("btn_check_out")).click();

        // confirming
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_confirm")));
        driver.findElement(By.id("btn_confirm")).click();

        // paying
        WebElement text_input = driver.findElement(By.name("txt_credit_card_num"));
        text_input.sendKeys("1234567890123456");
        text_input = driver.findElement(By.name("txt_name_on_card"));
        text_input.sendKeys("Adam Smith");
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();

        // collecting
        // 10 seconds
        // Error collecting

        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        // welcome
    }

    @Test
    public void test3() throws java.io.IOException {
        System.out.println("Test 3");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));

        // welcome
        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        driver.findElement(By.id("start")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_thai")));
        driver.findElement(By.id("add_tum_thai")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("add_tum_poo")));
        driver.findElement(By.id("add_tum_poo")).click();

        // ordering
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_check_out")));
        driver.findElement(By.id("btn_check_out")).click();

        // confirming
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_confirm")));
        driver.findElement(By.id("btn_confirm")).click();

        // paying
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();
        // error_pay

        // paying
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();
        // error_pay

        // paying
        w.until(ExpectedConditions.elementToBeClickable(By.id("btn_pay")));
        driver.findElement(By.id("btn_pay")).click();
        // error_pay

        w.until(ExpectedConditions.elementToBeClickable(By.id("start")));
        // welcome
    }
}