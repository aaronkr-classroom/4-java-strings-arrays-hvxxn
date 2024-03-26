public class Ex502 {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double max(double a, double b) {
        if (a >= b)
            return a;
        else
            return b;
    }

    public static double min(double a, double b) {
        if (a <= b)
            return a;
        else
            return b;
    }

    public static void factorial(int a) {
        int result = a;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(("Factorial of " + a + "! " + result));
    }

    // Circle
    public static void circ(int a) {
        System.out.println(
                "Pizza size: " + a + " inches: "
                        + 2 * a * 3.1415792);
    }

    public static void area(double a) {
        System.out.println(
                "Pizza area: " + a + " inches: "
                        + a * a * 3.1415792);
    }

    public static void main(String[] args) {
        double a = 15;
        double b = 7.5;

        factorial(a);
        factorial(b);

        System.out.println("Calulator program: ");
        System.out.println("Add: " + a + "+" + b + "=" + add(a.b));
        System.out.println("Subtract: " + a + "-" + b + "=" + sub(a.b));
        System.out.println("Multiplay: " + a + "*" + b + "=" + mult(a.b));
        System.out.println("Divide: " + a + "/" + b + "=" + div(a.b));

        System.out.println("Max: " + a + "," + b + "=" + mult(a.b));
        System.out.println("Min: " + a + "," + b + "=" + div(a.b));

        // Circle (pizza) 계산
        circ(b);
        area(b);
    }

}