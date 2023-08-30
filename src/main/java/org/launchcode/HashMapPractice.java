package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args){

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students name");

        // Get Student names and IDS
         do{
             System.out.println("Student: ");
             newStudent = input.nextLine();

             if(!newStudent.equals("")){
                 System.out.println("Student ID ");
                 Integer studentID = input.nextInt();
                 students.put(newStudent, studentID);

                 input.nextLine();
             }
         }while(!newStudent.equals(""));
        System.out.println("Class List; ");

        for (Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println(student.getKey() + "(" +student.getValue() + ")");
        }
        System.out.println(students);
    }

}
