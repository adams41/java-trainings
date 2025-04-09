package algorithms.search;

public class BinarySearch {

    public static void main (String[] args) {

        int[] array = new int[] {1,3,5,7,9,11 };

        int target = 7;

        int beginIndex = 0;

        int endIndex = 5;

        int middleIndex;

            while (beginIndex <= endIndex) {
                middleIndex = beginIndex + (endIndex - beginIndex)/2;

                int middleValue = array[middleIndex];

                if (middleValue == target) {
                   System.out.println("Target with number " + middleIndex + " found!");
                   break;
                }
                else if (middleValue < target) {
                    beginIndex = middleIndex + 1;
                }

                else if (middleValue > target) {
                    endIndex = middleIndex - 1;
                }


            }
     }

}
