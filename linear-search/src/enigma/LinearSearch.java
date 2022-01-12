package enigma;

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
}

public class LinearSearch extends SearchAlgo {

    public static void main(String[] args) {
        //Find wether 14 Exists in the array
        int[] arr = {18,12,9,14,77,50};
        System.out.println(searchNumber(arr,14));

        String text = "SanatGawade";
        char target = 'Z';
        System.out.println(searchChar(text,target));
    }
}
