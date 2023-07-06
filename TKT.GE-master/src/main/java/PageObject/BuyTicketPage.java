package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuyTicketPage {
    public SelenideElement FirstName = $("[data-id='signUpFormFirstOfThree_firstname']");
    public SelenideElement firstNameField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_firstname']"));
    public SelenideElement LastName= $("[data-id='signUpFormFirstOfThree_lastname']");
    public SelenideElement lastNameField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_lastname']"));
    public SelenideElement countryDropdown = $(By.cssSelector("[data-id='signUpFormFirstOfThree_country']"));
    public SelenideElement DocumentNumber = $("[data-id='signUpFormFirstOfThree_personalId']");
    public SelenideElement documentNumberField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_personalId']"));
    public SelenideElement PhoneNumber= $("[data-id='signUpFormFirstOfThree_phoneNumber']");
    public SelenideElement phoneNumberField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_phoneNumber']"));
    public SelenideElement UserName = $("[data-id='signUpFormFirstOfThree_username']");
    public SelenideElement userNameField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_username']"));
    public SelenideElement Password = $("[data-id='signUpFormFirstOfThree_password']");
    public SelenideElement passwordField = $(By.cssSelector("input[data-id='signUpFormFirstOfThree_password']"));
    public SelenideElement Continue = $(By.cssSelector("a._s_size-w-percent--25._s_pl-5._s_pr-5._s_display-f._s_flex-a-center._s_flex-j-center._s_size-h-percent--25"));

    // Registration Second Page
    public SelenideElement Day = $("[data-id='signUpFormSecondOfThree_day']");
    public SelenideElement day = $(By.cssSelector("input[data-id='signUpFormSecondOfThree_day']"));
    public SelenideElement Month = $("[data-id='signUpFormSecondOfThree_month']");
    public SelenideElement month = $(By.cssSelector("input[data-id='signUpFormSecondOfThree_month']"));
    public SelenideElement Year = $("[data-id='signUpFormSecondOfThree_year']");
    public SelenideElement year = $(By.cssSelector("input[data-id='signUpFormSecondOfThree_year']"));
    public SelenideElement Address = $("[data-id='signUpFormSecondOfThree_address']");
    public SelenideElement address = $(By.cssSelector("input[data-id='signUpFormSecondOfThree_address']"));
    public SelenideElement Email = $("[data-id='signUpFormSecondOfThree_email']");
    public SelenideElement email = $(By.cssSelector("input[data-id='signUpFormSecondOfThree_email']"));
    public SelenideElement RegistrationButton = $(By.cssSelector("[data-id='signUpFormSecondOfThreeGEO']"));



    public SelenideElement FirstName() {
        return FirstName;
    }
    public SelenideElement firstNameField() {
        return firstNameField;
    }
    public SelenideElement LastName() {
        return LastName;
    }
    public SelenideElement lastNameField() {
        return lastNameField;
    }
    public SelenideElement countryDropdown() {
        return countryDropdown;
    }
    public SelenideElement DocumentNumber() {
        return DocumentNumber;
    }
    public SelenideElement documentNumberField() {
        return documentNumberField;
    }
    public SelenideElement PhoneNumber() {
        return PhoneNumber;
    }
    public SelenideElement phoneNumberField() {
        return phoneNumberField;
    }
    public SelenideElement Username() {
        return UserName;
    }
    public SelenideElement userNameField() {
        return userNameField;
    }
    public SelenideElement Password() {
        return Password;
    }
    public SelenideElement passwordField() {
        return passwordField;
    }
    public SelenideElement Continue() {
        return Continue;
    }

    // Registration Second Page
    public SelenideElement Day() {
        return Day;
    }
    public SelenideElement day() {
        return day;
    }
    public SelenideElement Month() {
        return month;
    }
    public SelenideElement Year() {
        return year;
    }
    public SelenideElement Address(){
        return Address;
    }
    public SelenideElement address(){
        return address;
    }
    public SelenideElement Email(){
        return Email;
    }
    public SelenideElement email(){
        return email;
    }
    public SelenideElement RegistrationButton(){
        return RegistrationButton;
    }

}
