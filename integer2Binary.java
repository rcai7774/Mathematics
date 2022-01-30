public class integer2Binary {
    public static void main (String [] args){
        integer2Binary bla = new integer2Binary();
        System.out.println(bla.binaryConversion(17));
    }

    public String binaryConversion(int num){
        int aaa = num;
        String result = "";
        while(aaa >= 1){
            if(aaa % 2 == 0){
                result = '0' + result;
                aaa = aaa/2;
            }
            else if(aaa % 2 == 1){
                result = '1' + result;
            }
            aaa = aaa/2;
        }
        return result;
    }
}
