package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
public class TaskTest{

	@Test
    public void task1IsPalindrome() {
        Task1 task1 = new Task1();

        assertEquals(true, task1.isPalindrome("radar"));
        assertEquals(false, task1.isPalindrome("cart"));
    }

    @Test
    public void task2RemoveMiddleElement() {
        Task2 task2 = new Task2();

        task2.add(1);
        task2.add(2);
        task2.add(3);
        task2.add(4);
        task2.add(5);

        task2.removeMiddle();

        ArrayList<Integer> expectedResult = new ArrayList();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(5);

        ArrayList<Integer> actualResult = new ArrayList();
        Task2.Node current = task2.head;
        
        while (current != null) {
            actualResult.add(current.data);
            current = current.next;
        }

        assertEquals(expectedResult, actualResult);
    }

    @Test
      public void task3CountDistinctList() {
        Task3 task3 = new Task3();

        ArrayList<String> arrayString = new ArrayList();
        arrayString.add("1");
        arrayString.add("1");
        arrayString.add("2");
        arrayString.add("2");
        arrayString.add("3");
        arrayString.add("4");

        assertEquals(4, task3.countDisctinctList(arrayString));
    }
}