package application;
 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // extremamente rapido mas n mantem a ordem
       set.add("TV");
       set.add("Notebook");
       set.add("Celular");
     //true
       System.out.println(set.contains("TV"));

       set.removeIf(x -> x.charAt(0) =='N');
 
       set.forEach(System.out::println);
       System.out.println();
       
       // ordem alfabetica
       Set<String> sett = new TreeSet<>(); 
      sett.add("TV");
      sett.add("Notebook");
      sett.add("Celular");
      //false
      System.out.println(sett.contains("t"));
      

      sett.remove("TV");
      sett.forEach(System.out::println);
      System.out.println();
      
      // mantem a ordem dos elementos inseridos
      Set<String> settt = new LinkedHashSet<>(); 
     settt.add("TV");
     settt.add("Notebook");
     settt.add("Celular");
     settt.remove("Notebook");
     
     settt.removeIf(x -> x.charAt(0) =='C');
     System.out.println(settt.contains("TV"));
     settt.forEach(System.out::println);
    }
}
