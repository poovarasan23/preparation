import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Scratch {
    public static void main(String[] args) {
        int in[] = {2, 3, 1, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : in) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        map.entrySet().stream().sorted((a, b) -> a.getValue() == b.getValue() ?
                        b.getKey().compareTo(a.getKey()) : a.getValue().compareTo(b.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
        map.forEach((a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        });
    }
}