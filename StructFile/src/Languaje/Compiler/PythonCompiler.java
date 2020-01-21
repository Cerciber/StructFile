package Languaje.Compiler;

import Languaje.TranslateToPython.TranslateToPython;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonCompiler {

    public static void run () {
        try {
            String command = "C:\\Users\\acer\\AppData\\Local\\Programs\\Python\\Python37-32\\python.exe \"" + new File("src/Data/Out/Out.py").getAbsoluteFile().toString() + "\"";
            Process proc = Runtime.getRuntime().exec(command);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String result = stdInput.readLine();
            if (result != null) {
                System.out.println(result);
            }
            BufferedReader stdInput2 = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String result2 = stdInput2.readLine();
            if (result2 != null) {
                TranslateToPython.semmanticError(result2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
