package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String passengerFullName = sc.nextLine();
        System.out.println("Please enter the departure date (in the form yyyy-mm-dd");
        String strDepartureDate = sc.nextLine();
        LocalDate departureDate = LocalDate.parse(strDepartureDate);
        System.out.println("Please enter the departure date (in the form yyyy-mm-dd");
        String strReturnDate = sc.nextLine();
        LocalDate returnDate = LocalDate.parse(strReturnDate);
        System.out.println("Please enter the amount of child passengers");
        int childPassengers = sc.nextInt();

        System.out.println("Please enter the amount of adult passengers");
        int adultPassengers = sc.nextInt();
        sc.nextLine();
        System.out.println("Please choice the air travel accommodation :\n" +
                "1.First\n"+
                "2.Business\n"+
                "3.Economy\n");


        String bookingClass = sc.nextLine();


        System.out.println("Please choice the trip type\n" +
                "1.One way\n" +
                "2.Return");

        String tripType = sc.nextLine();

           System.out.println("Please choice the trip source\n" +
                   "1.Nanjing\n" +
                   "2.Beijing\n" +
                   "3.Shanghai\n" +
                   "4.Oulu\n" +
                   "5.Helsinki\n" +
                   "6.Paris");
           String tripSource = sc.nextLine();

           System.out.println("Please choice the trip Destination\n" +
                   "1.Nanjing\n" +
                   "2.Beijing\n" +
                   "3.Shanghai\n" +
                   "4.Oulu\n" +
                   "5.Helsinki\n" +
                   "6.Paris");
           String tripDestination= sc.nextLine();

           String reTripDestination = "" ;

           if(tripSource.equals(tripDestination)){
               System.out.println("Source and Destination can not be same.Please choice the trip Destination\n" +
                       "1.Nanjing\n" +
                       "2.Beijing\n" +
                       "3.Shanghai\n" +
                       "4.Oulu\n" +
                       "5.Helsinki\n" +
                       "6.Paris\n");
               reTripDestination = sc.nextLine();


           }





        FlightBooking flightBooking = new FlightBooking(passengerFullName ,departureDate ,returnDate , childPassengers, adultPassengers );
       flightBooking.setTicketNumber();
       flightBooking.setTripType(tripType);
       flightBooking.setTripSource(tripSource);
       flightBooking.setBookingClass(bookingClass);
       flightBooking.setTotalPassengers(childPassengers ,adultPassengers);
       flightBooking.setTripDestination(tripDestination ,reTripDestination);
       flightBooking.setTotalTicketPrice();
        System.out.println(flightBooking);


    }
}
