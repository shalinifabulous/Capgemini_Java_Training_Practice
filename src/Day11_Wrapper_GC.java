public class Day11_Wrapper_GC {

    public static void main(String[] args) {

        System.out.println("Day 11: Wrapper & GC Practice");

        // Autoboxing
        Integer a = 10;
        Double b = 20.5;

        // Unboxing
        int x = a;
        double y = b;

        System.out.println("Integer Object: " + a);
        System.out.println("Double Object: " + b);
        System.out.println("Unboxed int: " + x);
        System.out.println("Unboxed double: " + y);

        // Nullifying reference for GC
        a = null;
        b = null;

        System.gc();
        System.out.println("Garbage Collector Requested");

        System.out.println("Day 11 Practice Completed");
    }
}