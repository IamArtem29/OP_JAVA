public class caferd extends Dean {
    private String NameForCaf;
    private String NaprPr;

    public caferd(int Room, int corps, String Telephone, String NameDean, String NameForCaf, String NaprPr) {
        super(Room, corps, Telephone, NameDean);
        this.NameForCaf = NameForCaf;
        this.NaprPr = NaprPr;
    }

    public String getNameForCaf() {
        return NameForCaf;
    }
    public String getNaprPr() {
        return NaprPr;
    }
    public void setNameForCaf(String NameForCaf) {
        this.NameForCaf = NameForCaf;
    }
    public void setNaprPr(String NaprPr) {
        this.NaprPr = NaprPr;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\n Название - " + NameForCaf +
                "\n Направление подготовки - " + NaprPr;
    }

}