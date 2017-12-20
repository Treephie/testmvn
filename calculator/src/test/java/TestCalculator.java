import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator cal = new Calculator();

    @Test(invocationCount = 5)
    public void tt_add() {
        System.out.println("test_add ..");
        Assert.assertEquals(cal.add(3, 5), 8);
    }

    @Test(dataProvider = "sub_data")
    public void tt_sub(int a, int b, int expected) {
        System.out.println("test_sub ..");
        Assert.assertEquals(cal.sub(a, b), expected);
    }

    @DataProvider(name = "sub_data")
    public Object[][] provideData() {
        return new Object[][] {{5, 0, 5}, {0, 3, -3}, {-2, -4, 2}};
    }

}
