import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class RasomNote {

   

    public static void checkMagazine(List<String> magazine, List<String> note) 
    {
        Map<String,Integer>magWords = new HashMap<>();
        for(String word:magazine)
        {
            if(magWords.containsKey(word))        
            {
                int count = magWords.get(word);
                count++;
                magWords.put(word, count);
            }
            else
            {
                magWords.put(word, 1);
            }
            
        } 
        
        for(String word:note)
        {
            if(magWords.containsKey(word))
            {
                int count =  magWords.get(word);
                if(count<=0)
                {
                    System.out.println("No");
                    return;
                }
                count--;
                magWords.put(word, count);
                
            }
            else if(!magWords.containsKey(word))
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        List<String> note = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
