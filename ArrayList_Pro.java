package Practice_25Nov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class ArrayList_Pro {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Orange");
        colors.add("white");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Indigo");
        System.out.println("Given List of Colors is: "+colors);

        //Write a Java program to iterate through all elements in an array list.
        System.out.println("Given List of after Iteration of Colors is: ");
        Iterator <String> it = colors.iterator();
        while(it.hasNext())
        {
        System.out.println(it.next());
        }

    //Write a Java program to insert an element into the array list at the first position.
        colors.add(0,"Black");
        System.out.println(colors);

        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(colors.get(5));

        //Write a Java program to update an array element by the given element.
        System.out.println("New ArrayList is: ");
        Collections.replaceAll(colors,"Black","Green");
        System.out.println(colors);

        //6. Write a Java program to remove the third element from an array list.
        colors.remove(2);
        System.out.println(colors);

        //Write a Java program to search for an element in an array list.
        System.out.println(colors.contains("Yellow"));

        //Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println(colors);

        //Write a Java program to copy one array list into another.
        List <String> copy = new ArrayList<>();
        copy.addAll(0,colors);
        System.out.println(copy);

        //Write a Java program to shuffle elements in an array list.
        System.out.println("Shuffled list is: ");
        Collections.shuffle(colors);
        System.out.println(colors);

        //Write a Java program to reverse elements in an array list.
        System.out.println("Reverse ordered ArrayList is: ");
        Collections.reverse(colors);
        System.out.println(colors);

        //Write a Java program to extract a portion of an array list.
        System.out.println(colors.subList(1,7));

        //Write a Java program to compare two array lists.
        System.out.println(colors.equals(colors.subList(1,7)));

        //Write a Java program that swaps two elements in an array list.
        System.out.println("Elements Before swapping...");
        String swap= colors.get(5) ;
        System.out.println(colors.get(4)+"  "+colors.get(5));
        colors.set(5,colors.get(4));
        colors.set(4,swap);
        System.out.println("Elements After swapping...");
        System.out.println(colors.get(4)+" "+colors.get(5));

        //Write a Java program to clone an array list to another array list.
        System.out.println("clone of an array list is: ");
        ArrayList <String> clone = new ArrayList<>(colors);
        System.out.println(clone);

        //Write a Java program to empty an array list.
//        colors.clear();
        System.out.println(colors);

        //Write a Java program to test whether an array list is empty or not.
        System.out.println(colors.isEmpty());

        //Write a Java program for trimming the capacity of an array list.
        System.out.println("Before trim...");
        colors.trimToSize();
        System.out.println("After Trim...");
        System.out.println(colors.size());

        //Write a Java program to increase an array list size.
        colors.ensureCapacity(20);

        //Write a Java program to replace the second element of an ArrayList with the specified element.
        String wish = "Grey";
        colors.set(1,wish);
        System.out.println(colors);

        //Write a Java program to print all the elements of an ArrayList using the elements' position.
        System.out.println("Elements in List is: ");
        for(int i=0; i< colors.size(); i++)
        {
            System.out.println("Element @ Index "+i+" "+colors.get(i));
        }

        //Write a program to sort an ArrayList of Strings alphabetically.
        System.out.println("Sorted Elements are: ");
        Collections.sort(colors);
        System.out.println(colors);

        //Write a program to find the maximum element from an ArrayList of Integers.
        List <Integer> Nums = new ArrayList();
        Nums.add(34);
        Nums.add(23);
        Nums.add(12);
        Nums.add(15);
        Nums.add(10);
        System.out.println("Maximum Number of List is:");
        Collections.sort(Nums);
        System.out.println(Nums.get(Nums.size() - 1));

        //Write a program to remove all duplicate elements from an ArrayList.
        System.out.println(Nums);

        //Write a program to find the intersection of two ArrayLists.
        List <String> vehicle = new ArrayList<>();
        vehicle.add("Car");
        vehicle.add("Bike");
        vehicle.add("Bicycle");
        vehicle.add("Truck");
        vehicle.add("train");

        List <String> vehicle2 = new ArrayList<>();
        vehicle2.add("Bus");
        vehicle2.add("Train");
        vehicle2.add("Bicycle");
        vehicle2.add("airplane");
        vehicle2.add("train");

        List <String> inter = new ArrayList<>(vehicle);
        System.out.println("Copy for intersection: "+inter);
        inter.retainAll(vehicle2);
        System.out.println(inter);


        //Write a program to find the second-largest element in an ArrayList of Integers.
        System.out.println("Second largest element is: ");
        System.out.println(Nums.get(Nums.size()-2));

        //Write a program to find the frequency of each element in an ArrayList.
        int count=0;
        for(int j=0; j< colors.size(); j++) {
            for (int i = 0; i < colors.size(); i++) {
                if(colors.get(j)==colors.get(i))
                {
                    count++;
                }
            }
            System.out.println(colors.get(j)+" contains "+count+" times");
            count=0;
        }
        //Write a program to find the kth smallest element in an ArrayList.
        int k=2;
        System.out.println(k+"th smallest element is ArrayList is "+ Nums.get(k-1) );

        //Write a program to merge two ArrayLists into a single ArrayList.
        ArrayList <Integer> even = new ArrayList<>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);
        System.out.println(even);

        ArrayList <Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        System.out.println(odd);

        //Write a Java program to join two array lists.
        ArrayList <Integer> join = new ArrayList<>(odd);
        join.addAll(even);
        System.out.println("Joined Arraylist is: ");
        System.out.println(join);


        System.out.println(even.get(0));
        int x=odd.size();
        int y=even.size();

        ArrayList<Integer> merge = new ArrayList<>();
        for(int i=0; i<x; i++)
        {

           merge.add(odd.get(i));
           merge.add(even.get(i));
        }

        System.out.println("Merge ArrayList is:");
        System.out.println(merge);

    }
}
