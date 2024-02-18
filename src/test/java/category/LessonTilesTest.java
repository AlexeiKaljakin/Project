package category;

import data.LessonsCategoryData;
import driverfactory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BreedingCoursesPage;
import pages.DetailedCardCoursePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LessonTilesTest {
    private WebDriver driver;
    private BreedingCoursesPage breedingCourses = null;

    @BeforeEach
    public void init() {
        driver = new WebDriverFactory("--start-maximized").create();

        List<String> queryParams = new ArrayList<>();
        queryParams.add(String.format("categories=%s", LessonsCategoryData.TESTING.name().toLowerCase()));

        this.breedingCourses = new BreedingCoursesPage(driver);
        breedingCourses.open(queryParams);
    }

    @AfterEach
    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void checkNumberCourses() {
        breedingCourses.cardsCoursesCountShouldBeSameAs(10);
    }

    @Test
    public void checkCardCourse() {
        breedingCourses.clickRandomCardCourses();
        DetailedCardCoursePage detailedCardCoursePage = new DetailedCardCoursePage(driver, "");
        detailedCardCoursePage.checkTitleCourse();
        detailedCardCoursePage.checkDescriptionCourse();
        detailedCardCoursePage.checkCourseFormat("Онлайн");
        detailedCardCoursePage.checkCourseDuration();
    }
}
