import java.util.ArrayList;
import java.util.List;

/*
    Part VII Answer: No
    Part VIII Answer: Yes
 */

public class ClimbingClub {
    private List<ClimbInfo> climbList;

    public static void main(String[] args) {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
    }

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime) {
        String name;

        for (int i = 0; i < climbList.size(); i++) {
            name = climbList.get(i).getName();

            if (peakName.compareTo(name) <= 0) { // Check we are in right position to insert
                climbList.add(i, new ClimbInfo(peakName, climbTime));
                break;
            }
        }
    }

    public int distinctPeakNames() {
        /* implementation shown in part (c) */
    }
}