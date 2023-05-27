public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        int body_mass_index = service.calculate(height, weight);
        System.out.println(body_mass_index);
    }
}