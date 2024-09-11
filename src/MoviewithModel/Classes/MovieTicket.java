package MoviewithModel.Classes;

import java.util.ArrayList;
import java.util.List;

public class MovieTicket {
    
    private MovieModel selectdMovie;
    private List<Seat> seats;
    
    // 기본 생성자 및 자리 배열 생성
    public MovieTicket(MovieModel movie, int totalSeats) {
        this.selectdMovie = movie;
        seats = new ArrayList<>();
        for (int i = 0; i < totalSeats; i++) {
            seats.add(new Seat(i + 1));
        }
    }
    
    // 자리 출력
    public void printSeats() {
        System.out.println();
        System.out.println("--------------[💺자리💺]--------------");
        
        for (Seat seat : seats) {
            // 한 줄에 5개씩 배치
            if (seat.getSeatNumber() % 5 == 0) {
                // 이미 예약되어 있는지 검사
                System.out.println(seat.isBooked() ? "[" + seat.getSeatNumber() + "✅]" : "[" + seat.getSeatNumber() + "]");
            } else {
                // 이미 예약되어 있는지 검사
                System.out.print(seat.isBooked() ? "[" + seat.getSeatNumber() + "✅]" : "[" + seat.getSeatNumber() + "]");
            }
        }
    }
    
    // 자리 예약하기
    public void bookSeat(int seatNumber) {
        // seats 배열에서 자리 선택한 불러오기
        Seat seat = seats.get(seatNumber - 1);
        
        // 이미 예약되어 있는 자리인지 검사
        if (!seat.isBooked()) {
            seat.bookSeat();
            System.out.println(seatNumber + "번 자리가 예약되었습니다.✅");
        } else {
            System.out.println(seatNumber + "번 자리는 이미 예약되어 있습니다. 다른 자리를 선택해 주세요.❌");
        }
    }
    
    // 선택된 영화 getter
    public MovieModel getSelectedMovie() {
        return selectdMovie;
    }
}
