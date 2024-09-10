package VariablesAndTypes;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로의 길이는?(단위: m): ");
        float width = scanner.nextFloat();

        System.out.print("세로의 길이는?(단위: m): ");
        float height = scanner.nextFloat();

        float area = width * height;
        float perimeter = (width + height) * 2;

        System.out.println("직사각형의 넓이: " + area);
        System.out.println("직사각형의 둘레: " + perimeter);
    }

}
