package easy;

public class MergeStringsAlternately {

    public static String mergeString (String word1,String word2){
        int m = word1.length();
        int n = word2.length();
        //You get the two lengths to use it to compare the strings,
        int min = Math.min(m, n);
        //you need to find the min to identify which string is smaller
        //in the case the strings aren't equal.
        //you need a stringbuilder to signify the combined string
        StringBuilder merged = new StringBuilder();
        //stringbuilder:a mutable sequence of characters
        //you need to convert the two arrays into char arrays to
        //access the characters easily.
        char temp1[] = word1.toCharArray();
        char temp2[] = word2.toCharArray();
        //this string will store the leftover string of the longer string
        String longerOne = "";
        //if the minimum is equal to the word1 length, the longerOne variable
        //is allocated to the word2
        if(min == m){
            longerOne = word2;
        }
        //if the minimum is equal to the word2 length, the longerOne variable
        //is allocated to word1
        if(min == n){
            longerOne = word1;
        }
        //we will use a for loop to iterate from 0 to min. We iterate to min so that
        //we can access both arrays equally until the min value. Then the
        //remaining strings can be accessed from the longer string.
        for(int a = 0; a < min; a++){
            //you append the two characters, first from temp1 then from temp2
            merged.append(temp1[a]);
            merged.append(temp2[a]);
            System.out.println(merged);
        }
        //we use the min as the substring value and apply a substring to longerOne
        //this will give us the rest of the longOne string.
        //substring:returns the string from the given index to the end of the string
        merged.append(longerOne.substring(min));
        //append:appends a specified string at the end of the current string and returns
        //the new combined string. So the leftover string is appended to the merged string
        return merged.toString();
    }
    //https://www.youtube.com/watch?v=A8LVjVQPaNs&t=125s
}
