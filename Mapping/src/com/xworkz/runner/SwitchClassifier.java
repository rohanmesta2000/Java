package com.xworkz.runner;
import java.util.regex.*;

public class SwitchClassifier {
    public static void main(String[] args) {
        // Example usage
        String modelNumber = "C5250L-32P-2T";
        String result = classifySwitch(modelNumber);
        System.out.println("Switch Classification: " + result);
    }

    public static String classifySwitch(String modelNumber) {
        // Rule 1: Type 1 switches
        if (modelNumber.matches(".*[A-Z]{2}-[A-Z]5200-\\d{2}P.*") ||
            modelNumber.matches(".*[A-Z]5200\\d{0,2}-\\d{2}P.*")) {
            return "Type 1 switch";
        }

        // Rule 2: Type 2 switches
        if ((modelNumber.matches(".*[A-Z]{2}-[A-Z](52|53|54)00-\\d{2}P.*") ||
             modelNumber.matches(".*[A-Z](52|53|54)00\\d{0,2}-\\d{2}P.*")) &&
            !modelNumber.matches(".*[A-Z](52|53|54)00\\d{0,2}-\\d{2}P.*-[A-Z]NX.*")) {
            return "Type 2 switch";
        }

        // Rule 3: Core switches
        if (modelNumber.matches(".*-(S|\\d+X)$")) {
            return "Core switch";
        }

        // Default: Unrecognized switch type
        return "Unrecognized switch type";
    }
}