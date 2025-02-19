import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private List<Room> bookedRooms = new ArrayList<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    public void bookRoom(Room room) {
        if (!room.isBooked()) {
            bookedRooms.add(room);
            room.setBooked(true);
            System.out.println("Room " + room.getRoomNumber() + " booked successfully!");
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is already booked!");
        }
    }

    public void showBookedRooms() {
        if (bookedRooms.isEmpty()) {
            System.out.println("You have no booked rooms.");
        } else {
            System.out.println("Your booked rooms:");
            for (Room room : bookedRooms) {
                System.out.println("- Room " + room.getRoomNumber());
            }
        }
    }
}