package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;
        double possiblyIrrational1 = e + pi;
        double possiblyIrrational2 = e * pi;
        System.out.println(possiblyIrrational1);
        System.out.println(possiblyIrrational2);
        System.out.println(Math.pow(possiblyIrrational1, possiblyIrrational2));

        for (int i = 0; i < Math.pow(possiblyIrrational1, possiblyIrrational2); i++) {
            if (i % 1234567 == 0) {
                System.out.println("This is divisible by 1234567: " + i);
            }
            else if (Math.floor(i / 1234568) == ((double) i / 1234568)) {
                System.out.println("This is divisible by 1234568: " + i);
            }
        }
    }
}
