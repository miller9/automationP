package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webelements.Checkbox;
import org.openqa.selenium.By;

public class LoginForm {

    public static By SIGN_IN =By.className("login");
    public static By USERNAME_FIELD = By.id("email");
    public static By PASSWORD_FIELD = By.id("passwd");
    public static By LOGIN_BUTTON = By.className("submit");

    public static By EMAIL_CREATE = By.id("email_create");
    public static By CREATE2_BUTTON = new By.ById("SubmitCreate");

    public static By EMAIL_CREATE_BUTTON = new By.ByXPath("//*[@id=\"SubmitCreate\"]/span");

    public static By CUSTOMER_FIRSTNAME = By.id("customer_firstname");
    public static By CUSTOMER_LASTNAME = By.id("customer_lastname");

    public static By RADIOHOVER = By.id("uniform-id_gender1");
    public static By DAYS = By.id("uniform-days");
    //*[@id="days"]/option[2]
    //*[@id="days"]/option[2]
    public static By FORM_GROUP = By.id("selector hover");

    public static By CHECKBOX_NEWSLETTER = new By.ByXPath("//*[@id=\"newsletter\"]\n");
    public static By CHECKBOX_OFFERS = new By.ByXPath("//*[@id=\"optin\"]");
    public static By PERSONAL_FIRSTNAME = By.id("firstname");
    public static By PERSONAL_LASTNAME = By.id("lastname");
    public static By COMPANY = By.id("company");
    public static By ADDRESS1 = By.id("address1");
    public static By ADDRESS2 = By.id("address2");

    public static By CITY = By.id("city");
    public static By POSTCODE = By.id("postcode");
    public static By OTHER = By.id("other");
    public static By PHONE = By.id("phone");
    public static By PHONE_MOBILE = By.id("phone_mobile");
    public static By SUBMIT_ACCOUNT_BUTTON = new By.ByXPath("//*[@id=\"submitAccount\"]");

}
