public class lesson_1_4 {
    public static void main(String[] args) {
        String password = "password";
        String login = "login";

        if ((password.equals(args[1]) && login.equals(args[0])) || ((password.equals(args[0]) && login.equals(args[1])))) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещён");
        }
    }
}