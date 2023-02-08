package Hashing;

import java.util.*;

public class itinerary {
    public static String starting(HashMap<String, String> tic) {
        HashMap<String, String> rev = new HashMap<>();

        for (String key : tic.keySet()) {
            rev.put(tic.get(key), key);
        }

        for (String key : tic.keySet()) {
            if (!rev.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tic = new HashMap<>();
        tic.put("Chennai", "Bengaluru");
        tic.put("Mumbai", "Delhi");
        tic.put("Goa", "Chennai");
        tic.put("Delhi", "Goa");

        String start = starting(tic);
        System.out.print(start);

        for (String key : tic.keySet()) {
            System.out.print("--> " + tic.get(start));
            start = tic.get(start);
        }
    }
}
