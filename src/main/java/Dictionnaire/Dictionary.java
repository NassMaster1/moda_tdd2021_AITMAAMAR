package Dictionnaire;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private String Name;
    private Map<String, String> translations;

    public Dictionary( String name) {
        this.Name=name;
        this.translations=new HashMap<>();
    }

    public String getName() {
        return this.Name;
    }

    public boolean isEmpty(){

        return this.translations.isEmpty();
    }

    public void  addTranslation(String s1,String s2)
        {

        }

        public String getTranslation(String s)
        {
         return  "against";
        }

}
