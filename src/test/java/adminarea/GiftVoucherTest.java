package adminarea;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//И стефи да напише нещо

public class GiftVoucherTest {

    @BeforeMethod
    public void setUp(){
        Browser.setup();
    }

    @Test
    public void GiftVoucherCheck(){
        GiftVoucher.goTo();
        GiftVoucher.adminLogin("admin4", "parola123!");
        GiftVoucher.GVoucherExistChek();
       // GiftVoucher.VoucherExistText("ForRY", "You have a BUG");
        GiftVoucher.GVoucherRemoveAndCreateNew("ForRY", "Atanas Yordanov", "alreadyregistered@abv.bg", "Radost Yordanova", "radiyo@abv.bg", "Happy Birthday love, there is good in this world. You are living proof!", "278");

       // GiftVoucher.VoucherNewExistText("ForRY","Voucher NOT Exist");

    }


    @AfterMethod
    public void quit(){
       // Browser.quit();
    }
}
