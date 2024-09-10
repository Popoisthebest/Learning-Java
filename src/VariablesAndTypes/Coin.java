package VariablesAndTypes;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("500원짜리 동전의 갯수: ");
        int fiveHundred = scanner.nextInt() * 500;

        System.out.print("100원짜리 동전의 갯수: ");
        int oneHundred = scanner.nextInt() * 100;

        System.out.print("50원짜리 동전의 갯수: ");
        int fifty = scanner.nextInt() * 50;

        System.out.print("10원짜리 동전의 갯수: ");
        int ten = scanner.nextInt() * 10;

        int total = fiveHundred + oneHundred + fifty + ten;

        System.out.print("저금통 안의 동전의 총 액수: " + total);
    }
}
