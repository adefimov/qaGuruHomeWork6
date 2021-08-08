package ru.aefimov;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {

  private static final String REPOSITORY = "adefimov/qaGuruHomeWork6";

        @Test
        void lambdaSearchIssue() {
            step ("Открываем первую страницу github" , () -> open("https://github.com"));
            step ("Ищем репозиторий " + REPOSITORY , () -> {
                $("[placeholder = 'Search GitHub']").setValue(REPOSITORY).pressEnter();
            });
            step ("Переходим в репозиторий " + REPOSITORY, () -> $(".repo-list").$(byLinkText(REPOSITORY)).click());
            step ("Проверяем, что присутствует Issues", () -> {
                $(".UnderlineNav-body").$(byLinkText("Issues")).shouldBe(Condition.visible);
            });
        }


}
