package NewMovie;

public class MovieTest {
    public static void main(String[] args) {

        // 영화 생성자
        MovieTicket nMT = new MovieTicket();

        // 영화 선택지
        System.out.println("영화 예메 프로그램에 오신것을 환영합니다. 원하시는 영화를 선택해 주세요.");
        System.out.print("[1] 듄, [2] 아바타, [3] 기생충 (원하시는 영화의 숫자를 선택해 주세요.): ");

        // 영화 setter
        nMT.setMovie();

        // 자리 선택
        nMT.printSeats();
        System.out.print("원하시는 자리의 번호를 선택해 주세요: ");

        // 자리 배열 선택
        nMT.setSeats();

        // 추가 자리 선택 여부
        nMT.otherSeat();
    }


}
