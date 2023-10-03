package components.popups;

import static com.codeborne.selenide.appium.SelenideAppium.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class AlertComponent<T> {
    private SelenideElement alertElement = $(By.id("android:id/parentPanel"));
    private SelenideElement okButton = $(By.id("android:id/button1"));


    public AlertComponent popupShouldBeVisible() {
        alertElement.shouldBe(Condition.visible);

        return this;
    }

    public AlertComponent popupShouldNotBeVisible() {
        alertElement.shouldNotBe(Condition.visible);

        return this;
    }

    public void clickOkButton() {
        okButton.click();
    }
}
