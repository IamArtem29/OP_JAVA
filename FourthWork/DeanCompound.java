public class DeanCompound extends Dean {
    private String FIO;
    private String position;

    public DeanCompound(int Room, int corps, String Telephone, String NameDean, String FIO, String position) {
        super(Room, corps, Telephone, NameDean);
        this.FIO = FIO;
        this.position = position;
    }

    public String getFIO() {
        return FIO;
    }
    public String getPosition() {
        return position;
    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\n ФИО Сотрудника - " + FIO +
                "\n Должность - " + position;
    }

}