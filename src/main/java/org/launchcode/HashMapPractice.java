package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner (System.in);
        Integer studentId;

        //get Id and Name

        do{
            System.out.println("Student Id: ");
            studentId = input.nextInt();
//PROBLEM - CONDITIONAL NEEDED FOR EMPTY INTEGER NEXT LINE
            if (!studentId.equals("")){
                System.out.println(("Student Name: "));
                String studentName = input.nextLine();
                students.put(studentId,studentName);

                // Read in the newline before looping back
                input.nextLine();
            }
        }while(!studentId.equals(""));
        // Print Student List
        System.out.println("\nStudent List");

        for(Map.Entry<Integer,String> ids : students.entrySet()){
            System.out.println(ids.getKey() + "(" + ids.getValue() +")");
        }
    }
}
