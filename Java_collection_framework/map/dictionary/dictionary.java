package Java_collection_framework.map.dictionary;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class dictionary {
    private Map<String,String> data =new TreeMap<>();
    
    public String addWord(String word,String meaning){
        return data.put(word,meaning);
    }
    public String removeWord(String word){
        return data.remove(word);
    }
    public String getMeaning(String word){
        String meaning =data.get(word);
        return meaning;
    }
    public void displayAllWords(){
        /* 
         dùng Set vì key của map là duy nhất không trùng nhau
         this.data.keySet() là hàm lấy hết các key của map và trả về một set chứa các key đó
        */ 
        Set<String> listWords= this.data.keySet();
        System.out.println("List of words in the dictionary :"+listWords);
    }
    public int getTotalWords(){
        return this.data.size();
    }
    public void clearDictionary(){
        this.data.clear();
        System.out.println("Dictionary has been cleared.");
    }
}
