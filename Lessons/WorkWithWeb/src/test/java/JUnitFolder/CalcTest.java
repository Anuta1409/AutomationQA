package JUnitFolder;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;

@Category(AcceptanceTest.class)
public class CalcTest {
    @Test
    public void testMult() throws Exception {
        Calc calc = new Calc();
        Assert.assertEquals(25, calc.mult(5, 5));
//        Assert.assertTrue(22==calc.mult(5,5));

    }

    @Test
    public void testAssertArrayEquals() throws Exception{
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        Assert.assertArrayEquals("Array equals???", expected, actual);
    }

    @Test
    public void testAssertThat(){
         int x = 3;
         Assert.assertThat(x, is(not(3)));
    }

//    @Test(expected = DivByZeroExeption.class)
//    public void testDiv(){
//        Calc calc = new Calc();
//        Assert.assertEquals("Incorrect div", 6, calc.div(36,0));
//    }

    @Test(expected = DivByZeroException.class)
    public void testDiv()
    {
        Calc calc = new Calc();
        Assert.assertEquals("Incorrect division", 6, calc.div(36, 0));
    }
}