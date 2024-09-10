package VariablesAndTypes;

public class Star {
    public static void main(String[] args) {
        double distance = 40e12;
        double lightTime = 300000;
        double lightTimeInONeYear = 31536000 * lightTime;

        double time = distance / lightTimeInONeYear;
        System.out.println(time);
    }
}
