import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {
    @Test
    void SelenideSearchTest(){
        //1)открыть страницу Гугла
        open("https://google.com");
        //2)Ввести selenide в поисквоую строку!
        $("[name=q]").setValue("Selenide").pressEnter();
        //sleep(5000);
        //3)Проверить что selenide появилось в результатах поиска
        $("[id=search]").shouldHave(text("selenide.org"));
    }
}

