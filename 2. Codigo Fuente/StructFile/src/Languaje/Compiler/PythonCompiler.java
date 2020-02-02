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
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream(), "ISO-8859-1"));
            String aux = stdInput.readLine();
            String result = "";
            while (aux != null) {
                result += aux + "\n";
                aux = stdInput.readLine();
            }
            if (!result.equals("")) {
                System.out.println(result);
            }
            BufferedReader stdInput2 = new BufferedReader(new InputStreamReader(proc.getErrorStream(), "ISO-8859-1"));
            aux = stdInput2.readLine();
            String result2 = "";
            while (aux != null) {
                result2 += aux + "\n";
                aux = stdInput2.readLine();
            }
            if (!result2.equals("")) {
                TranslateToPython.semmanticError(result2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
