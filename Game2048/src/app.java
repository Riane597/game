public class app {

    public static int value = 5;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        app.alwaysTrue();
        app.value = Integer.sum(5, 7);
    }

    public static int min3(int input) {
        return input - 3;
    }

    public static int getValue() {
        return value;
    }

    public static boolean alwaysTrue() {
        return true;
    }
}