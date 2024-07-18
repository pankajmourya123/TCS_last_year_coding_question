
package Inputs;
import java.util.*;

public class inputs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // // handleLineInput(sc);
        // // handleSpaceSeparatedInput(sc);
        // handleSpaceSeparatedString(sc);

        // // handleSpaceSeparatedArray(sc);
        String input =sc.nextLine();
        String [] words=input.split(" ");

       Arrays.sort(words);
       
   for (int i = 0; i < words.length; i++) {
    System.out.print(words[i]+" ");
   }
       System.out.println(words[0]);
       System.out.println(words[1]);
       int n=words.length;
       System.out.println(words[n-1]);
       System.out.println(words[n-2]);
        

    }

    public static void handleSpaceSeparatedString(Scanner sc){
        System.out.println("Enter space-separated words:");
        String input =sc.nextLine();
        String [] words=input.split(" ");

       Arrays.sort(words);
       System.out.println(Arrays.toString(words));
       System.out.println(words[0]);
       System.out.println(words[1]);
       int n=words.length;
       System.out.println(words[n-1]);
       System.out.println(words[n-2]);
    }




    public static void handleLineInput(Scanner sc){
   System.out.println("Enter lines 'end'):");
   while(sc.hasNextLine()){
    String line=sc.nextLine();
    if(line.equals("end")){
        break;
    }
    System.out.println("LINE: "+ line);
   }


}


    

public static void  handleSpaceSeparatedInput(Scanner sc){
    System.out.println("Enter start and end values (space-separated):");

    String input=sc.nextLine();
     String [] tokens =input.split(" ");
     int s=Integer.parseInt(tokens[0]);
     int e=Integer.parseInt(tokens[1]);

     System.out.println(s +" "+ e);
}

public static void handleSpaceSeparatedArray(Scanner sc){
    System.out.println("Enter space-separated integer");
    String input=sc.nextLine();
    String [] tokens=input.split(" ");

    List<Integer> num=new ArrayList<>();
    for (String  s : tokens) {
        num.add(Integer.parseInt(s));
    }

    int[] intArray=num.stream().mapToInt(i->i).toArray();
    for (int n : intArray) {
        System.out.println("Number: " + n);
    }
}


    }


//     handleLineInput(Scanner sc)
//     Purpose: This method reads lines of input until the user enters "end". It prints each line as it is read.
// Usage: It's useful when you want to handle multiple lines of input interactively until a specific termination condition ("end" in this case).



// handleSpaceSeparatedInput(Scanner sc)
// Purpose: This method reads two space-separated integers from the input and prints them.
// Usage: It's suitable when you need to handle input where two values are provided in a single line, such as start and end values.


// handleSpaceSeparatedArray(Scanner sc)
// Purpose: This method reads space-separated integers, stores them in a list, converts them to an array, and then prints each integer.
// Usage: It's helpful when you want to process a variable number of space-separated integers from the input.



// handleSpaceSeparatedString(Scanner sc)

// Purpose: This method reads space-separated words, sorts them alphabetically, and then prints the sorted list along with the first, second, last, and second last words.
// Usage: It's effective when dealing with input where words or strings are provided in a single line and you need to process and display them in a specific order.