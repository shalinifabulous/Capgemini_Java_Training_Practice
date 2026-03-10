package OOPs_Practice;

public class Super {
Super(){
    super();
    System.out.println("in Super");
}
Super(int a){
    super();
    System.out.println("in Super int");
}
}

class Duper extends Super{
    Duper(){
        super();
        System.out.println("in Duper");
    }
    Duper(int b){
      this();
        System.out.println("in Duper int");
    }

    public static void main(String[] args) {
        Duper obj = new Duper(6);
    }

}
