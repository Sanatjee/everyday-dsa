package enigma;

import java.util.Arrays;

class SearchAlgo{
    public static boolean searchNumber(int[] nums, int numToSearch){
        if(nums.length == 0){
            return false;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == numToSearch){
                return true;
            }
        }
        return false;
    }

    public static boolean searchChar(String text, char target){
        if(text.length() == 0){
            return false;
        }

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == target ){
                return true;
            }
        }
        return false;
    }

    public static int findMinNumber(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMaxNumber(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static int[] searchIn2DArray(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

public class LinearSearch extends SearchAlgo {

    public static void main(String[] args) {
        //Find wether 14 Exists in the array
        int[] arr = {18,12,9,14,77,50,2};
        System.out.println(searchNumber(arr,14));

        String text = "SanatGawade";
        char target = 'Z';
        System.out.println(searchChar(text,target));

        //Finding smallest number
        System.out.println("Smallest Number is : " + findMinNumber(arr));

        //Finding largest number
        System.out.println("Largest Number is : " + findMaxNumber(arr));

//        Find in 2D Array
        int[][] TwoDArray = {
                {24,2,3},
                {9,65,4},
                {78,6,3}
        };
        int TwoDTarget = 6;

        int[] ans = searchIn2DArray(TwoDArray, TwoDTarget);
        System.out.println(Arrays.toString(ans));
    }
}
