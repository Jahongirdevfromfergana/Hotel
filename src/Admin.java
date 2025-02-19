import java.util.List;

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addRoom(List<Room> rooms, int roomNumber) {
        rooms.add(new Room(roomNumber));
        System.out.println("Room " + roomNumber + " added successfully!");
    }
}