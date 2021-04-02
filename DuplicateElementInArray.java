package Java_Programming_Interview_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        String lang[]={"Java","Python","Ruby","Java","Perl"};
        //by using for loop
        for (int i=0;i< lang.length;i++){
            for (int j=i+1;j< lang.length;j++){
                if (lang[i].equals(lang[j])){
                    System.out.println("Duplicate element is:"+lang[i]);
                }
            }
        }
        //by using Hash Set:stores unique values
        Set<String> hs=new HashSet<String>();
        for (String lan:lang){
            if (hs.add(lan)==false){
                System.out.println("Duplicate element is:"+lan);
            }
        }
        //by suing HashMap
        Map<String,Integer> hm=new HashMap<String, Integer>();
        for (String lan:lang){
            Integer count=hm.get(lan);
            if (count==null){
                hm.put(lan,1);
            }else
            {
                hm.put(lan,++count);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet=hm.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet){
            if (entry.getValue()>1){
                System.out.println("Duplicate element is:"+entry.getKey());
            }
        }
    }
}
