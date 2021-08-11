package e2e.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import e2e.config.Highlighter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Component
public class WikiPage{

    private final SelenideElement
            presentationBox = $("#mp-upper"),
            wikiLogo = $(".mw-wiki-logo"),
            firstElementToHighlightClick = $("#mp-tfa-h2"),
            secondElementToHighlightClick = $("#mp-dyk-h2"),
            thirdElementToHighlightClick = $("#mp-itn-h2"),
            fourthElementToHighlightClick = $("#mp-otd-h2");


    public void assertPresentationBoxIsVisible() {
        presentationBox.shouldBe(Condition.visible);
    }

    public void assertWikiLogoIsVisible() {
        wikiLogo.shouldBe(Condition.visible);
    }

    public void clickFirstElementToHighlight() {
        sleep(1000); // to help notice a click
        Highlighter.markElement(firstElementToHighlightClick).click();
    }

    public void clickSecondElementToHighlight() {
        sleep(1000); // to help notice a click
        Highlighter.markElement(secondElementToHighlightClick).click();
    }

    public void clickThirdElementToHighlight() {
        sleep(1000); // to help notice a click
        Highlighter.markElement(thirdElementToHighlightClick).click();
    }

    public void clickFourthElementToHighlight() {
        sleep(1000); // to help notice a click
        Highlighter.markElement(fourthElementToHighlightClick).click();
    }
}
