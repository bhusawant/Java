import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();  
        v.add("Animesh");
        v.add("Anurag");
        v.add("Om");
        v.add("Parth");
        v.add("Harsh");
        v.add("Pranav");
        v.add("Sairaj");
        v.add("Deep");
        v.add("Aaditya");
        v.add("Soumil");
        v.add("Akshay");
        v.add("Shaggy");
        v.add("Medhaj");
        v.add("Soham");
        v.add("Bhuvan");
        v.add("Shreyash");
        // v.clear();
        System.out.println(v.isEmpty());
        System.out.println("The size of vector: "+v.size());
        System.out.println("List = "+v);
        v.remove("Soham");
        v.addElement("Shaunak");
        v.insertElementAt("Ajay", 5);
        System.out.println("List = "+v);
        System.out.println(v.firstElement());
        System.out.println(v.indexOf("Deep"));
        System.out.println(v.contains("Bhuvan"));
 
    }
}

