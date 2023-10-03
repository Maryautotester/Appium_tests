package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.popups.AlertComponent;
import data.StartPageHeaderData;

import java.time.Duration;
public class MainPage extends AbsBasePage<MainPage> {
    private SelenideElement skipButton = $("[text='Skip >']");

    public MainPage clickNextButton() {
        String nextButton = "[text='Next']";
        $(nextButton).click();

        return this;
    }

    public MainPage startPageTextSameAs(StartPageHeaderData text) {
        $(String.format("[text='%s']", text.getHeader())).shouldBe(Condition.visible, Duration.ofSeconds(15));

        return this;
    }

    public MainPage skipButtonShouldeBeVisible() {
        skipButton.shouldBe(Condition.visible);

        return this;
    }

    public AlertComponent clickSkipButton() {
        skipButton.click();

        return new AlertComponent();
    }
}
