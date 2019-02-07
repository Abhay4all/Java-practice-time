package interface_onward.composition;

public class house {
    private String rooms;
    private String kitchen;
    private String balcony;
    private String floor;

    public house(String rooms, String kitchen, String balcony, String floor) {
        this.rooms = rooms;
        this.kitchen = kitchen;
        this.balcony = balcony;
        this.floor = floor;
    }

    public String getRooms() {
        return rooms;
    }

    public String getKitchen() {
        return kitchen;
    }

    public String getBalcony() {
        return balcony;
    }

    public String getFloor() {
        return floor;
    }
}
