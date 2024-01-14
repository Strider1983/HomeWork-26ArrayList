package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringListImplTest {
    private final StringListImpl stringList = new StringListImpl();
    @Test
    public void shouldItemBeAdded() {
        String[] items = new String[] {"it1"};
        String actualIt = stringList.add("it1");
        Assertions.assertEquals(items[0], actualIt);
    }
    @Test
    public void shouldItemBeAddedToSpecCell() {
        String[] items = new String[] {"it1"};
        String actualIt = stringList.addToSpecCell(0, "it1");
        Assertions.assertEquals(items[0], actualIt);
    }
    @Test
    public void shouldItemBeSet() {
        String[] items = new String[] {"it1"};
        String actualIt = stringList.set(0, "it1");
        Assertions.assertEquals(items[0], actualIt);
    }
    @Test
    public void shouldItemBeRemoved() {
        String[] items = new String[]{"it1"};
        stringList.add("it1");
        String actualIt = stringList.remove("it1");
        Assertions.assertEquals(items[0], actualIt);
    }
    @Test
    public void shouldItemBeRemovedByIndex() {
        String[] items = new String[5];
        stringList.add("it1");
        String actualIt = stringList.removeByIndex(0);
        Assertions.assertEquals(items[0], actualIt);
    }
    @Test
    public void shouldItemBeInArray() {
        String[] items = new String[]{"it1"};
        boolean it1 = true;
        stringList.add("it1");
        boolean actualIt = stringList.contains("it1");
        Assertions.assertEquals(it1, actualIt);
    }
    @Test
    public void shouldIndexBeReturned() {
        String[] items = new String[]{"it1"};
        int index = 0;
        stringList.add("it1");
        int actualIndex = stringList.indexOf("it1");
        Assertions.assertEquals(index, actualIndex);
    }
    @Test
    public void shouldLastIndexBeReturned() {
        String[] items = new String[]{"it1"};
        int index = 0;
        stringList.add("it1");
        int actualIndex = stringList.lastIndexOf("it1");
        Assertions.assertEquals(index, actualIndex);
    }
    @Test
    public void shouldArraysBeCompared() {
        String[] newItems = new String[3];
        newItems[0] = "it1";
        stringList.add("it1");
        boolean compare = true;
        boolean actualCompare = stringList.equals(newItems);
        Assertions.assertEquals(compare, actualCompare);
    }
    @Test
    public void shouldSizeBeReturned() {
        int size = 1;
        stringList.add("it1");
        int actualSize = stringList.size();
        Assertions.assertEquals(size, actualSize);
    }
    @Test
    public void shouldArrayBeEmpty() {
        boolean isNotEmpty = false;
        stringList.add("it1");
        boolean actualEmpty = stringList.isEmpty();
        Assertions.assertEquals(isNotEmpty, actualEmpty);
    }
    @Test
    public void shoulArrayBeCleared() {
        String[] newItems = new String[3];
        boolean clear = true;
        stringList.add("it1");
        stringList.clear();
        String[] cleared = stringList.toArray();
        boolean actualClear = Arrays.equals(cleared, newItems);
        Assertions.assertEquals(actualClear, clear);

    }
    @Test
    public void shouldNewArrayBeCreated() {
        String[] newItems = new String[3];
        newItems[0] = "it1";
        boolean created = true;
        stringList.add("it1");
        String[] actualItems = stringList.toArray();
        boolean actual = Arrays.equals(newItems, actualItems);
        Assertions.assertEquals(created, actual);

    }

}
