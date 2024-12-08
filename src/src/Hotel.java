
    // Hotel class to manage the rooms
import java.util.ArrayList;

    public class Hotel {
        // List to store rooms
        ArrayList<Room> rooms = new ArrayList<>();

        // Method to add a room
        public void addRoom(Room room) {
            rooms.add(room);
            System.out.println("Room added: " + room.roomNumber);
        }

        // Method to book a room
        public void bookRoom(int roomNumber) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber) {
                    if (!room.isBooked) {
                        room.isBooked = true;
                        System.out.println("Room booked successfully: " + room.roomNumber);
                    } else {
                        System.out.println("Room is already booked!");
                    }
                    return;
                }
            }
            System.out.println("Room not found!");
        }

        // Method to display all rooms
        public void displayAllRooms() {
            if (rooms.isEmpty()) {
                System.out.println("No rooms available in the hotel.");
            } else {
                for (Room room : rooms) {
                    room.displayRoomDetails();
                }
            }
        }

        // Method to search for a room by type
        public void searchRoomByType(String roomType) {
            boolean found = false;
            for (Room room : rooms) {
                if (room.roomType.equalsIgnoreCase(roomType) && !room.isBooked) {
                    room.displayRoomDetails();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No available rooms found of type: " + roomType);
            }
        }

        // Method to cancel a room booking
        public void cancelBooking(int roomNumber) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber) {
                    if (room.isBooked) {
                        room.isBooked = false;
                        System.out.println("Booking cancelled for room: " + room.roomNumber);
                    } else {
                        System.out.println("Room is not booked!");
                    }
                    return;
                }
            }
            System.out.println("Room not found!");
        }
    }

