import java.util.*;

public class LinkedHashSet_000{
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkSet = new LinkedHashSet<>();

        linkSet.add(1);
        linkSet.add(2);
        linkSet.add(3);
        linkSet.add(2);
        linkSet.add(1);

        System.out.println("Linked HashSet Ordered : "+linkSet);
    }
}