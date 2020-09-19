package sda.basic.java.gda;

import java.util.Scanner;

public class Ex2 {

    private final static float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();

        float circumference = calculateCircumference(diameter);
        System.out.println("Circumference Of A Circle:" +circumference);

        float area =calculateOfArea(diameter);
        System.out.println("Area Of A Circle:" + area);

    }

    private static float getDiameterFromUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter");
        return scanner.nextFloat();
    }

    protected static float calculateCircumference(float diameter){

        return PI * diameter;

    }

    private static float calculateOfArea(float diameter){
        float radius = diameter /2;
        return PI * (float)Math.pow(radius,2);

    }

}
