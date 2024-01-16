package homework;

public class UserReporter implements Reportable {
    private final User user;
    // Агрегация
    public UserReporter(User user) {
        this.user = user;
    }
    @Override
    public void report() {
        System.out.println("User Report: " + user.getName());
    }
}