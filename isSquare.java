public class isSquare {
    public static void main (String [] args){
        isSquare bla = new isSquare();
        /*for(int n = 1; n <= 100; n++){
            System.out.println(n);
            System.out.println(bla.isPerfectSquare(n));
        }*/
        System.out.println(bla.isPerfectSquarePlus2(8));
        /*int num = 1001;
        System.out.println(num);
        System.out.println(bla.isPerfectSquare(num));*/
    }
    public boolean isPerfectSquare(int num){
        if(num == 1){return true;}
        for(int i = 2; i <= num/2; i++){
            if(i * i == num){
                return true;
            }
            else if(i * i > num){
                break;
            }
        }
        return false;
    }
    public boolean isPerfectSquareImproved(int num){
        if(num == 1){return true;}
        return false;
    }
    
public boolean isSquareFactor2(int num) {
    if (num == 1)
    return true;
    for (int f = 2; num > 1 && num >= f * f;) {
    System.out.println("Factor2 Trying: " + num);
    if (num % (f * f) == 0) {
    num /= (f * f);
    } // extracted f*f
    else
    f++;
    }
    return num == 1;
    }
    public boolean isPerfectSquarePlus(int num){
        int sum = 0;
        for(int i = 1; sum < num; i+=2){
            sum += i;
        }
        return (sum == num);
    }
    public boolean isPerfectSquarePlus2(int num){
        int sum = num;
        for(int i = 1; sum > 0; i+=2){
            sum -= i;
        }
        return (sum == 0);
    }
}
