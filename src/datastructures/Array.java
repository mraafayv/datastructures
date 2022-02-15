package datastructures;
import java.util.*;

public class Array {


    int[] addElement(int[] array, int pos, int element) {
        int newArr[] = new int[array.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = array[i];
        }
        newArr[pos] = element;

        for (int j = pos + 1; j <= array.length; j++) {
            newArr[j] = array[j - 1];
        }

        System.out.println("Array before insertion ");
        printArray(array);
        System.out.println("Array after insertion ");
        printArray(newArr);

        return newArr;
    }

    int searchArray(int[] array, int element) {
        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                pos = i;
                break;
            }

        }
        if (pos != -1) {
            printArray(array);
            System.out.println("Element found at index: " + pos);
        } else {
            printArray(array);
            System.out.println("No such Element found! ");
        }
        return pos;
    }


    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Array arr = new Array();
        int[] array = {15, 81, 92, 23, 46};
        arr.searchArray(array, 46);

    }
}
