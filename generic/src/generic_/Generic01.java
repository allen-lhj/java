package generic_;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 2));
        arrayList.add(new Dog("旺财1", 4));
        arrayList.add(new Dog("旺财2", 12));

        for (Object o: arrayList) {
            Dog dog = (Dog) o;
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}