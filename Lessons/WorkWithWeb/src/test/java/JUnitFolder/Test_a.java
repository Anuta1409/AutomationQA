package JUnitFolder;

import org.junit.*;
import org.junit.experimental.categories.Category;

@Category(ExcludeTest.class)
public class Test_a {

        @BeforeClass
        public static void setUpClass() throws Exception {
            System.out.println("Before Class");
            Assert.assertTrue(true);
        }

        @AfterClass
        public static void tearDownClass() throws Exception {
            System.out.println("After Class");
            Assert.assertTrue(true);
        }

        @Before
        public void setUp() throws Exception {
            System.out.println("Before method");
            Assert.assertTrue(true);
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("After method");
            Assert.assertTrue(true);
        }


        @Test
        public void testTestA() throws Exception {
            System.out.println("TestA");
            Assert.assertTrue(true);

        }
        //@Ignore("Not Ready to Run")
        @Test//(timeout = 1000)
        public void testTestB() throws Exception {
            System.out.println("TestB");
            //Thread.sleep(2000);
            Assert.assertTrue(true);

        }

        @Test
        public void testTestC() throws Exception {
            System.out.println("TestC");
            Assert.assertTrue(true);
        }
}
