import java.util.*;

public class Trie_00_Introduction{
    public static void main(String[] args) {
        String words[] = {"the","a", "there","their","any","thee"};
        for (int i = 0; i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }

    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord;
        
        Node(){
            for(int i = 0; i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node(); 
    
    public static void insert(String word){
        Node current = root;
        for (int level = 0; level < word.length(); level++){
            int index = word.charAt(level)-'a';
            if(current.children[index]==null){
                current.children[index] = new Node();
            }
            current = current.children[index];
        }

        current.endOfWord = true;
    }

    public static boolean search(String key){
        Node current = root;
        for (int level = 0; level < key.length(); level++){
            int index = key.charAt(level)-'a';
            if(current.children[index]==null){
                return false;
            }
            current = current.children[index];
        }

        return current.endOfWord == true;
    }

}