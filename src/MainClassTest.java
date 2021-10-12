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

    @Test

    public void testGetClassString() {
        String myString = this.getClassString();
        String myHello = "Hello";
        String my_hello = "hello";

        if(myString.contains(my_hello)) {
            System.out.println("The string contains hello");
        } else  if(myString.contains(myHello)) {
            System.out.println("The string contains Hello");
        } else {
            Assert.fail("The string does not contain hello or Hello");
        }

    }

}
