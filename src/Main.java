import java.util.HashMap;
import java.util.HashSet;

public class Main  {
    public static void main(String[] args) {
       String str = "This is just a way to find first repeating chars.";
       char[] array = str.toCharArray();
        System.out.println(firstRepeat(array));

        str = "Here is another sample.";
        char[] array2= str.toCharArray();
        System.out.println(firstRepeat(array2));

        str= "oh no, a repeat";
        char[] array3 =str.toCharArray();
        System.out.println(firstRepeat(array3));

        str = "no val x g j r";
            char[] array4 = str.toCharArray();
        System.out.println(firstRepeat(array4));
    }
    //this is to return the first repeated char in a string
    static char firstRepeat(char str[]){
        // make a hashset
        HashSet<Character> h = new HashSet<>();

        for(int i=0;  i<= str.length; i++ ){
            char c = str[i];
            //if i has a char in the set then break
            if (h.contains(c))
                return c;
            else h.add(c);
        }
        return 55;
    }
}
