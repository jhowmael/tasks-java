


/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */

package com.example;
import java.util.ArrayList;
import java.util.HashSet;

public class Task3 {

    public static int countDisctinctList(ArrayList<String> arrayString) {
        HashSet<String> uniqueItems = new HashSet(arrayString);

        return uniqueItems.size();
    }

    public static void main(String[] args) {
        ArrayList<String> arrayString = new ArrayList();
        arrayString.add("1");
        arrayString.add("1");
        arrayString.add("2");
        arrayString.add("2");
        arrayString.add("3");
        arrayString.add("4");

        int distinctItems = countDisctinctList(arrayString);
        System.out.println("Number of Distincts items in the list: " + distinctItems);
    }
}
