import com.codeborne.selenide.Selenide;
import components.popups.AlertComponent;
import data.StartPageHeaderData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.GrammarPage;
import pages.MainPage;
import pages.StartPage;

@ExtendWith(AppiumExtension.class)
public class AndyGrammar_Test {
    @Test
    public void startPage() {
        new MainPage()
                .open()
                .startPageTextSameAs(StartPageHeaderData.FIRST_PAGE_HEADER)
                .clickNextButton()
                .startPageTextSameAs(StartPageHeaderData.SECOND_PAGE_HEADER)
                .clickNextButton()
                .skipButtonShouldeBeVisible()
                .clickSkipButton()
                .popupShouldBeVisible();

        new AlertComponent()
                .clickOkButton();

        new StartPage()
                .clickGrammarButton();

        new GrammarPage()
                .basicShouldBeVisible()
                .getFreeLessonButtonShouldBeVisible()
                .clickGetFreeLessons()
                .freeLessonPageShouldBeVisible();
        Selenide.back();

        new GrammarPage()
                .muchManyStartBtnShouldBeVisible()
                .clickMuchManyStartBtn()
                .chatFieldShouldBeVisible();
        Selenide.back();

        new GrammarPage()
                .someAnyStartBtnShouldBeVisible()
                .clickSomeAnyStartBtn()
                .chatFieldShouldBeVisible();
        Selenide.back();

    }
}
