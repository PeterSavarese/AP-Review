public class CookieOrder {
    private final String varieties;
    private final int boxes;

    /**
     * Constructs a new CookieOrder object.
     */
    public CookieOrder(String variety, int numBoxes) {
        varieties = variety;
        boxes = numBoxes;
    }

    /**
     * @return the variety of cookie being ordered
     */
    public String getVariety() {
        return varieties;
    }

    /**
     * @return the number of boxes being ordered
     */
    public int getNumBoxes() {
        return boxes;
    }
}