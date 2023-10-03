package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class SettingsPage extends AbsBasePage<SettingsPage> {
    private SelenideElement translationsButton = $("[text='Translations']");
    private SelenideElement feedbackButton = $("[text='Feedback / help us improve']");
    private SelenideElement contactButton = $("[text='Contact developer']");
    private SelenideElement termsButton = $("[text='Terms of use']");
    private SelenideElement languagePage = $("[text='Language']");
    private SelenideElement backButton = $(By.name("Go back"));

    private SelenideElement termsPage = $(By.xpath("//android.widget.TextView[@text='Subscription options available:']"));

    public SettingsPage checkSettingsButtonsVisible() {
        translationsButton.shouldBe(Condition.visible);
        feedbackButton.shouldBe(Condition.visible);
        contactButton.shouldBe(Condition.visible);
        termsButton.shouldBe(Condition.visible);

        return this;
    }

    public SettingsPage clickTranslationsButton() {
        translationsButton.click();

        return this;
    }

    public SettingsPage languagePageShouldBeVisible() {
        languagePage.shouldBe(Condition.visible);

        return this;
    }

    public SettingsPage clickTermsButton() {
        termsButton.click();

        return this;
    }

    public SettingsPage clickBackButton() {
        backButton.click();

        return this;
    }

    public boolean termsPageShouldOpened() {
        return termsPage.isDisplayed();

    }
    public SettingsPage termsPageShouldBeVisible() {
        termsPage.shouldBe(Condition.visible);
        return this;
    }
}
