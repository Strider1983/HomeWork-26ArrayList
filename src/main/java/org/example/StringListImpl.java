package org.example;

import org.example.exeptions.CellIsNotEmptyExeption;
import org.example.exeptions.ItemNotFoundExeption;

import java.util.Arrays;

public class StringListImpl implements StringList{
    String items[] = new String[5];
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
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
