import java.util.List;

public class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int iCount = 0;

        for (String sWord : wordList) {
            // Loop through each value in the ArrayList. The value is a string, just get its length and that is how many characeters not including spaces
            iCount += sWord.length();
        }
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int iGaps = wordList.size() - 1;
        int iSpaces = formattedLen - totalLetters(wordList);

        return iSpaces / iGaps;
    }

    public static String format(List<String> wordList, int formattedLen) {
        int iWidth = basicGapWidth(wordList, formattedLen);
        int iRemainingSpaces = leftoverSpaces(wordList, formattedLen);

        String sFormatted = ""; // Outside the loop for preservation

        for (int i = 0; i < wordList.size(); i++) {
            sFormatted += wordList.get(i); // Concat with our current key in the loop

            for (int j = 0; j <= iWidth; j++) {
                sFormatted  += " ";
            }

            if (iRemainingSpaces > 0) {
                sFormatted += " ";
                iRemainingSpaces--;
            }
        }

        sFormatted += wordList.get(wordList.size() - 1);

        return sFormatted;
    }
}
