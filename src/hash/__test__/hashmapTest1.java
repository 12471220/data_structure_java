package hash.__test__;

import hash.HashMap1;
import hash.Map;

public class hashmapTest1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap1<>();
        map.put("str1","hello World");
        map.put("str1","fuck you");
        map.put("str2","114514");
        map.put("str3","1919810");
        map.put("str4","想啊，很想啊");
        map.put("str5","你是一个一个");
        map.put("str6","漂亮得很那！");
        map.put("str7","鸡你太美！");
        map.put("str8","baby！");
        map.put("str9","超过了会怎么说");

        System.out.println("str1:"+map.get("str1"));
        System.out.println("str2:"+map.get("str2"));
        System.out.println("str3:"+map.get("str3"));
        System.out.println("str4:"+map.get("str4"));
        System.out.println("str5:"+map.get("str5"));
        System.out.println("str6:"+map.get("str6"));
        System.out.println("str7:"+map.get("str7"));
        System.out.println("str8:"+map.get("str8"));
        System.out.println("str9:"+map.get("str9"));
    }
}
