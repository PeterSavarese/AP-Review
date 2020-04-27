public class HorseBarn {
    private Horse[] spaces;

    public int findHorseSpace(String name) {
        int iFoundSpace = -1; // -1 if a space isn't found. If a space is found inside the loop, this gets changed.

        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && spaces[i].getName().equals(name)) { // We have to check for null in-case a stall is unoccupied
                iFoundSpace = i; //

                break; // No longer need to loop. We found the horsey.
            }
        }

        return iFoundSpace;
    }

    public void consolidate() {
        for (int i = 0; i < spaces.length - 1; i++) {
            // Let's bubble sort this!
            if (spaces[i] == null) {
                spaces[i] = spaces[i + 1];
                spaces[i + 1] = null;
            }
        }
    }
}
