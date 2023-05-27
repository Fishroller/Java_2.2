public class BmiService {
    public int calculate(double height1, double weight1) {
        double double_index;
        double_index = weight1 / height1 / height1;
        int index = (int) double_index;
        return index;
    }
}
