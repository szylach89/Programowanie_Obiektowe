package zad12;

public class StandardAccount extends Account{
    public String nickname;

    public StandardAccount(String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("@" + nickname);
        super.postMessage(message);
    }
}
