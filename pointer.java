import java.util.HashMap;

class main {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;
        System.out.println(map1);
        System.out.println(map2);
    }
}
