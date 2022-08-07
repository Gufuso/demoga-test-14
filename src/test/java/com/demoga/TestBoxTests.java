package com.demoga;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 10000; // 10 seconds
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Egor");
        $("#userEmail").setValue("Egor@egor.com");
        $("#currentAddress").setValue("some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output #email").shouldHave(text("Egor@egor.com"));
        $("#output #currentAddress").shouldHave(text("some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 1"));

    }
}
