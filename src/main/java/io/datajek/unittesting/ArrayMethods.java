package io.datajek.unittesting;

public class ArrayMethods {
    /**
     * Method to find the index of a given number in the array
     * @param array
     * @param number
     * @return an index
     */
    int findIndex(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                index = i;
        }
        return index;
    }

    /**
     * Method to search if a number is present in the array
     * @param array
     * @param numberToSearchFor
     * @return true or false
     */
     boolean searchForNumber(int[] array, int numberToSearchFor) {
        boolean found = false;
        for (int i : array) {
            if (array[i] == numberToSearchFor) {
                found = true;
                return found;
            }
        }
        return found;
    }
}
