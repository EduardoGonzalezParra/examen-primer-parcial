package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private String Name;
    private ArrayList <Room> rooms;
    private int pools;
    private int gyms;

    public Hotel(String name) {
        setName(name);
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getPools() {
        return pools;
    }

    public void setPools(int pools) {
        this.pools = pools;
    }

    public int getGyms() {
        return gyms;
    }

    public void setGyms(int gyms) {
        this.gyms = gyms;
    }
}
