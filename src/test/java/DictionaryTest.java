import org.junit.*;
import Dictionnaire.Dictionary;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;


public class DictionaryTest {
    Dictionary dico;
    List<String> listeTraduMulp;

    @Before
    public void initialize(){
        dico= new Dictionary("Example");
        listeTraduMulp=new ArrayList<>();
    }

    @After
    public void clean(){
        dico=null;
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
        assertThat(dico.getMultipleTranslations("contre"), equalTo("against"));
        assertThat(dico.getMultipleTranslations("autre"), equalTo("against"));

    }

    @Test
    public void testMulpTranslation() {
        listeTraduMulp.add("against");
        listeTraduMulp.add("versus");
        assertThat(listeTraduMulp, containsInAnyOrder("against","versus"));

    }

}
