package Attributes;

import java.util.*;

class Carcompare implements Comparator<Car>{
    public int compare(Car c1,Car c2){
        if(c1.earning==c2.earning) return 0;
        if(c1.earning>c2.earning) return 1;
        return -1;
    }
}
public class BookingController {
    List<Car> li;

    public BookingController(){
        this.li=new ArrayList<>();
    }
    public void addCar(Car c){
        this.li.add(c);
    }
    public void Book(String Customername,char source,char Destinantion,int charge,int traveltime,int carid){
        Bookings b=new Bookings(charge,source,Destinantion,Customername,traveltime);
        Car c=li.stream().filter(item->item.id==carid).findFirst().get();
        c.addBooking(b);
    }
    public void showBookingsforid(int id){
        Car c=li.stream().filter(item->item.id==id).findFirst().get();
        c.showBookings();
    }
    public void showCars(){
        for(Car c:li){
            System.out.println(c.id+"\t"+c.DriverName+"\t"+c.earning);
        }
    }
    public void showEarnings(){
        for(Car c:li){
            System.out.println(c.DriverName+"\t"+c.earning);
        }
    }

    public List<Car> findavailablecars(int starttime,char destination){
        Collections.sort(li,new Carcompare());
        List<Car> tmp=new ArrayList<>();
        for(Car c:li){
            if(c.availabletime<=starttime){
                tmp.add(c);
            }
        }
        return tmp;
    }
}
