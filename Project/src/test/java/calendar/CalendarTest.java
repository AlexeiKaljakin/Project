package calendar;

import data.EventTypeData;
import driverfactory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.CalendarEventsPage;

public class CalendarTest {

    private WebDriver driver;
    private CalendarEventsPage calendarEventsPage;

    @BeforeEach
    public void init() {
        driver = new WebDriverFactory("--start-maximized").create();


        this.calendarEventsPage = new CalendarEventsPage(driver);
        calendarEventsPage.open("/events/near/");
    }

    @AfterEach
    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void validationDateEvents() {
        calendarEventsPage
                .checkVisibilityCardsEvent()
                .checkStartDateEvent();
    }

    @Test
    public void selectEventsOfType() {
        calendarEventsPage
                .selectSortedEventsType(EventTypeData.OPEN)
                .checkEventsType(EventTypeData.OPEN);
    }
}