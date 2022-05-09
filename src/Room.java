public class Room {

    private int roomID;
    private int numOfBeds;
    private double costPerDay;

    public Room(int roomID, int numOfBeds, double costPerDay){
        this.roomID = roomID;
        this.numOfBeds = numOfBeds;
        this.costPerDay = costPerDay;
    }

    public void setRoomID(int newRoomID){
        this.roomID = newRoomID;
    }

    public void setNumOfBeds(int newNumOfBeds){
        this.numOfBeds = newNumOfBeds;
    }

    public void setCostPerDay(double newCostPerDay){
        this.costPerDay = newCostPerDay;
    }

    public int getRoomID(){
        return this.roomID;
    }

    public int getNumOfBeds(){
        return this.numOfBeds;
    }

    public double getCostPerDay(){
        return this.costPerDay;
    }

    @Override
    public String toString(){
        String roomInfo = "Room ID: " + this.roomID +
                "\nNumber of beds: " + this.numOfBeds +
                "\nCost per day: " + this.costPerDay;
        return roomInfo;
    }
}
