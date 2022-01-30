

public class powerOfTwo {
    public static void main (String [] args){
        powerOfTwo bla = new powerOfTwo();
        for(int i = 1; i <= 64; i++){
            System.out.println(bla.isPowerOfTwo(i));
        }
    }
    
    public boolean isPowerOfTwo(int num){
        if(num == 1){return true;}
        if((2&num) == 2 || (2&num) == 0){
            return true;
        }
        return false;
    }
}
