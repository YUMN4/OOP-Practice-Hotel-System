
public class Hotel {
    private int hotelID;
    private String hotelName;
    private int numOfStars;
    private int numOfRooms;
    private int numReservedRooms;
    private Room[] roomAr;
    private Customer[] customerAr;

    public Hotel(int hotelID, String hotelName, int numOfStars, int numOfRooms, int numReservedRooms) {
        this.hotelID = hotelID;
        this.hotelName = hotelName;
        this.numOfStars = numOfStars;
        this.numOfRooms = numOfRooms;
        this.numReservedRooms = numReservedRooms;
        this.roomAr = new Room[numOfRooms];
        this.customerAr = new Customer[numOfRooms];
    }

    public void reserveRoom(Room r, Customer c) {
        this.roomAr[numReservedRooms] = r;
        this.customerAr[numReservedRooms] = c;
        numReservedRooms++;
    }

    public int getRoomIndex(int passportID) {
        for(int i = 0; i < customerAr.length; i++){
            if(customerAr[i].getPassportID() == passportID){
                return i;
            }
        }
        return -1;
    }
    public void checkOut(int index){
        Customer p = this.customerAr[index];
        Room r = this.roomAr[index];
        this.numReservedRooms--;
        double totalCost = p.getNumDays() * r.getCostPerDay();
        System.out.println("Room Number: " + r.getRoomID() + "\nGuest Name: " + p.getName() +
                          "\nDays Stayed: " + p.getNumDays() + "\nTotal Cost: " + totalCost);
    }
}