public class User {

    public String login;
    public String password;
    // zmienna age powinna być polem obiektu, nie statyczna
    public int age;

    public User(
            String login,
            String password,
            int age
    ) {
        this.login = login;
        this.password = password;
        // zmiana z User.age na this.age
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // metoda statyczna, nie powinna być statyczna, odwołuje się do pól instanji, usunięcie static
    public void showUser() {
        // nie odwołano się do zmiennych obiektu, zmiana na this.*

        System.out.println(
                "Login: " + this.login
                        + ", hasło: " + this.password
                        + ", wiek: " + age
        );
    }
}