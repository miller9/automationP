package starter.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationDropdown {

    public static Target SERVICES_DAYS = Target.the("uniform-days").locatedBy("select#days");
    public static Target SERVICE_ITEM_DAY = Target.the("days")
                .locatedBy("//li[contains(@class,'days')]//a[contains(text(),'{2}')]");


    public static Target SERVICES_MONTHS = Target.the("uniform-months").locatedBy("select#months");
    public static Target SERVICE_ITEM_MONTH = Target.the("months")
            .locatedBy("//li[contains(@class,'months')]//a[contains(text(),'{January}')]");


    public static Target SERVICES_YEARS = Target.the("uniform-years").locatedBy("select#years");
    public static Target SERVICE_ITEM_YEAR = Target.the("years")
            .locatedBy("//li[contains(@class,'days')]//a[contains(text(),'{2}')]");
            //*[@id="years"]/option[2]



    public static Target SERVICES_STATE = Target.the("uniform-id_state").locatedBy("select#id_state");
    public static Target SERVICE_ITEM_STATE = Target.the("id_state")
            .locatedBy("//*[@id=\"id_state\"]");

    public static Target SERVICES_COUNTRY = Target.the("uniform-id_country").locatedBy("select#id_country");
    public static Target SERVICE_ITEM_COUNTRY = Target.the("id_country")
            .locatedBy("//*[@id=\"id_country\"]");


}
