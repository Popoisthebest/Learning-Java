package NewMovie;

import java.util.Scanner;

public class MovieTicket {
    Scanner input = new Scanner(System.in);

    // 영화
    public String movie;
    public String[] movies = {"듄", "아바타", "기생충"};

    // 자리
    public static int[] seats = new int[30];

    // 영화 생성자 생성
    public MovieTicket() {
        initSeat();
    }

    // 영화 선택 setter
    public void setMovie() {
        // 영화 번호 받기
        String movieStr = input.next();

        // 영화 번호
        int movieNum;

        // String 을 int 로 변환, 존재하는 영화 번호인지 확인
        switch (movieStr) {
            case "1":
                movieNum = 1;
                movie = movies[movieNum - 1];
                break;
            case "2":
                movieNum = 2;
                movie = movies[movieNum - 1];
                break;
            case "3":
                movieNum = 3;
                movie = movies[movieNum - 1];
                break;
            default:
                System.out.print("존재하는 영화 번호를 선택해 주세요: ");
                setMovie();
                break;
        }
    }

    // 자리 배열 초기화
    public static void initSeat() {
        for (int i = 0; i < 30; i++) {
            seats[i] = 0;
        }
    }

    // 자리 그리기
    public void printSeats() {
        System.out.println();

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

    // 자리 배열 선택
    public void setSeats() {
        int seat = 0;

        // 예외 감지
        try {
            seat = Integer.parseInt(input.next());
            // 존재하는 자리인지 검사
            if (seat >= 1 && seat <= 30) {
                // 이미 선택되어있는 자리인지 검사
                if (seats[seat - 1] == 1) {
                    reOtherSeat();
                } else {
                    seats[seat - 1] = 1;

                    // 다시 자리 그리기
                    printSeats();

                    // 추가 자리 선택 여부
                    otherSeat();
                }
            } else {
                reSeatsSelect();
            }
        } catch (NumberFormatException e) {
            reSeatsSelect();
        }


    }

    // 자리 배열 재선택
    public void reSeatsSelect(){
        System.out.print("존재하지 않는 자리입니다. 다시 자리를 선택해 주세요: ");
        setSeats();
    }

    // 추가 자리 선택 여부
    public void otherSeat() {
        System.out.print("자리를 추가로 선택하시겠습니까?(y/n): ");

        char addSeat = input.next().charAt(0);

        if (addSeat == 'y') {
            System.out.print("원하시는 자리의 번호를 선택해 주세요: ");
             setSeats();
        } else if (addSeat == 'n') {
            receipt();
        } else {
            System.out.print("다시 입력해 주세요: ");
            otherSeat();
        }
    }

    // 다시 자리 선택
    public void reOtherSeat() {
        System.out.print("이 자리는 이미 선택되어 있습니다. 다른 자리를 다시 선택해 주세요: ");
        setSeats();
    }

    // 영수증
    public void receipt() {
        System.out.println();
        System.out.println();
        System.out.println("---------------[영수증]---------------");
        System.out.println("영화 이름: " + movie);
        System.out.println("구메 좌석: ");
        printSeats();
        System.out.println("-------------------------------------");
        System.out.println("구메해 주셔서 감사합니다.");
        System.exit(0);
    }
}
