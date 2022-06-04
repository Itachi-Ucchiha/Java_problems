import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


        // difference between next() and nextline()

        // 1st difference is simple - the next() will take
        // input until it will encounter the whitespaces
        // whereas the nextLine() will take input until user press enter (/n)


    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("enter your id: ");
    int id = sc.nextInt();
    System.out.println("your id is "+id);
    
// problem arises here , because without using the below line the code is skipping 
// the input




    sc.nextLine();  
    // ?? why did we used this line?
    // to remove the /n from the buffer we use this...otherwise the nextLine()
    // will skip our input

    System.out.println("enter your name: ");
    String name = sc.nextLine();
    System.out.println("welcome "+name); 


    System.out.println("Enter your salary");
    double salary = sc.nextDouble();
    System.out.println("ur salary is "+salary);


    System.out.println("enter your name: ");
    String name3 = sc.next(); // no problem with next() it will not skip the input even though there
    // is /n in the string buffer
    System.out.println("welcome "+name3); 

    sc.close();

    }
}
 
