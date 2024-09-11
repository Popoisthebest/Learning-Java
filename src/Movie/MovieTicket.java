package Movie;

import java.util.Scanner;

public class MovieTicket {
    static Scanner sc = new Scanner(System.in);

    // 영화 배열 생성
    static String[] movies = {"듄", "아바타", "기생충"};
    // 선택한 영화
    static String movie;
    // 자리 배열 생성
    public static int[] seats = new int[30];

    public static void main(String[] args) {
        setSeats(); // 자리 초기화
        askMovie(); // 영화 선택
        selectSeat(); // 자리 선택
    }
    // 어떤 영화를 선택할지 물어보기
    public static void askMovie() {

        System.out.println("영화 예메 프로그램에 오신것을 환영합니다. 원하시는 영화를 선택해 주세요.");
        System.out.print("[1] 듄, [2] 아바타, [3] 기생충 (원하시는 영화의 숫자를 선택해 주세요.): ");

        movie = movies[sc.nextInt() - 1];
    }

    // 자리 배열 초기화
    public static void setSeats() {
        for (int i = 0; i < 30; i++) {
            seats[i] = 0;
        }
    }

    // 자리 선택 함수
    public static void selectSeat() {
        printSeats();
        System.out.print("원하시는 자리의 번호를 선택해 주세요: ");
        catchSelectedSeats();
        reSelectSeat();
    }

    // 추가자리 선택 함수
    public static void reSelectSeat() {
        System.out.print("혹시 추가로 자리를 선택하실 건가요?(y/n): ");
        String answer = sc.next();
        if (answer.equals("y")) {
            selectSeat();
        } else if (answer.equals("n")) {
            receipt();
        } else {
            System.out.println("다시 입력해 주세요.");
            reSelectSeat();
        }
    }

    // 남은 자리 출력
    public static void printSeats() {
        for (int i = 1; i < 31; i++) {
            if(i % 5 == 0) {
                if (seats[i - 1] == 1) {
                    System.out.println("[" + i + "✅]");
                } else {
                System.out.println("[" + i + "]");
                }
            } else {
                if (seats[i - 1] == 1) {
                    System.out.print("[" + i + "✅]");
                } else {
                    System.out.print("[" + i + "]");
                }
            }
        }
    }


    // 자리 검사
    public static void catchSelectedSeats() {
        int selectedSeat = sc.nextInt(); // 원하는 자리 번호 받기

        // 이미 선택되어있는 자리인지 검사
        if (seats[selectedSeat - 1] == 1) {
            rePrintSeats();
        } else {
            seats[selectedSeat - 1] = 1;
        }

        printSeats();
    }

    // 이미 선택되어 있는 자리를 선택했을 때 함수
    public static void rePrintSeats() {
        System.out.print("이 자리는 이미 선택되어 있습니다. 다른 자리를 다시 선택해 주세요: ");
        catchSelectedSeats();
    }

    // 영수증 출력
    public static void receipt() {
        System.out.println("[영수증]");
        System.out.println(movie);
        printSeats();
    }
}
