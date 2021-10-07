public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate(54, 1.70);
        System.out.println(Bmi);
    }
}
