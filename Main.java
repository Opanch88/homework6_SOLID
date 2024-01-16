package homework;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Sam");

        // Сохранение пользователя
        Actionable saveUser1 = new UserAction("Bob");
        saveUser1.save();

        // Отчет о пользователе
        Reportable reporter1 = new UserReporter(user1);
        reporter1.report();

        // Сохранение пользователя
        UserAction saveUser2 = new UserAction("Sam");
        saveUser2.save();

        // Отчет о пользователе
        UserReporter reporter2 = new UserReporter(user2);
        reporter2.report();
    }
}