public class prepodCaf extends Dean {
    private String FioPrep;
    private String Cafedr;
    private String positionPrep;
    private int Experience;
    private String rDis;

    public prepodCaf(int Room, int corps, String Telephone, String NameDean, String FioPrep, String Cafedr, String positionPrep, int Experience, String rDis) {
        super(Room, corps, Telephone, NameDean);
        this.FioPrep = FioPrep;
        this.Cafedr = Cafedr;
        this.positionPrep = positionPrep;
        this.Experience = Experience;
        this.rDis = rDis;
    }

    public String getFioPrep() {
        return FioPrep;
    }
    public void setFioPrep(String FioPrep) {
        this.FioPrep = FioPrep;
    }
    public String getCafedr() {
        return Cafedr;
    }
    public void setCafedr(String Cafedr) {
        this.Cafedr = Cafedr;
    }
    public String getpositionPrep() {
        return positionPrep;
    }
    public void setpositionPrep(String positionPrep) {
        this.positionPrep = positionPrep;
    }
    public int getExperience() {
        return Experience;
    }
    public void setExperience(int Experience) {
        this.Experience = Experience;
    }
    public String getrDis() {
        return rDis;
    }
    public void setrDis(String rDis) {
        this.rDis = rDis;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\n ФИО преподавателя - " + FioPrep +
                "\n Кафедра - " + Cafedr +
                "\n Должность - " + positionPrep +
                "\n Стаж работы - " + Experience +
                "\n Читаемые дисциплины - " + rDis;
    }


}