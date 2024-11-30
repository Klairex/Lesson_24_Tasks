import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("MDL", "Leu moldovenesc");
            linkedHashMap.put("EUR", "Euro");
            linkedHashMap.put("USD", "Dolar american");

            LinkedHashSet<String> valuesSet = new LinkedHashSet<>();
            LinkedList<String> keysList = new LinkedList<>();

            for (String key : linkedHashMap.keySet()) {
                keysList.add(key);
                valuesSet.add(linkedHashMap.get(key));
            }

            System.out.println("LinkedHashMap: " + linkedHashMap);
            System.out.println("LinkedHashSet (Values): " + valuesSet);
            System.out.println("LinkedList (Keys): " + keysList);
        }
    }

