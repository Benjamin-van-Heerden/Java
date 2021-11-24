package AccessDemo;

public class Access {
    private static class DoPrivate {
        int do1 = 1;
        int do2 = 2;

         void sayHi() {
             System.out.println("Hi");
         }
    }

    // can also put protected and no modifier
    // this class in its state will be available wherever we would like to use it
    public static class DoPublic {
        int doPub = 42;

        double calculateVAT(double num) {
            return num * 1.14;
        }
    }

    public static void main(String[] args) {
        DoPrivate s = new DoPrivate();
        System.out.println(s.do1);
        s.sayHi();

        DoPublic t = new DoPublic();
        System.out.println(t.doPub);
        System.out.println(t.calculateVAT(100));
    }

}

class CanAccess {
    public static void main(String[] args) {
//        // this does not work here
//        Access.DoPrivate s = new Access.DoPrivate();
//        System.out.println(s.do1);
//        s.sayHi();

        // this does
        Access.DoPublic t = new Access.DoPublic();
        System.out.println(t.doPub);
        System.out.println(t.calculateVAT(100));
    }
}


