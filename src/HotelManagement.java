import java.util.ArrayList;
import java.util.List;

class HotelManagement {
    private List<User> users = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public void register(String username, String password, boolean isAdmin) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists!");
                return;
            }
        }
        if (isAdmin) {
            users.add(new Admin(username, password));
        } else {
            users.add(new Customer(username, password));
        }
        System.out.println("Registration successful!");
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println("Login successful!");
                return user.isAdmin();
            }
        }
        System.out.println("Invalid username or password!");
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void showRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
        } else {
            for (Room room : rooms) {
                System.out.println("Room " + room.getRoomNumber() + (room.isBooked() ? " (Booked)" : " (Available)"));
            }
        }
    }
}
