import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
    private final List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int iCount = 0;

        for (int i = 0; i < orders.size(); i++) {
            iCount += orders.get(i).getNumBoxes();
        }

        return iCount;
    }

    public int removeVariety(String cookieVar) {
        int iRemoved = 0; // How many varieties of specified cookie have we removed

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                iRemoved += orders.get(i).getNumBoxes();

                orders.remove(i);
                i--;
            }
        }

        return iRemoved;
    }

    public void dumpOrders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i).getVariety() + " | " + orders.get(i).getNumBoxes());
        }
    }
}
