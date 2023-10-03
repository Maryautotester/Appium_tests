package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;

public class GrammarPage extends AbsBasePage{

    private SelenideElement getFreeLessons = $("[text*='Get free lessons']");
    private SelenideElement freeLessonsPage = $("[text='Get one free lesson for each friend you refer \n']");
    private SelenideElement basic = $("[text = 'BASIC']");
    private SelenideElement muchManyStartButton = $(By.xpath(
            "//android.widget.TextView[@text='Much - Many']//..//android.widget.TextView[@text='Start']"));
    private SelenideElement someAnyStartButton = $(By.xpath(
            "//android.widget.TextView[@text='Some - Any']//..//android.widget.TextView[@text='Start']"));
    private SelenideElement chatField = $(By.xpath("//android.widget.EditText[@text='Type a message...']"));

    public GrammarPage getFreeLessonButtonShouldBeVisible() {
        getFreeLessons.shouldBe(Condition.visible);
        return this;
    }
    public GrammarPage basicShouldBeVisible() {
        basic.shouldBe(Condition.visible, Duration.ofSeconds(15));

        return this;
    }
    public GrammarPage clickGetFreeLessons() {
        getFreeLessons.click();
        return this;
    }
    public GrammarPage chatFieldShouldBeVisible() {
        chatField.shouldBe(Condition.visible);

        return this;
    }
    public GrammarPage freeLessonPageShouldBeVisible() {
        freeLessonsPage.shouldBe(Condition.visible);
        return this;
    }

    public GrammarPage muchManyStartBtnShouldBeVisible() {
        muchManyStartButton.shouldBe(Condition.visible);
        return this;

    }
    public GrammarPage clickMuchManyStartBtn() {
        muchManyStartButton.click();
        return this;

    }
    public GrammarPage someAnyStartBtnShouldBeVisible() {
        someAnyStartButton.shouldBe(Condition.visible);
        return this;

    }
    public GrammarPage clickSomeAnyStartBtn() {
        someAnyStartButton.click();
        return this;

    }




}
