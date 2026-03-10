package BasicInterface;

public interface App {
    public void m();
    }

class Bpp{

    public static void main(String[] args) {
        App a = new App() {
            @Override
            public void m() {
                System.out.println("overriding m1 in class B");
            }
        };
        a.m();
    }

}
