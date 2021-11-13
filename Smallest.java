public class Smallest {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 8, 2, 3};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
        int minValue = arr[0];  //Assign the first element to min value
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minValue)
                minValue = arr[i];
        }
        System.out.println("Smallest element of the array:" +minValue);
    }
}