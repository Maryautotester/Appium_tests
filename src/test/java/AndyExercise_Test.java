import components.popups.AlertComponent;
import data.StartPageHeaderData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.ExercisePage;
import pages.MainPage;
import pages.StartPage;

@ExtendWith(AppiumExtension.class)
public class AndyExercise_Test {
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
                .clickEexerciseButton();

        new ExercisePage()
                .exercisePageTextShouldBeVisible()
                .clickStartButton()
                .chatFieldShouldBeVisible();

    }
}
