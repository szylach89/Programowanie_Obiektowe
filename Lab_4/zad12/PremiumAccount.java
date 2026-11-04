package zad12;

public class PremiumAccount extends Account{
    public String nickname;
    private final int premium_id;
    private static int current_premium_ids = 0;

    public PremiumAccount(String name, String nickname) {
        super(name);
        this.nickname = nickname;
        premium_id = ++current_premium_ids;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("+++++++++");
        System.out.println("@" + nickname + ", ID: " + premium_id);
        super.postMessage(message);
        System.out.println("+++++++++");
    }
}
