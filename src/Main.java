// Entry point for the Java composition example console app
public class Main {
    public static void main(String[] args) {

        // Create a building instance
        Building officeBuilding = new Building("Office Building 1");

        // Add rooms to the office building (not meant to be all-inclusive of real life, just a few examples)
        officeBuilding.addRoom(
                new Room("Office Mgr office 1", 200f, 7, Room.RoomPurpose.OFFICE));

        officeBuilding.addRoom(
                new Room("Dev Mgr office 1", 200f, 7, Room.RoomPurpose.OFFICE));

        officeBuilding.addRoom(
                new Room("Dev office 1", 110.5f, 3, Room.RoomPurpose.OFFICE));

        officeBuilding.addRoom(
                new Room("Dev office 2", 110.5f, 3, Room.RoomPurpose.OFFICE));

        officeBuilding.addRoom(
                new Room("Sr Dev office 1", 150f, 5, Room.RoomPurpose.OFFICE));

        officeBuilding.addRoom(
                new Room("Break room 1", 500f, 16, Room.RoomPurpose.BREAK_ROOM));

        officeBuilding.addRoom(
                new Room("Main Lobby", 300f, 10, Room.RoomPurpose.LOBBY));

        officeBuilding.addRoom(
                new Room("Storage 1", 200f, 3, Room.RoomPurpose.STORAGE));

        officeBuilding.addRoom(
                new Room("Conference room 1", 300f, 10, Room.RoomPurpose.CONFERENCE_ROOM));

        officeBuilding.addRoom(
                new Room("Conference room 2", 300f, 10, Room.RoomPurpose.CONFERENCE_ROOM));

        officeBuilding.addRoom(
                new Room("Rest room 1", 300f, 6, Room.RoomPurpose.OTHER));

        officeBuilding.addRoom(
                new Room("Rest room 2", 300f, 6, Room.RoomPurpose.OTHER));

        officeBuilding.addRoom(
                new Room("Server room 1", 300f, 6, Room.RoomPurpose.OTHER));

        // Print the name of the building
        System.out.println(officeBuilding.getName());

        // Print the rooms in such a way that they are grouped by categories
        officeBuilding.printRoomsByPurpose();
    }
}