import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;

    private List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int iRow, int iCol) {
        for (SparseArrayEntry entry: entries) { // Thank you Intelli Idea for condensing this for loop
            if (iRow == entry.getRow() && iCol == entry.getCol()) {
                return entry.getValue(); // We will handle the 0s in their respective functions calling this method
            }
        }
        return 0;
    }

    public void removeColumn(int iCol) {
        List <SparseArrayEntry> tempList = new ArrayList <SparseArrayEntry> ();

        for (int i = 0; i < entries.size(); i++) {
            SparseArrayEntry entry = entries.get(i);

            int c = entry.getCol(); // Get our col from the instance class

            if (c > iCol) { // If we are a column to right of the column we are deleting, shift the values over to the left 1 column
                tempList.add(new SparseArrayEntry(entry.getRow(), c - 1, entry.getValue())); // Shift
            } else if (c < iCol) { // We all gucci, no need to shift values
                tempList.add(entry);
            }
        }
        numCols--; // We are down 1 col
        entries = tempList;
    }
}