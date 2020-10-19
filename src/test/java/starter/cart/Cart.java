package starter.cart;

import org.openqa.selenium.By;

public class Cart {



//    /html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span
//      //*[@id="center_column"]/ul/li/div/div[2]/div[2]/a[1]/span
    public static By ADD_CART_BUTTON = new By.ByXPath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
    public static By CART_DESCRIPTION = new By.ByXPath("//td[@class='cart_description']//p[@class='product-name']//a");




}
