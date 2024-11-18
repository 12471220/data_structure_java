package hash.__test__;

import hash.HashMap2;

public class hashMapTest2 {
    public static void main(String[] args) {
        HashMap2<String, String> hm2 = new HashMap2<>();

        hm2.put("1", "鸡你太美");
        hm2.put("2", "baby");
        hm2.put("3", "jntm");
        hm2.put("4", "呗呗");
        hm2.put("5", "114514");
        hm2.put("6", "1919810");
        hm2.put("7", "aaaaaa");


//        System.out.println(hm2.get("1"));
//        System.out.println(hm2.get("2"));
//        System.out.println(hm2.get("3"));
//        System.out.println(hm2.get("4"));
//        System.out.println(hm2.get("5"));
//        System.out.println(hm2.get("6"));
//        System.out.println(hm2.get("7"));
        hm2.outputChain();
    }

}
