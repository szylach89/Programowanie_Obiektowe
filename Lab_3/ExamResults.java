import java.util.Arrays;

public class ExamResults {
    private int[] points;

    public ExamResults(int[] points) {
        this.points = points;
    }

    public int[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }
}

