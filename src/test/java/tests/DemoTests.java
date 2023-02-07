package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DemoTests {

    @Test
    void openYandexMarketTest(){
        Configuration.browserSize="1920x1080";
        open("https://google.ru/");
        $("[name=q]").sendKeys("Яндекс маркет");
        $("[name=q]").pressEnter();
        $x("//a[@href='https://market.yandex.ru/']").shouldBe(visible).click();
        $("#header-search").shouldBe(visible);

    }
}
