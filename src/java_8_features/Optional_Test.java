package java_8_features;

import java.util.Optional;

public class Optional_Test {

    public static void main(String[] args) {

        System.out.println("Empty Optional: " + Optional.empty());
        //o/p: Empty Optional: Optional.empty
        
        String answer1 = "Yes";
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        //o/p: ofNullable on Non-Empty Optional: Optional[Yes]
 
        
        Optional<String> gender = Optional.of("MALE");
        System.out.println(gender.isPresent()); //o/p:true
        System.out.println("Non-Empty Optional:" + gender); //o/p: Non-Empty Optional:Optional[MALE]
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        //o/p:Non-Empty Optional: Gender value : MALE
        
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); //o/p: false
        
        Optional<String> opt = Optional.of("Ramesh");
        String name6 = opt.get();
        System.out.println(name6); //o/p:
        
        String answer2 = null;
        String name = Optional.ofNullable(answer2).orElse("Ramesh");
        String name1 = Optional.ofNullable(answer2).orElseGet(() -> "Ramesh");
        String name2 = Optional.ofNullable(answer2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name1);//o/p: Ramesh
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
        //o/p: Exception in thread "main" java.lang.IllegalArgumentException
        System.out.println(name2); //o/p:Exception in thread "main" java.lang.IllegalArgumentException
        System.out.println(name); //o/p:Exception in thread "main" java.lang.IllegalArgumentException
        
        
        
        // java.lang.NullPointerException
       // System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    }
}
