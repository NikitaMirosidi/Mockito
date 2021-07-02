public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        System.out.println(store.getPrice(" ABCDABA"));
        System.out.println(store.getPrice(" ABs+CDAhBA"));
        System.out.println(store.getPrice(" "));
        System.out.println(store.getPrice("dgslzkglkwgphertfgh43t0243t+-r235>"));
        System.out.println(store.getPrice("aaBBbaCCc" + "ccDDdddAdBC"));
        System.out.println(store.getPrice("aaCc" + "ccDBC" + 1 + 'd'));
    }
}