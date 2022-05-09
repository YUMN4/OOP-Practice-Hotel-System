public class Main {

    public static void main(String[] args){
        int roomID = 10;
        int numOfBeds = 2;
        double costPerDay = 45.00;
        Room room = new Room(roomID, numOfBeds, costPerDay);

        Customer customer_1 = new Customer( "Elif", 1234321,  "Cash", "Elif80@gmail.com",  531123456,  "12/03/1980", "12/05/2022", 7);
        Customer customer_2 = new Customer( "Ali", 3795964,  "Credit card", "Ali89@gmail.com",  535001127,  "23/08/1989", "13/06/2022", 4);

        Hotel hotel = new Hotel(1,"Hilton", 5, 5,0);

        hotel.reserveRoom(room, customer_1);
        int index = hotel.getRoomIndex(customer_1.getPassportID());
        hotel.checkOut(index);
    }
}
