package Practice_25Nov;
import java.util.Collections;
import java.util.HashSet;
public class HashSet_Pro {
    public static void main(String[] args) {
        //HashSet===================================
        //Create a HashSet and add some elements to it. Then, print the elements of the HashSet.
        HashSet <String> fruits =new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Orange");

        // Print the elements of the HashSet
        System.out.println("Elements in the HashSet: " + fruits);

        //Write a program to check if a particular element exists in a HashSet.
        System.out.println(fruits.contains("Orange"));

        //Write a program to check if a HashSet is a subset of another HashSet.
        HashSet <String> stock = new HashSet<>();
        stock.add("Apple");
        stock.add("Banana");
        stock.add("Custerd-Apple");
        stock.add("Oranges");
        System.out.println(fruits.containsAll(stock));

        //Write a program to find the intersection of multiple Sets.
        HashSet <String> interstock = new HashSet<>(fruits);
        interstock.retainAll(stock);
        System.out.println(interstock);

    }

}
