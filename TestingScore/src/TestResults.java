import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent(ArrayList<String> key) {
        // This gets filled in later. Just set it to the 1st index so we can reference it
        StudentAnswerSheet iHighestScore = sheets.get(0);

        // Thanks for simplifying my loop IntellJ
        for (StudentAnswerSheet sheet : sheets) {
            if (iHighestScore.getScore(key) < sheet.getScore(key)) {
                iHighestScore = sheet;
            }
        }
    }
}
