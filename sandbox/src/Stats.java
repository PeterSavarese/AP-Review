import java.util.ArrayList;

public class Stats {
    private ArrayList < ScoreInfo > scoreList;

    public Stats(ArrayList < ScoreInfo > scoreList) {
        this.scoreList = scoreList;
    }

    public boolean record(int score) {
        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i).getScore() == score) {
                scoreList.get(i).increment();
                return true;
            } else if (scoreList.get(i).getScore() < score && scoreList.get(i + 1).getScore() > score) {
                scoreList.add(i + 1, new ScoreInfo(score));
                return true;
        }

        return false;
    }

    public void recordScores(int[] stuScores) {
        for (int i = 0; i < stuScores.length; i++) {
            record(stuScores[i]);
        }
    }
}