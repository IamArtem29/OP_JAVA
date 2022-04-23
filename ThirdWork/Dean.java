public class Dean {
    // использовал Dean, так как название файла не указано
    private String NameFaculty;
    private int Room;
    private int corps;
    private String Telephone;
    private String NameDean;

    public Dean(String NameFaculty, int Room, int corps, String Telephone, String NameDean) {
        this.NameFaculty = NameFaculty;
        this.Room = Room;
        this.corps = corps;
        this.Telephone = Telephone;
        this.NameDean = NameDean;
    }

    public String getNameFaculty() {
        return NameFaculty;
    }
    public void setNameFaculty(String NameFaculty) {
        this.NameFaculty = NameFaculty;
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
        return "Факультет - " + NameFaculty +
                "\n Аудитория - " + Room +
                "\n Корпус - " + corps +
                "\n Контактный телефон - " + Telephone +
                "\n Фамилия декана - " + NameDean;
    }
}
