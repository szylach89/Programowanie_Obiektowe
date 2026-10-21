public class Zad7i8 {
    static void main() {
        System.out.println(StaticCalculator.add(4.5, 6.5));
        System.out.println(StaticCalculator.add(4, 6));
        System.out.println(StaticCalculator.add(4, 6, 10));
        System.out.println(StaticCalculator.subtract(4, 3.5));
        System.out.println(StaticCalculator.multiply(4, 6));

        System.out.println(StaticCalculator.getNumberOfOperations());
    }
}
