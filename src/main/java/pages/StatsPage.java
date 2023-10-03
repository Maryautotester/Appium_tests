package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class StatsPage extends AbsBasePage<StatsPage> {
    private SelenideElement settingsButton = $("[text='Settings']");

    public StatsPage checkSettingsButtonVisible() {
        settingsButton.shouldNotBe(Condition.visible);

        return this;
    }

    public StatsPage clickSettingsButton() {
        settingsButton.click();

        return this;
    }
}
