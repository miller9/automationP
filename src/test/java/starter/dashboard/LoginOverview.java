package starter.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginOverview {

    public static By AUTHENTICATION = By.xpath("//*[@id=\"center_column\"]/h1");

    public static By CREATE_AN_ACCOUNT = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/h1");
    public static By SELECT_DAY = By.xpath("//*[@id=\"days\"]/option[2]");
    public static By REGISTERED_SHOPPING_CART = By.xpath("//*[@id=\"cart_title\"]");
    //public static By MY_ACCOUNT = By.xpath("//*[@id=\"center_column\"]/h1");
    public static By MY_ACCOUNT = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
  //  public static By MY_ACCOUNT = By.xpath("//div[contains(@class, \"My Account\")");



}