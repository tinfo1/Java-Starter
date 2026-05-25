package Java_collection_framework.map.dictionary;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        dictionary myDictionary = new dictionary();
        Scanner sc = new Scanner(System.in);
        String choose = "";
        do {
            System.out.println("-----------------------");
            System.out.println("MENU");
            System.out.println("1. Add a word\n" +
                               "2. Remove a word\n"+
                               "3. Get meaning of a word\n"+
                               "4. Display all words\n"+
                               "5. Get total number of words\n"+
                               "6. Clear the dictionary\n"+
                               "0. Exit\n"+
                               "-----------------------"
            );
            System.out.println("Please choose an option :");
            choose =sc.nextLine();
            System.out.println("your choose : "+choose);
            if (choose.equals("1")) {
                System.out.println("Enter the word to add :");
                String word= sc.nextLine();
                System.out.println("Enter the meaning of the word :");
                String meaning =sc.nextLine();
                myDictionary.addWord(word, meaning); 
            }else if (choose.equals("2")){
                System.out.println("Enter the word to remove :");
                String word = sc.nextLine();
                myDictionary.removeWord(word);
            }else if(choose.equals("3")){
                System.out.println("Enter the word to get meaning :");
                String word =sc.nextLine();
                if (word.isEmpty()|| myDictionary.getMeaning(word)==null) {
                    System.out.println("Word not found in the dictionary");
                }
                System.out.println("Meaning of the word "+ word+" is : "+myDictionary.getMeaning(word));
            }else if(choose.equals("4")){
                myDictionary.displayAllWords();
            }else if(choose.equals("5")){
                System.out.println("Total number of words in the dictionary is : "+ myDictionary.getTotalWords());
            }else if (choose.equals("6")) {
                myDictionary.clearDictionary();
            }

        } while (!choose.equals("0"));
        sc.close();
    }
}
