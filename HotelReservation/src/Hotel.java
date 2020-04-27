import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms = new Reservation[100];
    private ArrayList waitList = new ArrayList<String>();

    public Reservation requestRoom(String guestName) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                // A reservation is already made in this room. Iterate to the next room #
                continue;
            }

            Reservation tempRes = new Reservation(guestName, i);
            rooms[i] = tempRes;

            return tempRes;
        }

        waitList.add(guestName); // The loop ran through and never returned a value. All rooms taken so add us to waitlist.
        return null;
    }

    public Reservation cancelAndReassign(Reservation res) {
        int iRoomNum = res.getRoomNumber();

        if (rooms[iRoomNum] == null && waitList.isEmpty()) {
            // Something happened and the reservation instance is wrong or we were previously removed and never updated.
            return null;
        }

        if (!waitList.isEmpty()) {
            // The next person in the queue for a room gets this person's room #.
            rooms[iRoomNum] = new Reservation ((String)waitList.get(0), iRoomNum);
            waitList.remove(0);
        } else {
            rooms[iRoomNum] = null;
        }

        return res;
    }
}
