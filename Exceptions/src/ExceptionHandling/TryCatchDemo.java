package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            List<Integer> l = new ArrayList<>(10);
            System.out.println("Entering try block");
            double b = 100/0;
            Integer a = l.get(1);
            System.out.println("The first element is " + a);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Could not access at provided index");
        }
        catch (Exception e) {
            System.out.println("This catches a general exception, the exception is: " + e);
            System.out.println("Exceptions can also be rethrown");
            throw e;
        }
        finally {
            System.out.println("This will always be executed, close a file handler or whatever");
        }
    }
}
