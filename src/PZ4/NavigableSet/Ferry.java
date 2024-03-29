package PZ4.NavigableSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ferry {
    public static void main(String[] args) {
        NavigableSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        System.out.println("Java 5");
        SortedSet<Integer> subset = times.headSet(1600);
        System.out.println("Last parom 16:00 - " + subset.last());

        SortedSet<Integer> tailSet = times.tailSet(2000);
        System.out.println("First parom 20:00 - " + tailSet.first());
        System.out.println();

        System.out.println("Java 6");
        System.out.println("Last parom 16:00 - " + times.lower(1600));
        System.out.println("First parom 20:00 - " + times.higher(2000));
    }
}
