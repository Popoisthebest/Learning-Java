package MoviewithGPT;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 영화 목록 생성
        Movie[] movies = {new Movie("듄"), new Movie("아바타"), new Movie("기생충")};
        
        // 영화 선택
        System.out.println("영화를 선택하세요: ");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("[" + (i + 1) + "] " + movies[i].getTitle());
        }
        int movieChoice = scanner.nextInt();
        Movie selectedMovie = movies[movieChoice - 1];
        
        // 영화 티켓 객체 생성
        MovieTicket ticket = new MovieTicket(selectedMovie, 30);
        
        // 좌석 선택 및 예약
        ticket.printSeats();
        System.out.println("좌석을 선택하세요:");
        int seatChoice = scanner.nextInt();
        ticket.bookSeat(seatChoice);
        
        // 영수증 출력
        Receipt receipt = new Receipt();
        receipt.printReceipt(ticket);
        
        scanner.close();
    }
}
