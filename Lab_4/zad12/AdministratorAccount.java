package zad12;

public class AdministratorAccount extends Account{
    public String nickname;

    public AdministratorAccount(String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("###[ ADMIN ]#########");
        System.out.println("@" + nickname);
        super.postMessage(message);
        System.out.println("#####################");
    }

    public void updateAccount(Account acc, String new_name) {
        if (!new_name.isBlank()) {
            acc.name = new_name;
        }
    }
}
