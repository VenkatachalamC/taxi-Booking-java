package Attributes;

import java.util.ArrayList;
import java.util.*;

public class Car {
    int id;

    public int getId() {
        return id;
    }

    static int counter=0;
    int earning;
    String DriverName;
    char currentposition;
    int  availabletime;
    List<Bookings> bookings;
    public Car(int earning,String name,char currentposition,int availabletime){
        this.id=++counter;
        this.earning=earning;
        this.DriverName=name;
        this.currentposition=currentposition;
        this.availabletime=availabletime;
        this.bookings=new ArrayList<Bookings>();
    }
    public void addBooking(Bookings b) {
        earning+=b.charge;
        availabletime += Math.abs(b.destination - this.currentposition);
        currentposition=b.destination;
        bookings.add(b);
    }
    public void showBookings(){
        System.out.println("Showing Bookings details of Driver "+DriverName+"\tcurrent location"+currentposition);
        System.out.println("Availabletime"+availabletime);
        for(Bookings booking:bookings){
            System.out.println(booking.source+"\t"+booking.destination+"\t"+"\t"+booking.customername+"\t"+booking.charge);
        }
    }
}
