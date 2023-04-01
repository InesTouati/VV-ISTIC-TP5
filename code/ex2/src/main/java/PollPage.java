import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollPage {
    private WebDriver driver;

    public PollPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("nom");
    By email = By.id("mail");
    By calendarView = By.xpath("//div[i[contains(text(), 'Vue Calendrier')]]");
    By tableView = By.xpath("//div[i[contains(text(), 'Vue Tableau')]]");
    By userChoiceCheckBox = By.xpath("(//div[@class='p-checkbox-box'])[1]");
    By submitButton = By.xpath("//span[contains(text(), 'Soumettre voeux')]");
    By pollCommentAuthor = By.id("comment");
    By pollComment = By.id("commentdesc");
    By addCommentButton = By.xpath("//span[contains(text(), 'Ajouter Commentaire')]");

    public void fillName(String value) {
        driver.findElement(name).sendKeys(value);
    }

    public void fillEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    public void clickCalendarView() {
        driver.findElement(calendarView).click();
    }

    public void clickTableView() {
        driver.findElement(tableView).click();
    }

    public void selectUserChoice() {
        driver.findElement(userChoiceCheckBox).click();
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void fillPollCommentAuthor(String value) {
        driver.findElement(pollCommentAuthor).sendKeys(value);
    }

    public void fillPollComment(String value) {
        driver.findElement(pollComment).sendKeys(value);
    }

    public void clickAddCommentButton() {
        driver.findElement(addCommentButton).click();
    }

}
