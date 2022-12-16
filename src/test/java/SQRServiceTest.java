import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void test(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
