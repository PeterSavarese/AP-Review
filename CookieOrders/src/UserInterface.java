public class UserInterface {
    public static void main(String[] args) {
        MasterOrder goodies = new MasterOrder();

        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        goodies.dumpOrders();

        System.out.println("Removed " + goodies.removeVariety("Chocolate Chip") + " orders.");
        System.out.println();

        goodies.dumpOrders();
    }
}
