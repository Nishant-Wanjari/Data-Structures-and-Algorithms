import java.util.TreeMap;

public class Tree_Map{
    public static void main(String[] args) {
        TreeMap <String, Integer> tm = new TreeMap<>();

        tm.put("India",150);
        tm.put("China",100);
        tm.put("USA",50);

        System.out.println("Orginal TreeMap (Sorted) :  "+tm);

        System.out.println(tm.get("India"));
        System.out.println(tm.containsKey("USA"));
        System.out.println(tm.containsValue(150));
        System.out.println(tm.remove("China"));

        System.out.println("Updated TreeMap : "+tm);
        System.out.println(tm.size());
        
    }
}