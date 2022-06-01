import java.util.ArrayList;

public class deanList {
    private ArrayList<Dean> listOfCompound;

    public deanList(ArrayList<Dean> listOfCompound) {
        this.listOfCompound = listOfCompound;
    }

    public void addCompound(Dean Compound) {
        listOfCompound.add(Compound);
    }

    public ArrayList<Dean> showCompound() {
        return listOfCompound;
    }

}