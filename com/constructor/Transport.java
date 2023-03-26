package com.constructor;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        setValues(speed,weight,color,coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinate) {
        setValues(weight,coordinate);
        System.out.println(getValues());
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color;
        String infoCoordinates = ". Coordinates:\n";
        for (byte b : coordinate) infoCoordinates += b + "\n";
        return info + infoCoordinates;
    }

    private void setValues(int weight, byte[] coordinate) {
        this.weight= weight;
        this.coordinate= coordinate;
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
}
