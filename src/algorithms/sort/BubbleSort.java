package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String [] args) {

    int[] array = new int[] {5,6,4,2,1,3};

    int sizeOfArray = array.length;

    for (int i = 0; i < sizeOfArray - 1; i++) {

        for (int j = 0; j < sizeOfArray - 1 - i; j++ ) {

            if(array[j] > array[j+1]) {

                int betweenValue = array[j];

                array[j] = array[j + 1];
                array[j + 1] = betweenValue;


            }}



                System.out.println(Arrays.toString(array));
            }


            System.out.println("Sorted array: " + Arrays.toString(array));

    }

    }






