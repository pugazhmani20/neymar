 /*interface number{
    int num(int index);
}
public class two{
    public static void main(String[] args) {
        for (int index = 0; index <30; index++) {
            if (index % 2==0) {
                System.out.println("Even number : "+index );
            }
        }
    }
}*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class two{
    public static void main(String[] args) {

     List<String> even=Arrays.asList("index");

     for (int index = 0; index <30; index++) {
        
     if (index % 2==0) {
        System.out.println("Even number"+index);
     }

     List<String> Even=even.stream().filter(n-> n).
     }
       

         
    }
}
