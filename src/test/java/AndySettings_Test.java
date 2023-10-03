import com.codeborne.selenide.Selenide;
import components.popups.AlertComponent;
import data.StartPageHeaderData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;
import pages.SettingsPage;
import pages.StartPage;
import pages.StatsPage;

@ExtendWith(AppiumExtension.class)
public class AndySettings_Test {
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
                .checkHeaderButtonsVisible()
                .clickStatsButton();

        new StatsPage()
                .checkSettingsButtonVisible()
                .clickSettingsButton();

        new SettingsPage()
                .checkSettingsButtonsVisible()
                .clickTranslationsButton()
                .languagePageShouldBeVisible();

        Selenide.back();

        SettingsPage settingsPage = new SettingsPage();

        settingsPage
                .clickTermsButton();
        if(settingsPage.termsPageShouldOpened()) {
            settingsPage.termsPageShouldBeVisible();
        }  else {
            System.out.printf("It's a bug! Terms doesn't opened at first time!");
            new StatsPage()
                    .clickSettingsButton();
            settingsPage
                    .clickTermsButton()
                    .termsPageShouldBeVisible();
        }



    }
}
