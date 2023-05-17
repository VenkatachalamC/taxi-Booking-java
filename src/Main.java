import Attributes.BookingController;
import Attributes.Car;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Car c1=new Car(0,"kowshick",'A',6);
        Car c2=new Car(0,"venkat",'A',6);
        BookingController controller=new BookingController();
        controller.addCar(c1);
        controller.addCar(c2);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.showcars\n2.BookCar\n3.show earnings of everyDriver\n4.show travel details of Driver");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    controller.showCars();
                    break;
                case 2: {
                    System.out.println("Enter your name");
                    String name = sc.next();
                    System.out.println("Enter your location");
                    char source = sc.next().charAt(0);
                    System.out.println("Enter your Destination");
                    char destination = sc.next().charAt(0);
                    System.out.println("Enter Charge");
                    int charge = sc.nextInt();
                    System.out.println("Enter your starttime");
                    int time = sc.nextInt();
                    List<Car> sortedAccToEarnings=controller.findavailablecars(time,destination);
                    controller.Book(name, source, destination, charge,time,sortedAccToEarnings.get(0).getId());
                    break;
                }
                case 3:
                    controller.showEarnings();
                    break;
                case 4:{
                    System.out.println("Enter driver id");
                    int id=sc.nextInt();
                    controller.showBookingsforid(id);
                } break;
                default:
                    System.exit(0);
            }
        }
    }
}