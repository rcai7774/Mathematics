public class binary2integer {
    public static void main (String [] args){
        binary2integer bla = new binary2integer();
        System.out.println(bla.getIntfromBinary("10110"));
    }

    public int getIntfromBinary(String num){
        int res = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1'){
                res += Math.pow(2, ((num.length()-1))-i);
            }
            res += 0;
        }
        return res;
    }
}
