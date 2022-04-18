package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegForm;


public class RegFormTests extends tests.TestBase {

    RegForm regForm = new RegForm();

    String  userName = "Oleg",
            userSurnname = "Nochleg",
            userEmail = "123test@test.com",
            userGender = "Male",
            userPhone = "9071153497",
            userBdayMonth = "September",
            userBdayYear = "1990",
            userSubject = "History",
            userHobby = "Reading",
            userCurrAddress = "Main street,90210",
            userState = "Uttar Pradesh",
            userCity = "Agra",
            userBdayDay = "30";

    @Test
    @Owner("Dogmach")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Подключаем Jenkins с Allure report")
    @DisplayName("Результат заполнения формы соответствует введенным значениям в форме")
    void successFillPracticeForm() {
        regForm.openPage()
                .setFirstName(userName)
                .setLastName(userSurnname)
                .setEmail(userEmail)
                .selectMaleGender()
                .setPhone(userPhone)
                .setBirthDate(userBdayDay, userBdayMonth, userBdayYear)
                .setSubject(userSubject)
                .selectHobby()
                //.uploadPicture(userPictureName)
                .setAddress(userCurrAddress)
                .selectState(userState)
                .selectCity(userCity)
                .clickSubmitBTN();

        regForm.checkResultHeader()
                .checkResult("Label", "Values")
                .checkResult("Student Name", userName + " " + userSurnname)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", userGender)
                .checkResult("Mobile", userPhone)
                .checkResult("Date of Birth", userBdayDay + " " + userBdayMonth + "," + userBdayYear)
                .checkResult("Subjects", userSubject)
                .checkResult("Hobbies", userHobby)
                //.checkResult("Picture", userPictureName)
                .checkResult("Address", userCurrAddress)
                .checkResult("State and City", userState + " " + userCity);
    }
}