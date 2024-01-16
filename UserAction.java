package homework;

public class UserAction implements Actionable {
    private final User user;
    // Композиция
    public UserAction(String userName) {
        this.user = new User(userName);
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}