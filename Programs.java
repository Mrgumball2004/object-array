import java.util.Scanner;

public class Programs {
    private String name;
    
    public Programs(String name) {
        this.name = name;
    }
    
    public void coursesName() {
        Scanner course = new Scanner(System.in);
          
        System.out.println("1. TEP");
        System.out.println("2. BSBA");
        System.out.println("3. BSIT");
        System.out.println(name + " Enter Program Name: ");
    
        String selectedProgram = course.nextLine();
            
        if (selectedProgram.equals("1")) {
            System.out.println(name + ".Teacher Education Program");     
        }
        else if (selectedProgram.equals("2")) {
            System.out.println(name + ".Bachelor of Science Business Administration");     
        }
        else if (selectedProgram.equals("3")) {
            System.out.println(name + ".Bachelor of Science in Information Technology");     
        }
        else {
            System.out.println("Invalid input. Enter value again!");
        }  
        
        course.close();
    }
}
