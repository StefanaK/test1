package adminarea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class GiftVoucher {

    /**
     *Invoking this method will navigate you to the user area of the project
     */
    public static void goTo() {
        //Browser.driver.get("http://shop.pragmatic.bg/admin/");
    }


    /**
     * This method logs you into the admin area with the
     * provided credentials as parameters
     * @param admin4 the username you would like to login with
     * @param pasword the password you would like to login with
     */
    public static void adminLogin(String admin4, String pasword) {
        Browser.driver.findElement(By.name("username")).sendKeys("admin4");
        Browser.driver.findElement(By.name("password")).sendKeys("parola123!");
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }




    public static void GVoucherExistChek() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);

        Browser.driver.findElement(By.xpath("//a[@href='#collapse4']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#collapse4 a[href=\"#collapse4-3\"]"))).click();

        Browser.driver.findElement(By.id("collapse4-3")).click();

        Browser.driver.findElement(By.cssSelector(".btn-danger"));

    }
 //   public static void VoucherExistText(String expectedVExistText, String messageIfFailure) {

//        String actualVExistText = Browser.driver.findElement(By.xpath("//div/table/tbody//td[contains(text(), 'ForRY' )]")).getText();

//        Assert.assertEquals(actualVExistText, expectedVExistText, messageIfFailure);

//        System.out.println(Browser.driver.findElement(By.xpath("//div/table/tbody//td[contains(text(), 'ForRY' )]")).getText());
 //   }

    public static void GVoucherRemoveAndCreateNew(String Code, String FromName, String FromEmail, String ToName, String ToEmail, String Message, String Amount) {

       // WebDriverWait wait = new WebDriverWait(Browser.driver,10);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.table-responsive tbody")));


        WebElement tableVouchers = Browser.driver.findElement(By.cssSelector("div.table-responsive tbody"));


        if(tableVouchers.getText().contains("Atanas Yordanov")){

            Browser.driver.findElement(By.name("selected[]")).click();

              // Browser.driver.findElement(By.cssSelector(".btn-danger")).click();
              //          try{
              //               Alert alert = Browser.driver.switchTo().alert();
              //               alert.accept();
              //               Assert.assertTrue(Browser.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().contains("Success"), "There is a BUG whit pop-up confirm window");
              //          } catch (NoAlertPresentException e){
              //               e.printStackTrace();
              // }
          }

 //      Browser.driver.findElement(By.xpath("//div[1]/div/div/a")).click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-code")));

//        Browser.driver.findElement(By.id("input-code")).sendKeys(Code);
//        Browser.driver.findElement(By.name("from_name")).sendKeys(FromName);
 //       Browser.driver.findElement(By.id("input-from-email")).sendKeys(FromEmail);
//        Browser.driver.findElement(By.id("input-to-name")).sendKeys(ToName);
//        Browser.driver.findElement(By.id("input-to-email")).sendKeys(ToEmail);
 //       Browser.driver.findElement(By.id("input-message")).sendKeys(Message);
//        Browser.driver.findElement(By.name("amount")).sendKeys(Amount);
//        Browser.driver.findElement(By.xpath("//div[1]/div/div/button/i")).click();
    }

 //   public static void VoucherNewExistText(String expectedNewExistText, String messageIfFailure) {

//        String actualNewExistText = Browser.driver.findElement(By.xpath("//div/table/tbody//td[contains(text(), 'ForRY' )]")).getText();

 //       Assert.assertEquals(actualNewExistText, expectedNewExistText, messageIfFailure);

//        System.out.println(Browser.driver.findElement(By.xpath("//div/table/tbody//td[contains(text(), 'ForRY' )]")).getText());
   // }
}
