package Map;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class TREEMAPnull {

    public static void main(String[] args) {

        // --------- 1. Normal TreeMap (natural ordering) ----------
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Apple");
        map.put(null, "Banana");
        map.put(30, null);            // null value ✔️ allowed

       System.out.println(map);

    }
}
