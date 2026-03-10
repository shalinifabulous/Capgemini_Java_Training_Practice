package OOPs_Practice;

public class Human {
    private int age = 23;
    private String name = "Shalini";

    Human(){
        System.out.println("in constructor");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Demo{
public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(22);
    obj.setName("Shalini");
    System.out.println(obj.getAge() + obj.getName());
}
}