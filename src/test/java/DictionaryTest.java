import org.junit.*;
import Dictionnaire.Dictionary;


import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            listeTraduMulp.add("against");
            dico.addTranslation("contre", "against");
            assertThat(listeTraduMulp, containsInAnyOrder("against"));
        }

    @Test
    public void testMulpTranslation() {
        dico.addTranslation("contre","against");
        dico.addTranslation("contre","versus");
        List<String> listeTest=dico.getTranslation("contre");
        assertThat(listeTest, containsInAnyOrder("against","versus"));
        //assertThat(listeTraduMulp, containsInAnyOrder("against"));

    }


    @Test
    public void testTradInverse(){
        dico.addTranslation("contre", "against");
        dico.addTranslation("contre", "versus");
        dico.addTranslation("against", "contre");
        dico.addTranslation("versus", "contre");
        List<String> laListe = dico.getTranslation("contre");
        assertThat(laListe, containsInAnyOrder("against","versus","contre"));
    }




}
