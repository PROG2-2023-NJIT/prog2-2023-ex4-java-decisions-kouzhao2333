package prog2.exercise4.flight.booking.system;


import java.util.Random;
import java.time.LocalDate;

public class FlightBooking {
    Random r = new Random();
    //flightCompany
    private final String flightCompany = "Flights-of-Fancy";

    public String getFlightCompany(){ return flightCompany;};

    //flightID




    //passengerFullName

    private String passengerFullName;

    public  String getPassengerFullName(){
        return passengerFullName;
    }


    //source and destination

    enum TripSource{NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS}
    enum TripDestination{NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS}

    enum SourceAirport{NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT
    , SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT ,OULU_AIRPORT ,HELSINKI_AIRPORR ,PARIS_CHARLES_DE_GAULLE_AIRPORT}
    enum DestinationAirport{NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT
        , SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT ,OULU_AIRPORT ,HELSINKI_AIRPORR ,PARIS_CHARLES_DE_GAULLE_AIRPORT}

    public String choice3;
    public String choice33;

    public String choice4;
    public String choice44;
    private String tripSource;

    public TripSource getTripSource() {
        return TripSource.valueOf(tripSource);
    }

    String tripDestination;
    String reTripDestination;
    public void setTripSource(String tripSource){
        switch (tripSource){
            case "1":
                choice4 = String.valueOf(TripSource.NANJING);
                choice44 = String.valueOf(SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT);
                break;
            case "2":
                choice4 = String.valueOf(TripSource.BEIJING);
                choice44 = String.valueOf(SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT);
                break;
            case "3":
                choice4 = String.valueOf(TripSource.SHANGHAI);
                choice44 = String.valueOf(SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT);
                break;
            case "4":
                choice4 = String.valueOf(TripSource.OULU);
                choice44 = String.valueOf(SourceAirport.OULU_AIRPORT);
                break;
            case "5":
                choice4 = String.valueOf(TripSource.HELSINKI);
                choice44 = String.valueOf(SourceAirport.HELSINKI_AIRPORR);
                break;
            case  "6":
                choice4 = String.valueOf(TripSource.PARIS);
                choice44 = String.valueOf(SourceAirport.PARIS_CHARLES_DE_GAULLE_AIRPORT);
                break;
        }

    }
    public void setTripDestination(String tripDestination, String reTripDestination){
        switch (tripDestination){
            case "1":
                choice3 = String.valueOf(TripDestination.NANJING);
                choice33 = String.valueOf(DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT);
                break;
            case "2":
                choice3 = String.valueOf(TripDestination.BEIJING);
                choice33 = String.valueOf(DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT);
                break;
            case "3":
                choice3 = String.valueOf(TripDestination.SHANGHAI);
                choice33 = String.valueOf(DestinationAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT);
                break;
            case "4":
                choice3 = String.valueOf(TripDestination.OULU);
                choice33 = String.valueOf(DestinationAirport.OULU_AIRPORT);
                break;
            case "5":
                choice3 = String.valueOf(TripDestination.HELSINKI);
                choice33 = String.valueOf(DestinationAirport.HELSINKI_AIRPORR);
                break;
            case  "6":
                choice3 = String.valueOf(TripDestination.PARIS);
                choice33 = String.valueOf(DestinationAirport.PARIS_CHARLES_DE_GAULLE_AIRPORT);
                break;
        }

        tripSource ="";
        if(tripSource.equals(tripDestination)){
            switch (reTripDestination){
                case "1":
                    choice3 = String.valueOf(TripDestination.NANJING);
                    choice33 = String.valueOf(DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT);
                    break;
                case "2":
                    choice3 = String.valueOf(TripDestination.BEIJING);
                    choice33 = String.valueOf(DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT);
                    break;
                case "3":
                    choice3 = String.valueOf(TripDestination.SHANGHAI);
                    choice33 = String.valueOf(DestinationAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT);
                    break;
                case "4":
                    choice3 = String.valueOf(TripDestination.OULU);
                    choice33 = String.valueOf(DestinationAirport.OULU_AIRPORT);
                    break;
                case "5":
                    choice3 = String.valueOf(TripDestination.HELSINKI);
                    choice33 = String.valueOf(DestinationAirport.HELSINKI_AIRPORR);
                    break;
                case  "6":
                    choice3 = String.valueOf(TripDestination.PARIS);
                    choice33 = String.valueOf(DestinationAirport.PARIS_CHARLES_DE_GAULLE_AIRPORT);
                    break;
            }

        }

    }






    //Date



    private LocalDate departureDate = LocalDate.ofEpochDay(2023-03-13);
    public void setDepartureDate(LocalDate departureDate){
        this.departureDate = departureDate;
    }
    public  LocalDate getDepartureDate()
    {

        return departureDate;
    }


    private  LocalDate returnDate = LocalDate.ofEpochDay(2023-03-13);

    public void setReturnDate(LocalDate returnDate){
         this.returnDate = returnDate;}

    public  LocalDate getReturnDate()
    {


        return returnDate;
    }
    long day=returnDate.toEpochDay() - departureDate.toEpochDay() ;

    public LocalDate setJudge(){
        if(day == 1){
            returnDate=returnDate.plusDays(1);

        }else if ( day == 2){
            returnDate=returnDate.plusDays(2);
        }
        else {
            returnDate = returnDate;
        }

        return returnDate;}

    //passengers

    private int childPassengers;
    public  int getChildPassengers(){
        return childPassengers;
    }

    private int adultPassengers;

    public int getAdultPassengers(){
        return adultPassengers;
    }

    private int totalPassengers;

    public void setTotalPassengers(int childPassengers, int adultPassengers){
        this.totalPassengers = childPassengers + adultPassengers;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }

    //ticket price

    private int departingTicketPrice;
    private int returnTicketPrice;

    private int totalTicketPrice;

    public int getTotalTicketPrice(){


        return totalTicketPrice;

    }

    public  void setTotalTicketPrice( int childPassengers , int adultPassengers){

        departingTicketPrice = 300*adultPassengers + 150*childPassengers;
        returnTicketPrice = 350*adultPassengers + 200*childPassengers;
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }


    //bookingClass
    enum BookingClass{ FIRST, BUSINESS, ECONOMY}
    public String choice;
    public String bookingClass;
    public void setBookingClass(String bookingClass){
        switch (bookingClass){
            case "1":
            choice = String.valueOf(BookingClass.FIRST);
            break;

            case "2":
            choice = String.valueOf(BookingClass.BUSINESS);
            break;

            case "3":
            choice= String.valueOf(BookingClass.ECONOMY);
            break;
        }

    }

    //tripType

    enum TripType{ ONE_WAY,RETURN}

    public String choice2;

    String tripType;

    public  void setTripType( String tripType){

        switch (tripType){

            case "1":
                choice2 = String.valueOf(TripType.ONE_WAY);
                break;
            case "2":
                choice2 = String.valueOf(TripType.RETURN);
        }
    }



    //ticket number
    private String ticketNumber ;



    enum China {NANJING ,BEIJING ,SHANGHAI}
    enum Finland {OULU ,HELSINKI}
    enum France {PARIS}

    public void setTicketNumber(){

        String ticketNumber01 ="0";
        String ticketNumber02 ="0";
        String ticketNumber03 ="0";
        String ticketNumber04 ="DOM";
        if( choice2.equals(String.valueOf(TripType.ONE_WAY) )){
            ticketNumber01 = "11";
        }
        else  if (choice2.equals(String.valueOf(TripType.RETURN)  ))
        {
            ticketNumber01 = "22";
        }


        if( choice.equals(String.valueOf(BookingClass.FIRST)) ){

            ticketNumber02 ="F";


        } else if (choice.equals(String.valueOf(BookingClass.BUSINESS)) ){
            ticketNumber02 = "B";
        } else if (choice.equals(String.valueOf(BookingClass.ECONOMY))){
            ticketNumber02 = "E";
        }
          ticketNumber03 = getRandomString(4);




        ticketNumber = ticketNumber01 + ticketNumber02 +ticketNumber03 +ticketNumber04;




    }
    public String getTicketNumber() {


        return ticketNumber;
    }




    FlightBooking(String passengerFullName ,LocalDate departureDate ,LocalDate returnDate , int adultPassengers ,int childPassengers ){
        this.passengerFullName = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;

        setTotalPassengers(childPassengers ,adultPassengers);
        setTotalTicketPrice(departingTicketPrice , returnTicketPrice);
        setTicketNumber();
        setDepartureDate(departureDate);
        setReturnDate(returnDate);
        setJudge();

    }
    void F(String bookingClass, String tripType, String tripSource, String tripDestination, String reTripDestination){

        this.bookingClass = bookingClass;
        this.tripType =tripType;
        this.tripSource = tripSource;
        this.tripDestination = tripDestination;
        this.reTripDestination = reTripDestination;

        setTripType(tripType);
        setTripSource(tripSource);
        setTripDestination(tripDestination, reTripDestination);
        setTicketNumber();
    }

    public static String getRandomString(int number){

        String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i < number; i++ ){

            int num = r.nextInt(26);
            sb.append(str.charAt(num));
        }
        return sb.toString();
    }



    public String toString(){

        String paper;
        if(day ==0){paper=  "Dear" + passengerFullName +"."+ "Thank you for booking your flight with " + flightCompany +"."+"\n" +
                "Following are the details of your booking and the trip: \n" +
                "Ticket Number: " + ticketNumber +"\n" +
                "From " + choice4 + "to" +choice3 +"\n" +
                "Date of departure: " +departureDate +"\n" +
                "Date of return: "+ returnDate +"\n" +"(Changed from old " + returnDate.plusDays(-2)+" to new" + returnDate+")"+
                "Total passengers:" + totalPassengers+"\n" +
                "Total ticket price in Euros: " + totalTicketPrice+"\n"+
                "Air travel accommodation :" + choice +"\n"+
                "Trip type :" +choice2+"\n"+
                "Trip Source:" + choice4+"" +"\n"+
                "Source Airport: "+choice44+"\n"+
                "Trip Destination:" +choice3+"\n"+
                "Destination Airport:" +choice33+"\n";}

        else if(day == 1){
            paper = "Dear" + passengerFullName +"."+ "Thank you for booking your flight with " + flightCompany +"."+"\n" +
                    "Following are the details of your booking and the trip: \n" +
                    "Ticket Number: " + ticketNumber +"\n" +
                    "From " + choice4 + "to" +choice3 +"\n" +
                    "Date of departure: " +departureDate +"\n" +
                    "Date of return: "+ returnDate +"\n" +"(Changed from old " + returnDate.plusDays(-1)+" to new" + returnDate+")"+
                    "Total passengers:" + totalPassengers+"\n" +
                    "Total ticket price in Euros: " + totalTicketPrice+"\n"+
                    "Air travel accommodation :" + choice +"\n"+
                    "Trip type :" +choice2+"\n"+
                    "Trip Source:" + choice4+"" +"\n"+
                    "Source Airport: "+choice44+"\n"+
                    "Trip Destination:" +choice3+"\n"+
                    "Destination Airport:" +choice33+"\n";
        }

        else {
            paper = "Dear" + passengerFullName +"."+ "Thank you for booking your flight with " + flightCompany +"."+"\n" +
                    "Following are the details of your booking and the trip: \n" +
                    "Ticket Number: " + ticketNumber +"\n" +
                    "From " + choice4 + "to" +choice3 +"\n" +
                    "Date of departure: " +departureDate +"\n" +
                    "Date of return: "+ returnDate +"\n" +
                    "Total passengers:" + totalPassengers+"\n" +
                    "Total ticket price in Euros: " + totalTicketPrice+"\n"+
                    "Air travel accommodation :" + choice +"\n"+
                    "Trip type :" +choice2+"\n"+
                    "Trip Source:" + choice4+"" +"\n"+
                    "Source Airport: "+choice44+"\n"+
                    "Trip Destination:" +choice3+"\n"+
                    "Destination Airport:" +choice33+"\n";
        }



        return paper;
    }


}