package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Coyote Tango");
        jaeger1.setOrigin("Japan");
        jaeger1.setSpeed(5);
        jaeger1.setStrenght(7);
        System.out.println("Created: " + jaeger1);
        if (jaeger1.accelerate()) {
            jaeger1.setSpeed(7);
        }
        
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "China", 8, 9);
        System.out.println("Created: " + jaeger2);
        jaeger2.move();
    }
}
