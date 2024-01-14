package org.example;

import org.example.exeptions.CellIsNotEmptyExeption;
import org.example.exeptions.ItemNotFoundExeption;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringListImpl implements StringList{
    String items[] = new String[3];
    @Override
    public String add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public String addToSpecCell(int index, String item) {
        if (items[index] == null) {
            items[index] = item;
        } else {
            throw new CellIsNotEmptyExeption("данная ячейка массива уже занята");
        }
        return item;
    }

    @Override
    public String set(int index, String item) {
        items[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        boolean checkItem = false;
        for (String element:items) {
            if (element == item) {
                checkItem = true;
                break;
            }
        }
        if (checkItem == false) {
            throw new ItemNotFoundExeption("указанный элемент массива не найден");
        } else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == item) {
                    items[i] = null;
                }
            }
            return item;
        }
    }

    @Override
    public String removeByIndex(int index) {

        if (items[index] == null) {
            throw new ItemNotFoundExeption("элемент с указанным индексом отсуствует в массиве");
        } else {
            items[index] = null;
        }
        return items[index];
    }

    @Override
    public boolean contains(String item) {
        boolean contains = false;
        for (String element:items) {
            if (element == item) {
                 contains = true;
                 break;
            }

        }
        return contains;
    }

    @Override
    public int indexOf(String item) {
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        int index = -1;
        for (int i = items.length-1; i >= 0; i--) {
            if (items[i] == item) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(String[] otherList) {
        return Arrays.equals(items, otherList);
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (String element:items
             ) {
            if (element != null) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    @Override
    public void clear() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i] = null;
            }
        }
    }

    @Override
    public String[] toArray() {
        String[] newString = Arrays.copyOf(items, items.length);
        return newString;
    }
}
