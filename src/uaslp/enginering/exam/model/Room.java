package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String description;
    private RoomStatus Status;

    public Room(int number, String description, RoomStatus roomStatus){
        this.number = number;
        this.description = description;
        this.Status = roomStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomStatus getStatus() {
        return Status;
    }

    public void setStatus(RoomStatus roomStatus) {
        this.Status = roomStatus;
    }
}
