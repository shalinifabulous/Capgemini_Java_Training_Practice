package BasicInterface;

public interface A {
    public void m1();
    public void m2();
    public void m3();
    default void m4(){
        System.out.println("default");
    }
}

abstract class B implements A{
    public void m1(){
        System.out.println("m1 method in B");
    }
    public void m4(){
        System.out.println("B");
    }
}

abstract class C implements A{
    public void m1(){
        System.out.println("m1 of C");
    }
}
