import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers; // The student's answers

    public double getScore(ArrayList<String> key) {
        int iScore = 0;

        for (int i = 0; i < key.size(); i++) {
            if (key.get(i) == answers.get(i)) {
                iScore += 1;
            } else {
                iScore -= 0.25;
            }
        }

        return iScore;
    }
}
