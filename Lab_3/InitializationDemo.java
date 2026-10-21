public class InitializationDemo {
    static int staticPole;
    int poleInstancji;

    static {
        System.out.println("Blok statyczny");
    }

    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo(int poleInstancji) {
        this.poleInstancji = poleInstancji;
    }
}
