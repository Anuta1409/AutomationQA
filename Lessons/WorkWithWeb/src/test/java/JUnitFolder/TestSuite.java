package JUnitFolder;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Anna on 13.03.2016.
 */
@RunWith(Suite.class)
@Categories.ExcludeCategory(ExcludeTest.class)
@Suite.SuiteClasses({CalcTest.class,Test_a.class})

public class TestSuite {

}
