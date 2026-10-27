public class User {

    // zmiana hasła, loginu i wieku na private
    private String login;
    private String password;
    // zmienna age powinna być polem obiektu, nie statyczna
    private int age;

    // Hasło z powodu nie powinno mieć zwykłego gettera(hasło to wartość poufna, nie powinna mieć możliwości po prostu jej odczytania)

    public User(
            String login,
            String password,
            int age
    ) {
        this.login = login;
        this.password = password;
        // zmiana z User.age na this.age
        this.age = age > 0 ? age : 1;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void increaseAge() {
        age++;
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