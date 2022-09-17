public class findtheMissingElement {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int uni=0;

        for(int i=0;i< nums.length;i++){

            uni^=nums[i]^(i+1);
        }
        return uni;

    }
}
