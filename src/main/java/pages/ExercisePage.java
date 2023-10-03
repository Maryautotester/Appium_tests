package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ExercisePage extends AbsBasePage<ExercisePage> {
    private SelenideElement exercisePageText = $("[text='Learn 5 new words today']");
    private SelenideElement startButton = $("[text='Start']");
    private SelenideElement chatField = $(By.xpath("//android.widget.EditText[@text='Type a message...']"));

    public ExercisePage exercisePageTextShouldBeVisible() {
        exercisePageText.shouldBe(Condition.visible);

        return this;
    }

    public ExercisePage clickStartButton() {
        startButton.click();

        return this;
    }

    public ExercisePage chatFieldShouldBeVisible() {
        chatField.shouldBe(Condition.visible);

        return this;
    }
}
