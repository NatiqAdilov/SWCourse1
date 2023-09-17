/*
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("True");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
*/


/*
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        int size = hashSet.size();

        System.out.println("Sayi " + size);
    }
}
*/
/*

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        set2.add("Cherry");
        set2.add("Date");
        set2.add("Fig");
        set2.add("Grapes");

        set1.retainAll(set2);

        System.out.println("Eyni olanlar:");
        for (String element : set1) {
            System.out.println(element);
        }
    }
}
*/
/*
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        if (hashSet.isEmpty()) {
            System.out.println("Element tapilmadi ");
        } else {
            System.out.println("Element tapildi ");
        }

        hashSet.add("Apple");

        if (hashSet.isEmpty()) {
            System.out.println("Element tapilmadi");
        } else {
            System.out.println("Element tapildi:"+hashSet);
        }
    }
}
*/

/*

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 8);
        map.put("date", 3);

        String keyToSearch = "banana";

        if (map.containsKey(keyToSearch)) {
            System.out.println("Tapildi: " + keyToSearch);
            int value = map.get(keyToSearch);
            System.out.println("Deyeri: " + value);
        } else {
            System.out.println("Tapilmadi: " + keyToSearch);
        }
    }
}
*/


/*
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 8);
        map.put("date", 3);

        int valueToSearch = 5;

        boolean found = false;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == valueToSearch) {
                found = true;
                System.out.println("Deyeri " + valueToSearch +
                        " olan soz: " + entry.getKey());
                break;
            }
        }

        if (!found) {
            System.out.println("Verilen deyerde soz yoxdur: " + valueToSearch);
        }
    }
}
*/

/*

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 8);
        map.put("date", 3);

        String key = "banana";

        Integer value = map.get(key);

        if (value != null) {
            System.out.println("bu sozun deyeri :  " + key + value);
        } else {
            System.out.println("soz  " + key + "   Hashmapda yoxdur");
        }
    }
}

*/
/*

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 8);
        map.put("date", 3);

        Set<String> keys = map.keySet();

        System.out.println("Bu sozler :  ");

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
*/

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 8);
        map.put("date", 3);

        Collection<Integer> values = map.values();

        System.out.println("True : ");

        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
*/