public class Room {
    // Class for Room

        // Properties of a Room
        int roomNumber;
        String roomType;
        boolean isBooked;

        // Constructor to initialize Room
        public Room(int roomNumber, String roomType) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.isBooked = false;
        }

        // Method to display room details
        public void displayRoomDetails() {
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Room Type: " + roomType);
            System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
            System.out.println("------------------------");
        }
    }

