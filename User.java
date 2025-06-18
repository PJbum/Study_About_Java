public class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println("User " + username + " is logged in");
    }

    @Override
    public String toString() {
        return "Username: " + username;
    }

    public static class Admin extends User {
        public Admin(String username) {
            super(username);
        }

        @Override
        public void login() {
            System.out.println("Admin " + username + " logged in with full access");
        }
    }

    public static final class Guest extends User {
        public Guest(String username) {
            super(username);
        }

        @Override
        public void login() {
            System.out.println("Guest " + username + " logged in with limited access");
        }
    }

    public static class UserTest {
        public static void main(String[] args) {
            User admin = new Admin("Park");
            User guest = new Guest("Kim");
            User[] users = {admin, guest};

            for (User user : users) {
                System.out.println(user.toString());
                user.login();

                if (user instanceof Admin) {
                    System.out.println("user is Admin");
                } else if (user instanceof Guest) {
                    System.out.println("user is Guest");
                }
            }
        }
    }
}
