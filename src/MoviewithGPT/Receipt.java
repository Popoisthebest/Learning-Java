package MoviewithGPT;

public class Receipt {
    public void printReceipt(MovieTicket ticket) {
        System.out.println("----Receipt----");
        System.out.println("Movie: " + ticket.getSelectedMovie().getTitle());
        ticket.printSeats();
        System.out.println("---------------");
    }
}
