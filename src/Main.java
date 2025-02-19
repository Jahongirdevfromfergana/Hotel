import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelManagement hotel = new HotelManagement();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    hotel.register(name, username, Boolean.parseBoolean(password));
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    if (hotel.login(username, password)) {
                        System.out.println("Login successful!");
                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\n1. View Rooms\n2. Book Room\n3. Cancel Booking\n4. Logout");
                            int userChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (userChoice) {
                                case 1:
                                    hotel.showRooms();
                                    break;
                                case 2:
                                    System.out.print("Enter room ID to book: ");
                                    int roomId = scanner.nextInt();
                                    scanner.nextLine();
                                    hotel.bookRoom(roomId);
                                    break;
                                case 3:
                                    System.out.print("Enter room ID to cancel booking: ");
                                    roomId = scanner.nextInt();
                                    scanner.nextLine();
                                    hotel.cancelBooking(roomId);
                                    break;
                                case 4:
                                    loggedIn = false;
                                    System.out.println("Logged out successfully!");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid username or password!");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting system!");
                    break;
            }
        }
    }
}
