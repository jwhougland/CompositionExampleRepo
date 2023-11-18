import java.util.Objects;

/**
 * Defines the characteristics of a Room.
 */
public class Room {

    /**
     * Assists with identifying the purpose of a room
     */
    public enum RoomPurpose {
        OFFICE,
        CONFERENCE_ROOM,
        LOBBY,
        BREAK_ROOM,
        STORAGE,
        OTHER
    }

    /**
     * Name of the room
     */
    private String name;

    /**
     * Square footage of the room
     */
    private float squareFootage;

    /**
     * Capacity of the room (number of people allowed at any given time)
     */
    private int capacity;

    /**
     * Purpose of the room
     */
    private RoomPurpose purpose;

    /**
     * Creates a fully initialized Room instance using the given data.
     *
     * @param name           Name of the room
     * @param squareFootage  Square footage of the room
     * @param capacity       Capacity of the room (number of people allowed at any given time)
     * @param purpose        Purpose of the room
     */
    public Room(String name, float squareFootage, int capacity, RoomPurpose purpose) {

        this.name = name;
        this.squareFootage = squareFootage;
        this.capacity = capacity;
        this.purpose = purpose;
    }

    /**
     * Returns the name of the room.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the room.
     *
     * @param name Name to assign to the room.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the square footage of the room.
     */
    public float getSquareFootage() {
        return squareFootage;
    }

    /**
     * Sets the square footage of the room.
     *
     * @param squareFootage Square footage value to assign to the room.
     */
    public void setSquareFootage(float squareFootage) {
        this.squareFootage = squareFootage;
    }

    /**
     * Gets the number of people allowed in the room at one time.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the number of people allowed in the room at one time.
     *
     * @param capacity Capacity to assign to the room.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the purpose of the room.
     */
    public RoomPurpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the purpose of the room.
     *
     * @param purpose The purpose to assign to the room.
     */
    public void setPurpose(RoomPurpose purpose) {
        this.purpose = purpose;
    }

    /**
     * Creates and returns the description of a room instance.
     */
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", squareFootage=" + squareFootage +
                ", capacity=" + capacity +
                ", purpose=" + purpose +
                '}';
    }

    /**
     * Determines if this room instance is equal to the other room instance.
     *
     * @param o Other room instance.
     *
     * @return True if this room instance and the other room instance are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Float.compare(squareFootage, room.squareFootage) == 0 &&
                capacity == room.capacity &&
                Objects.equals(name, room.name) &&
                purpose == room.purpose;
    }

    /**
     * Computes and returns a hash code for this room instance.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, squareFootage, capacity, purpose);
    }
}
