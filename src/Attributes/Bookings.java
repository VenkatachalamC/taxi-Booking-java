package Attributes;

public class Bookings {
    int charge;
    int traveltime;
    String customername;
    char source,destination;
    public Bookings(int charge,char source,char Destination,String CustomerName,int traveltime){
        this.charge=charge;
        this.source=source;
        this.destination=Destination;
        this.customername=CustomerName;
        this.traveltime=traveltime;
    }
}
