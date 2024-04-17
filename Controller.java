package tools;

import java.util.Objects;
import java.util.Scanner;

public class Controller {
    static Scanner read=new Scanner(System.in);
    //it displays info of all students.
    public static void Display(Student[] students){
        for (Student student: students)
        {
            if(student!=null){
            System.out.println("Student " + ":");
            System.out.println("Name: "+ student.getName());
            System.out.println("Subject: "+student.getSubjects());
            System.out.println("Marks: "+student.getMarks());
            System.out.println("UniName: "+student.uniName);
            System.out.println("***************************************");}
        }
    }
    //it Adds a single student to the array
    public static void add(Student[] students){
        if(students[4]==null)
        {
            System.out.print("Enter Name: ");
            String n=read.nextLine();

            System.out.print("Enter Subject: ");
            String s=read.nextLine();

            System.out.print("Enter Marks: ");
            double m=read.nextDouble();
            read.nextLine();

            students[4]=new Student(n,s,m);
            System.out.println("The student added successfully !");
        }
        else
        {
            System.out.println("Array is full. No space to add a new student");
        }

    }
    // it udpates the info of a student, finding by his/her name.
    public static void update(Student[] students){
        String n;
        System.out.print("Enter the name of Student: ");
        n=read.nextLine();
        boolean check=false;
        for (Student student : students) {
            if(student!=null) {
                if (Objects.equals(n, student.getName())) {
                    check = true;
                    System.out.println("Student is found. What do you want to change?");
                    n= read.nextLine();
                    switch (n) {
                        case "name":
                            System.out.print("Enter the new name :");
                            n=read.nextLine();
                            student.setName(n);
                            System.out.println("Done!");
                            break;
                        case "subject":
                            System.out.print("Enter the new subject: ");
                            n= read.nextLine();
                            student.setSubjects(n);
                            System.out.println("Done!");
                            break;
                        case "marks":
                            System.out.print("Enter the new mark: ");
                            read.nextLine();
                            double m= Double.parseDouble(read.nextLine());
                            student.setMarks(m);
                            System.out.println("Done!");
                            break;

                        default:
                            System.out.println("There is no such info for this student");
                    }
                }
            }
        }
        if(!check)
            System.out.println("NO Students found!");

    }
    //it deletes a single student from the array.
    public static void delete(Student[] students){
        System.out.print("Enter the name of student: ");
        String n=read.nextLine();
        for (int i=0; i<students.length; i++)
        {
            if(students[i]!=null)
            {
                if(Objects.equals(n,students[i].getName()))
                {
                    students[i]=null;
                    System.out.println("Done!");
                    break;
                }
            }
        }
    }
}
