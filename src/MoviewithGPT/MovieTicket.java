package MoviewithGPT;

import java.util.ArrayList;
import java.util.List;

public class MovieTicket {
    
    private Movie selectedMovie;
    private List<Seat> seats;
    
    public MovieTicket(Movie movie, int totalSeats) {
        this.selectedMovie = movie;
        seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }
    
    public void printSeats() {
        System.out.println("Available seats:");
        for (Seat seat : seats) {
            System.out.print(seat.isBooked() ? "[X]" : "[" + seat.getSeatNumber() + "]");
        }
        System.out.println();
    }
    
    public void bookSeat(int seatNumber) {
        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isBooked()) {
            seat.bookSeat();
            System.out.println("Seat " + seatNumber + " booked.");
        } else {
            System.out.println("Seat is already booked. Please choose another seat.");
        }
    }
    
    public Movie getSelectedMovie() {
        return selectedMovie;
    }
}
