public class Dean {
    private int Room;
    private int corps;
    private String Telephone;
    private String NameDean;

    public Dean(int Room, int corps, String Telephone, String NameDean) {
        this.Room = Room;
        this.corps = corps;
        this.Telephone = Telephone;
        this.NameDean = NameDean;
    }


    public int getRoom() {
        return Room;
    }
    public void setRoom(int Room) {
        this.Room = Room;
    }
    public int getCorps() {
        return corps;
    }
    public void setCorps(int corps) {
        this.corps = corps;
    }
    public String getTelephone() {
        return Telephone;
    }
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }
    public String getNameDean() {
        return NameDean;
    }
    public void setNameDean(String NameDean) {
        this.NameDean = NameDean;
    }

    public String toString() {
        return "Аудитория - " + Room +
                "\n Корпус - " + corps +
                "\n Контактный телефон - " + Telephone +
                "\n Фамилия декана - " + NameDean;
    }
}
