public class Vocab {
    /** The controlled vocabulary for a Vocab object. */
    private String[] theVocab = { /* contents not shown */ };

    /** Searches for a string in theVocab. Returns true if its String parameter str
     * is an exact match to an element in theVocab and returns false otherwise.
     */
    public boolean findWord(String str) {
        /* implementation not shown */
    }

    /** Counts how many strings in wordArray are not found in theVocab, as described in
     * part (a).
     */
    public int countNotInVocab(String[] wordArray) {
        /* to be implemented in part (a) */
    }

    /** Returns an array containing strings from wordArray not found in theVocab,
     * as described in part (b).
     */
    public String[] notInVocab(String[] wordArray) {
        String[] notInVocab = {};

        for (int i = 0; i < wordArray.length; i++) {
            if (findWord(wordArray[i]) == false) {
                notInVocab[notInVocab.length] = wordArray[i]; // Getting the length of array just gives us the next position.
            }
        }

        return notInVocab;
    }
}