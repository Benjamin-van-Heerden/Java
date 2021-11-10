package TestPackage;

public class P1 {
    public static int hello_p1(String str) {
        System.out.println("Hello from P1, your input is: " + str);
        double pi = Math.PI;
        System.out.println(pi);
        return 2;
    }

    public static String reverse_string(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }


}
