package MoviewithModel.Classes.SelectOther;

import MoviewithModel.Classes.MovieTicket;
import MoviewithModel.Classes.Receipt;
import MoviewithModel.Classes.checkErrors.CheckSeatExist;

import java.util.Scanner;

public class SelectOtherSeats {
    Scanner input = new Scanner(System.in);
    
    MovieTicket ticket;
    
    CheckSeatExist checkSeatExist = new CheckSeatExist();
    Receipt receipt = new Receipt();
    
    public SelectOtherSeats(MovieTicket ticket) {
        this.ticket = ticket;
    }
    
    public void otherSeat() {
        System.out.print("자리를 추가로 선택하시겠습니까?(y/n): ");
        
        char addSeat = input.next().charAt(0);
        
        if (addSeat == 'y') {
            System.out.print("원하시는 자리의 번호를 선택해 주세요: ");
            checkSeatExist.checkSeatNumExist();
            ticket.bookSeat(checkSeatExist.getSeat());
        } else if (addSeat == 'n') {
            receipt.printReceipt(ticket);
        } else {
            System.out.print("다시 입력해 주세요: ");
            otherSeat();
        }
    }
}
