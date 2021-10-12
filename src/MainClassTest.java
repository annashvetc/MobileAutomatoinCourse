import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void testGetLocalNumber() {

        int expected = 14;
        int actual = this.getLocalNumber();

        Assert.assertEquals("The actual number is not 14", expected, actual);

    }

    @Test

    public void testGetClassNumber() {

        int a = this.getClass_number();

        Assert.assertTrue("It's false, a is less or equal 45", a > 45);
    }


}
