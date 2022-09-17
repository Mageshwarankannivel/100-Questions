public class singleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] arrOfNumber) {
        int unique=0;

        for(int n:arrOfNumber){
            unique^=n;
        }
        return unique;
    }
}
