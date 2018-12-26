import java.util.*;

public class VowelRecognition {

  char[] vowels ={'a','e','i','o','u'};

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        Set<String> inputSet = new LinkedHashSet<>();
       int stringCount = sc.nextInt();


       // get all input strings
       for(int i=0;i<stringCount;i++){
           inputSet.add(sc.next());
       }

       // find combinations of words in string
        if(inputSet.size() == 0){
            System.out.println(0);
        }else{
            for(String s:inputSet){
                System.out.println(noOfVowels(s));
            }
        }


    }

    private static long noOfVowels(String s) {

        Set<String> set = new HashSet<>();
        long count=0;

        for(int i=0;i<s.length();i++){
            String s1 =appendString(s,i,"");
            set.add(s1);
            for(int j=i+1;j<s.length();j++){
                String sim = appendString(s,j,s1);
                set.add(sim);
                s1=sim;
            }
        }
       // count and add vowels in set elements
        for(String setElement:set){
            count += returnVowelCount(setElement);
        }

        return count;
    }

    private static long returnVowelCount(String s) {
        long add =0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i) =='a' ||s.charAt(i) =='e' ||s.charAt(i) =='i' ||s.charAt(i) =='o' ||s.charAt(i) =='u'){
              add++;
             }

         }
         return add;
    }

    private static String appendString(String s, int i, String append) {
        return append+s.charAt(i);
    }


}
