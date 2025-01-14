import java.util.*;

public class HashSet_000_Introduction{
    public static void main(String args[]){
        
        HashSet <Integer> set = new HashSet<>();
        
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        
        System.out.println("Orginal HashSet : "+set);
        System.out.println("Size of HashSet : "+ set.size());
        
        set.remove(1);
        System.out.println("Upadated HashSet After Removal : "+set);
        
        System.out.println("HashSet Contains 4 : "+set.contains(4));
        System.out.println("HashSet Contains 2 : "+set.contains(2));
        
        set.clear();
        System.out.println("HashSet Empty : "+set.isEmpty());
        
        System.out.println("HashSet : "+set);
        
    }
}