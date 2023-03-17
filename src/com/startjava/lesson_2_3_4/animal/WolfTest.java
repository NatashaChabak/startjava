package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Bart");
        wolf.setIsMale(true);
        wolf.setAge(7);
        wolf.setColor("red");
        wolf.setWeight(15);
        System.out.println("Wolf " + wolf.getName() + " is " + wolf.getAge() + " years old");
        wolf.run();
        wolf.sit();
        wolf.walk();
    }
}
