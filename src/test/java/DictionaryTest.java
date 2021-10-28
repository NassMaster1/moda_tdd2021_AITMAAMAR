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
        dico = new Dictionary();
        assertThat(dico.getName(), equalTo("Example"));
    }


}
