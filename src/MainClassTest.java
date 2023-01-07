import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        System.out.println("Lesson 1. Test 1");
        System.out.println(this.getLocalNumber() + "\n");
        Assert.assertEquals("getLocalNumber method doesn't return 14",
                14, this.getLocalNumber());
    }

    @Test
    public void testGetClassNumber()
    {
        System.out.println("Lesson 1. Test 2");
        System.out.println("class_number = " + this.getClassNumber() + "\n");
        Assert.assertTrue("GetClassNumber method returns value less than 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        String sub_class_string = "Hello";
        System.out.println("Lesson 1. Test 3");
        System.out.println("class_string = " + this.getClassString() + "\n");
        Assert.assertTrue("GetClassString method doesn't returns Hello or hello",
                this.getClassString().toUpperCase().contains(sub_class_string.toUpperCase()));
    }

}
