public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int iDist, int iMaxHops) {
        goalDistance = iDist;
        maxHops = iMaxHops;
    }

    private int hopDistance() {}

    public boolean simulate() {
        int iCurFrogPos = 0;
        int iHopsLeft = maxHops;

        while(iCurFrogPos < goalDistance && iCurFrogPos >= 0 && iHopsLeft > 0) {
            // Just loop it for as long as it takes.
            iCurFrogPos += hopDistance();
            iHopsLeft--;
        }

        return iCurFrogPos >= goalDistance; // Determines if we got to or further than our intended goal
    }

    public double runSimulations(int iNum) {
        int successfulRuns = 0;

        for(int i = 1; i <= iNum; i++) {
            if (simulate()) {
                // We made it. That was a success
                successfulRuns++;
            }
        }

        return successfulRuns / (double) iNum;
    }
}
