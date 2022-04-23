public class ThirdWork {
    public static void main(String[] args) {
        // использовал Dean, так как название файла не указано
        String NameFaculty = "УИТС";
        int Room = 401;
        int corps = 2;
        String Telephone = "84732553817";
        String NameDean = "Скрыпников";

        Dean output = new Dean(NameFaculty, Room, corps, Telephone, NameDean);
        System.out.println(output);
    }
}