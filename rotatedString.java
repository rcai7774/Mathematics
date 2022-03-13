//import java.util.*;
public class rotatedString {
    public static void main(String [] args){
        rotatedString bla = new rotatedString();
        System.out.println(bla.rotateString("Hello", 3));
        System.out.println(bla.isRotated("Hello", bla.rotateString("Hello", 3)));
    }

    public String rotateString(String input, int num){
        num = num % input.length();
        char[] letters = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            letters[(num + i) % (input.length())] = input.charAt(i);
        }
        return new String(letters);
    }

    public boolean isRotated(String input, String input2){
        if(input.length() != input2.length()){
            return false;
        }
        for(int i = 1; i <  input.length(); i++){
            if(rotateString(input, i).equals(input2)){
                return true;
            }
        }
        return false;
    }
}
