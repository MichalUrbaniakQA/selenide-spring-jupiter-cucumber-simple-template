package e2e.config;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Highlighter {

    public static <T extends WebElement> T markElement(T element) {
        executeJavaScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');", element);
        return element;
    }
}
