package VariablesAndTypes;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);

        System.out.print("원기둥 밑변의 반지를을 입력하시오.(단위: cm): ");
        double radius = scnner.nextFloat();

        System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
        double height = scnner.nextFloat();

        double area = Math.PI * Math.pow(radius, 2);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("원기둥 밑변의 넓이는 " + area + "cm^2이고, 원기둥의 부피는 " + volume + "cm^2이다.");
    }
}
