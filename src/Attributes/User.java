package Attributes;
import java.util.*;
public class User {
    String name;
    String Address;
    static int counter=0;
    int id;
    List<Bookings> bookings;
    public User(String name,String Address){
        this.name=name;
        this.Address=Address;
        this.id=++counter;
        this.bookings=new ArrayList<>();
    }

    void showBookings(){
        for(Bookings booking:bookings){
            System.out.println(booking.source +"to"+booking.destination+","+"charge"+booking.charge);
        }
    }
    void addBookings(Bookings b){
        bookings.add(b);
    }
}
