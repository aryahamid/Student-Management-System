import java.util.Scanner;
import tools.*;

class Main{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        Student[] students=new Student[5];
        Set.setUp(students);
        boolean check=true;
        while (check)
        {
            read.nextLine();
            cls();
            System.out.println("""
                    ******** Welcome to Students SM *******\n
                    1. Show list of students.
                    2. Add a new Student.
                    3. Update a student's info.
                    4. Delete a student.
                    5. Exit.
                    """);
            int choice=read.nextInt();
            switch(choice) {
                case 1:
                    Controller.Display(students);
                    read.nextLine();
                    break;
                case 2:
                    Controller.add(students);
                    break;
                case 3:
                    Controller.update(students);
                    break;
                case 4:
                    Controller.delete(students);
                    break;
                case 5:
                    check=false;
                    System.out.println("Program terminated successfully.");
                    break;
                default:
                    System.out.println("Please Enter in range(1-5)");
            }
        }
    }
    public static void cls(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E)
        {
            System.out.println();
        }
    }
}