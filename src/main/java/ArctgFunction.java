import lombok.Getter;

public class ArctgFunction {

    @Getter
    private static final double eps = .0000001;

    public static double calculate(double x) throws Exception {
        if (Math.abs(x) > 1) throw new Exception("Illegal number format exception");

        double sum = 0, prev_sum = 100, xn;


        int i = 1;

        while (Math.abs(sum - prev_sum) > eps) {
            prev_sum = sum;
            xn = Math.pow(-1, i - 1) / (2 * i - 1) * Math.pow(x, 2 * i - 1);
            sum += xn;
            i++;
        }

        return sum;
    }


    public static void main(String[] args) throws Exception {
        double x = 0.3;

        System.out.println(Math.atan(x));
        System.out.println(ArctgFunction.calculate(x));
    }
}
