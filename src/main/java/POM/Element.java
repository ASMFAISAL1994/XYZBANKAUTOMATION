package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Element {

    WebDriver driver;

    public Element(WebDriver driver){
        this.driver=driver;

    }

    public void clickBankManagerAndCustomerButton() throws InterruptedException {
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[@class='center'][2]/child::button")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][1]")).click();

    }
    public void firstnamelastnamepostcode(String firstName ,String LastName, String Postcode) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='form-group'][2]/child::input")).sendKeys(LastName);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='form-group'][3]/child::input")).sendKeys(Postcode);


    }
    public void clickaddcustomerbutton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

    }
    public void userwillclickalertokbutton() throws InterruptedException {
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
    public void userInOpenAccountPage() throws InterruptedException {
        Thread.sleep(1000);

driver.findElement(By.xpath("//button[@ng-click=\"openAccount()\"]")).click();



    }
    public void userSelectCustomerName() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name=\"userSelect\"]")).click();
        driver.findElement(By.xpath("//select//option[text()='ASM FAISAL']")).click();


    }
    public void userSelectCurrancy(){
        driver.findElement(By.xpath("//select[@name=\"currency\"]")).click();
        driver.findElement(By.xpath("//select//option[text()='Dollar']")).click();

    }
    public void clickProcess(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }
    public void accountCreatSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
    public void userInCustomerPage() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ng-click=\"showCust()\"]")).click();

    }
    public void userSearchName() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@ng-model=\"searchCustomer\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//select//option[text()='ASM']")).click();

    }
    public void deleatTheAccount() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ng-click=\"deleteCust(cust)\"]")).click();

    }





}
