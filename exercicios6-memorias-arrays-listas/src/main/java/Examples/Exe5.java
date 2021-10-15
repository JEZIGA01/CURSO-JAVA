package Examples;

import java.util.*;
import java.util.stream.Collectors;

public class Exe5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

            list.add("Jessica");
            list.add("Aquiles");
            list.add("Github");

            list.add(1, "Fernanda");
        list.add(3, "Para remover");
        list.add(4, "Pa remover");

            System.out.println(list.size());
            //list.remove(3);


            for (String x : list){
                System.out.println(x);
            }
        System.out.println("---------------------------");
        list.removeIf(x -> x.charAt(0) == 'P');

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("index "+ list.indexOf("Github"));

        System.out.println("--------------------");
        List<String> result = list.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("----------------");
        String name =list.stream().filter(x->x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(name);
    }
}
