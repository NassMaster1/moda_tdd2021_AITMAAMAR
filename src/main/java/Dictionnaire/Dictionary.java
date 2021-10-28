package Dictionnaire;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String Name;
    private Map<String, String> translations;
    private Map<String, List<String> >translationsMultp;

    public Dictionary( String name) {
        this.Name=name;
        this.translations=new HashMap<>();
        this.translationsMultp=new HashMap<>();
    }

    public String getName() {
        return this.Name;
    }

    public boolean isEmpty(){
        return this.translations.isEmpty();
    }

    public void  addTranslation(String mot, List<String> traduction)
        {
            this.translationsMultp.put(mot,traduction);
        }

        public String getTranslation(String mot)
        {
         return  "against";
        }

        public Map getMultipleTranslations(String mot){
        return  this.translationsMultp;
        }


}
