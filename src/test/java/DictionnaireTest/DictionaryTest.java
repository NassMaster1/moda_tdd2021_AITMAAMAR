package DictionnaireTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dico;


    public DictionaryTest() {
        // TODO Auto-generated constructor stub
    }

    @BeforeClass
    void setUpClass()
    {
        dico = new Dictionary();
    }

    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }


    @AfterClass
    void tearDownClass()
    {
        dico = null;
    }


}
