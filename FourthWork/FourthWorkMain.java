import java.util.ArrayList;

/* 7 Вариант
Автоматизация работы факультета. Создать родительский класс "Факультет".
(аудитория, корпус, контактный телефон, фамилия декана) и дочерние классы:
- "Состав факультета" (ФИО, должность)
- "Кафедры" (название, направление подготовки)
- "Преподаватели кафедры" (ФИО преподавателя, кафедра, должность,
стаж работы, читаемые дисциплины).

Реализовать класс для хранения списка факультетов с методом добавления
нового факультета и его кафедр и преподавателей и методом печати списка
факультетов с полной информацией о его составе.
*/
// Dean - родительский класс(факультет)

public class FourthWorkMain {
    public static void main(String[] args) {
        ArrayList<Dean> listOfCompound = new ArrayList<>();
        deanList deanList = new deanList(listOfCompound);

        int Room = 441;
        int corps = 1;
        String Telephone = "84732553123";
        String NameDean = "Ivanov";

        String FIO = "Ivanov Ivan Ivanovich";
        String position = "Decan";


        DeanCompound compound = new DeanCompound(Room, corps, Telephone, NameDean, FIO, position);
        deanList.addCompound(compound);

        int Room_2 = 1337;
        int corps_2 = 2;
        String Telephone_2 = "88005553535";
        String NameDean_2 = "Petrov";

        String NameForCaf = "ABC";
        String NaprPr = "09.03.02";


        caferd cafPrep = new caferd(Room_2, corps_2, Telephone_2, NameDean_2, NameForCaf, NaprPr);
        deanList.addCompound(cafPrep);

        int Room_3 = 111;
        int corps_3 = 3;
        String Telephone_3 = "89111191919";
        String NameDean_3 = "Alexandrov";

        String FioPrep = "Andreevich Andrey Andreev";
        String Cafedr = "Cafedr";
        String positionPrep = "Teacher";
        int Experience = 11;
        String rDis = "Humanism, Math";


        prepodCaf prepCafFull = new prepodCaf(Room_3, corps_3, Telephone_3, NameDean_3, FioPrep, Cafedr, positionPrep, Experience, rDis);
        deanList.addCompound(prepCafFull);

        System.out.println(deanList.showCompound());
    }

}