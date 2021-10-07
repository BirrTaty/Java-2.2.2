public class BmiService {
    public double calculate (int weight, double height){
        double Bmi = weight / (height * height);
        return Bmi;
    }
}
