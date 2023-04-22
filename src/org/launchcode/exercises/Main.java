package org.launchcode.exercises;



import java.util.*;

public class Main {


    public static void main(String[] args) {

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Chris", "MyCode.java");
        studentFiles.put("Grace", "This.java");
        studentFiles.put("Remy", "hello.java");
        studentFiles.put("Meagan", "");



        Divide(10, 5);

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));

        }

    }

    public static void Divide(int x, int y) {

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }


    public static int CheckFileExtension(String fileName) {

        int grade;

        if (fileName.isEmpty()) {
            try {
                throw new MissingFormatArgumentException("No File attached");
            } catch (MissingFormatArgumentException e) {
                grade = -1;
                e.printStackTrace();
            }
        } else if (fileName.contains(".java")) {
            grade = 1;
        } else {
            grade = 0;
        }

        return grade;
    }
}
