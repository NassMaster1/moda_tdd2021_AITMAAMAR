package Dictionnaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String Name;
    private Map<String, List<String> >translationsMultp;

    public Dictionary( String name) {
        this.Name=name;
        this.translationsMultp=new HashMap<>();
    }

    public String getName() {
        return this.Name;
    }

    public boolean isEmpty(){
        return this.translationsMultp.isEmpty();
    }

    public void  addTranslation(String mot, String traduction)
        {
            if (!translationsMultp.containsKey(mot)) {
            List<String> list= new ArrayList<String>();
            list.add(traduction);
            translationsMultp.put(mot, list);
        }else {
            List<String> listeExist=translationsMultp.get(mot);
            listeExist.add(traduction);
            translationsMultp.put(traduction, listeExist);
        }
        }

        public List<String> getTranslation(String mot){
        return  this.translationsMultp.get(mot);
        }


}
