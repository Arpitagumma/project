

import java.util.Scanner;

    public class HotelManagementSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Hotel hotel = new Hotel();

            // Sample rooms to initialize
            hotel.addRoom(new Room(101, "Single"));
            hotel.addRoom(new Room(102, "Double"));
            hotel.addRoom(new Room(103, "Suite"));

            // Menu for the user
            while (true) {
                System.out.println("Hotel Management System");
                System.out.println("1. Display All Rooms");
                System.out.println("2. Book a Room");
                System.out.println("3. Cancel a Booking");
                System.out.println("4. Search Room by Type");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (choice == 1) {
                    // Display All Rooms
                    hotel.displayAllRooms();
                } else if (choice == 2) {
                    // Book a Room
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);
                } else if (choice == 3) {
                    // Cancel a Booking
                    System.out.print("Enter room number to cancel booking: ");
                    int roomNumber = scanner.nextInt();
                    hotel.cancelBooking(roomNumber);
                } else if (choice == 4) {
                    // Search Room by Type
                    System.out.print("Enter room type to search (Single/Double/Suite): ");
                    String roomType = scanner.nextLine();
                    hotel.searchRoomByType(roomType);
                } else if (choice == 5) {
                    // Exit
                    System.out.println("Exiting system. Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            }
            scanner.close();
        }
    }


