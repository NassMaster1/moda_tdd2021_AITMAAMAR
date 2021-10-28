import org.junit.*;
import Dictionnaire.Dictionary;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class DictionaryTest {
    Dictionary dico;

    @Before
    public void initialize(){
        dico= new Dictionary("Example");
        List<String> autre_mots=new ArrayList();
    }

    public DictionaryTest() {
        // TODO Auto-generated constructor stub
    }

    @Test
    public void testDictionaryName() {
        assertThat(dico.getName(), equalTo("Example"));
    }

    @Test public void DictionaryVide(){
        assertThat(dico.isEmpty(),equalTo(true));
    }


    @Test
    public void testOneTranslation() {
        assertThat(dico.getTranslation("contre"), equalTo("against"));
        assertThat(dico.getTranslation("autre"), equalTo("against"));

    }

}
