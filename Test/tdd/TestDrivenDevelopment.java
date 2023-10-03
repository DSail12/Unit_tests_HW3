package hw3.Test.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    @Test
    public void testAnalyseMood_ContainsRefactor_ReturnsRefactor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "I need to refactor this code";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Refactor", mood);
    }

    @Test
    public void testAnalyseMood_ContainsFalling_ReturnsWriteAFallingTest() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "I should write a falling test";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Write a falling test", mood);
    }

    @Test
    public void testAnalyseMood_ContainsNeitherRefactorNorFalling_ReturnsMakeTheTestPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "This code is working fine";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Make the test pass", mood);
    }
}