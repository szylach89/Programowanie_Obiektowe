public class Zad4 {
    static void main() {
        int[] points = {5, 2, 4};
        ExamResults exRes = new ExamResults(points);

        exRes.getPoints()[1] = 7;

        System.out.println(exRes.getPoints()[1]);
    }
}
