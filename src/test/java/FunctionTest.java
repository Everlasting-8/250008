import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionTest {

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 0.12, 0.23, 0.34, 0.45, 0.56, 0.67, 0.78, 0.89, 1})
    public void testPositive(double x) throws Exception {
        Assertions.assertEquals(ArctgFunction.calculate(x), Math.atan(x), ArctgFunction.getEps());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.01, -0.12, -0.23, -0.34, -0.45, -0.56, -0.67, -0.78, -0.89, -1})
    public void testNegative(double x) throws Exception {
        Assertions.assertEquals(ArctgFunction.calculate(x), Math.atan(x), ArctgFunction.getEps());
    }
}
