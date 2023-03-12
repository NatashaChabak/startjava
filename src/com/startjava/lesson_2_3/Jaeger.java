package com.startjava.lesson_2_3;

public class Jaeger {

    final String modelName;
    private String origin;
    private int speed;
    private int strenght;

    public Jaeger(String modelName) {
        this.modelName = modelName;
    }

    public Jaeger(String modelName, String origin) {
        this(modelName, origin, 0, 0);
    }

    public Jaeger(String modelName, String origin, int strenght, int speed) {
        this.modelName = modelName;
        this.origin = origin;
        this.strenght = strenght;
        this.speed =  speed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public boolean accelerate() {
        System.out.println("Accelerating!");
        return true;
    }

    public void move() {
        System.out.println("Moving!");
    }

    public String toString() {
        return String.format("Model: %s \nOrigin: %s \nSpeed: %s\nStrenght: %s", modelName, origin, speed, strenght);
    }
}
