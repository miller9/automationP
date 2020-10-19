package starter.registration;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.login.LoginForm.*;
import static starter.targets.RegistrationDropdown.*;
//import static starter.login.LoginForm.DAYS;


public class FillingRegistration implements Task {

    private final String email_create;

    private final String radio_button;
    private final String first_name;
    private final String last_name;
    private final String password;
    private Object CheckboxGroup;

    private final String service;
    private final String check_news;
    private final String check_offer;
    private final String company;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String postcode;
    private final String country;
    private final String other;
    private final String phone;
    private final String phone_mobile;


    public FillingRegistration(String email, String radio_button, String first_name, String last_name, String password,
                               String service, String check_news, String check_offer, String company, String address1, String address2,
                               String city, String state, String postcode, String country, String other, String phone, String phone_mobile) {
//    public FillingRegistration(String radio_button, String first_name, String last_name, String password) {

        this.email_create = email;
        this.radio_button = radio_button;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.service = service;
        this.check_news = check_news;
        this.check_offer = check_offer;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.other = other;
        this.phone = phone;
        this.phone_mobile = phone_mobile;
    }

    public static Performable withCredentials(String email, String radio_button, String first_name, String last_name, String password,
                                              String service, String check_news, String check_offer, String company, String address1, String address2,
                                              String city, String state, String postcode, String country, String other, String phone, String phone_mobile) {
        return instrumented(FillingRegistration.class, email, radio_button, first_name, last_name, password, service, check_news, check_offer, address1,
                address2, city, state, postcode, country, other, phone, phone_mobile);
    }

    public static FillingRegistration named(String service) {
        return Instrumented.instanceOf(FillingRegistration.class).withProperties(service);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        String day = SelectedVisibleTextValue.of("//*[@id=\"days\"]/option[2]").viewedBy(actor).value();
        String day2 = String.valueOf(new SelectByVisibleTextFromBy("//*[@id=\"days\"]/option[2]"));
        String day3 = String.valueOf(SelectedVisibleTextValue.of("selector focus hover active"));
        String day4 = String.valueOf(SelectedVisibleTextValue.of("select[contains(@id,'nth-child(2)')"));
        String day5 = String.valueOf(SelectedVisibleTextValue.of("select[name$,'//*[@id=\"days\"]/option[2]'"));
        UIStateReaderBuilder<SelectedVisibleTextValue> day6 = SelectedVisibleTextValue.of("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[2]");
        //Dropdown dropdownDay = Dropdown.forWebElement("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[2]");

        actor.attemptsTo(
                MoveMouse.to(RADIOHOVER).andThen(actions -> actions.click() ),
                Enter.theValue(first_name).into(CUSTOMER_FIRSTNAME),
                Enter.theValue(last_name).into(CUSTOMER_LASTNAME),
                Enter.theValue(password).into(PASSWORD_FIELD),

                //MoveMouse.to(FORM_GROUP).andThen(actions -> actions.click((WebElement) drpDays))

                // 4
                //MoveMouse.to(day)
                //Scroll.to(DAYS),

                // 3
//                MoveMouse.to(LoginForm.DAYS),
//                //(Performable) day6
//                SelectFromOptions.byVisibleText("1").from(DAYS)

                // val emailAddress = Target.the("Email address").located(By.cssSelector("select#days"));
                // 1
                //MoveMouse.to(SERVICES_DAYS),
                //Click.on(Target.the("Birth day").located(By.cssSelector("select#days")))
                    //ClickOnBy(SelectedVisibleTextValue(SelectedValue("2"))



        // 2
                MoveMouse.to(SERVICES_DAYS),
                Click.on(SERVICE_ITEM_DAY.of(service)),

                MoveMouse.to(SERVICES_MONTHS),
                Click.on(SERVICE_ITEM_MONTH.of(service)),
                MoveMouse.to(SERVICES_YEARS),
                Click.on(SERVICE_ITEM_YEAR.of(service)),
                Click.on(CHECKBOX_NEWSLETTER),
                Click.on(CHECKBOX_OFFERS),
                Enter.theValue(first_name).into(PERSONAL_FIRSTNAME),
                Enter.theValue(last_name).into(PERSONAL_LASTNAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(address1).into(ADDRESS1),
                Enter.theValue(address2).into(ADDRESS2),
                Enter.theValue(city).into(CITY),

                MoveMouse.to(SERVICES_STATE),
                Click.on(SERVICE_ITEM_STATE.of(service)),
                Enter.theValue(postcode).into(POSTCODE),
                MoveMouse.to(SERVICES_COUNTRY),
                Click.on(SERVICE_ITEM_COUNTRY.of(service)),

                Enter.theValue(other).into(OTHER),
                Enter.theValue(phone).into(PHONE),
                Enter.theValue(phone_mobile).into(PHONE_MOBILE),
                MoveMouse.to(SUBMIT_ACCOUNT_BUTTON).andThen(actions -> actions.doubleClick() )


        );
    }
}