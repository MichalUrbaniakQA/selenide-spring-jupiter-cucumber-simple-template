package e2e.glue;

import e2e.pages.WikiPage;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class WikiDef implements En {

    @Autowired
    private WikiPage wikiPage;


    public WikiDef() {

        Given("^Example1$", () -> {
            System.out.println("Start example test 1");
            wikiPage.assertPresentationBoxIsVisible();
            System.out.println("End example test 1");
        });

        Given("^Example2$", () -> {
            System.out.println("Start example test 2");
            wikiPage.assertWikiLogoIsVisible();
            System.out.println("End example test 2");

            wikiPage.clickFirstElementToHighlight();
            wikiPage.clickSecondElementToHighlight();
            wikiPage.clickThirdElementToHighlight();
            wikiPage.clickFourthElementToHighlight();
        });

        Given("^Example3$", () -> {
            System.out.println("Start example test 3");
            System.out.println("End example test 3");
        });
    }
}
