public class Oops3 {
    public static void main(String [] args) {
        double bubble = 867.5309;
        double x = 10.01;
        double y = 8.0;
        printer(x, y);
        printer(x, bubble);
        System.out.println("The value from main is: " + bubble);
        int z = 5;
        System.out.println("z = " + z);
    }

    public static void printer(double x, double y) {
        int z = 5;
        System.out.println("x = " + x + " and y = " + y);
    }
}