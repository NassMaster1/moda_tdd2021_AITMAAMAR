import org.junit.*;
import Dictionnaire.Dictionary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dico;

    public DictionaryTest() {
        // TODO Auto-generated constructor stub
    }

    @Test
    public void testDictionaryName() {
        dico = new Dictionary("Example");
        assertThat(dico.getName(), equalTo("Example"));
    }

    @Test public void DictionaryVide(){
        dico = new Dictionary("Example");
        assertThat(dico.isEmpty(),equalTo(true));
    }

}
