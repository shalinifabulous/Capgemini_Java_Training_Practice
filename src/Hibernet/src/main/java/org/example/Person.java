package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id" + id +
                ", name='" + name + '\'' +
                "}";
    }

    public void setId(int i) {
    }

    public void setName(String nazz) {
    }
}
