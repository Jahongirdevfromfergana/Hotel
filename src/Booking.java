class Booking {
    private User user;
    private Room room;

    public Booking(User user, Room room) {
        this.user = user;
        this.room = room;
        room.bookRoom();
    }

    public Room getRoom() {
        return room;
    }
    public User getUser() {
        return user;
    }
}
