import java.util.ArrayList;
import java.util.List;

/**
 * Defines the characteristics of a building
 */
public class Building {

    /**
     * Name of the building
     */
    String name;

    /**
     * Rooms in the building (composition relationship)
     */
    private List<Room> rooms = new ArrayList<>();

    /**
     * Creates a new building instance.
     *
     * @param name Name of the building
     */
    public Building(String name) {

        this.name = name;
    }

    /**
     * Gets the name of the building.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the building.
     *
     * @param name The name to assign to the building.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds the given room to the collection of rooms.
     *
     * @param room Room to add to the building.
     */
    public void addRoom(Room room) {

        // Null check the input room
        if (room == null) {
            throw new IllegalArgumentException("Cannot add a null room instance to a building");
        }

        // Add the room to the collection
        rooms.add(room);
    }

    /**
     * Prints the rooms that are grouped by a purpose.
     */
    public void printRoomsByPurpose() {

        // Iterate through the room purpose enum values
        for (Room.RoomPurpose purpose : Room.RoomPurpose.values()) {

            // Query for rooms that match the current purpose
            List<Room> matchingRooms = rooms
                    .stream()
                    .filter(r -> r.getPurpose().equals(purpose))
                    .toList();

            // If we do not have any rooms matching the current purpose skip to the next purpose
            if (matchingRooms.isEmpty()) {
                continue;
            }

            // Since we are here we have at least one room matching the current purpose, so
            // let's create a high-level print statement for rooms with the current purpose.
            System.out.print("Room(s) assigned the purpose of " + purpose.getReadableString());

            // Print the description for the matching rooms
            matchingRooms.forEach(mr -> System.out.println("    " + mr.toString()));
        }
    }
}
