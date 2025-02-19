class Room {
    private int id;
    private String type;
    private double price;
    private boolean isBooked;

    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isBooked = false;

    }
    public int getId() {
        return id;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public void bookRoom() {
        this.isBooked = true;
    }
    public void cancelBooking() {
        this.isBooked = false;
    }

    public void showRoomInfo() {
        System.out.println("Room ID: " + id + " | Type: " + type + " | Price: " + price + " | Status: " + (isBooked ? "Booked" : "Available"));
    }
}
