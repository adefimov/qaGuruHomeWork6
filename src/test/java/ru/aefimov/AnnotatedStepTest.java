package ru.aefimov;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {
    private static final String REPOSITORY = "adefimov/qaGuruHomeWork6";
    WebSteps step = new WebSteps();

    @Test
    void annotatedSearchIssues() {
        step.openPage();
        step.searchRepository(REPOSITORY);
        step.openRepository(REPOSITORY);
        step.checkIssues();
    }
}
