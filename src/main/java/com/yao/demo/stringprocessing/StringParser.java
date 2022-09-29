package com.yao.demo.stringprocessing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack Yao on 2022/3/30 11:09 AM
 */
public class StringParser {
    public static void main(String[] args) {
        final String s1 = "TWA: 100 ppm; 434 mg/m3  ;STEL: 125 ppm; 542.5 mg/m3";
//        final String s1 = "TWA: 100 ppm; 434 mg/m3  ;STEL: 125 ppm; 542.5 mg/m3";
//        final String s1 = "Ceiling: 0.2 ppm; 1.5 mg/m3";
//        final String s1 = "TWA: 100 ppm; 303 mg/m3  ;STEL: 125 ppm; 378.75 mg/m3";

        Map<String, Double> concentrationMap = new HashMap<>();
        String[] concentrationSplitWithSemicolonArr = s1.split(";");
        String concentrationType = "";
        String concentrationUnit = "";
        Double concentrationData = 0.0;
        for (String concentrationSplitWithSemicolon : concentrationSplitWithSemicolonArr) {

            System.out.println("================================================================================");

            if (concentrationSplitWithSemicolon.matches("TWA(.*)")){
                concentrationType = "TWA";
            }else if (concentrationSplitWithSemicolon.matches("STEL(.*)")){
                concentrationType = "STEL";
            }else if (concentrationSplitWithSemicolon.matches("Ceiling(.*)")){
                concentrationType = "Ceiling";
            }
            System.out.println("concentrationSplitWithSemicolon : " + concentrationSplitWithSemicolon);
            String[] concentrationElementArr= concentrationSplitWithSemicolon.split(" ");
            for (String element : concentrationElementArr) {
                if (isNumeric(element)){
                    concentrationData = Double.parseDouble(element);
                }else if ("ppm".equals(element)){
                    concentrationUnit = "ppm";
                }else if ("mg/m3".equals(element)){
                    concentrationUnit = "mg/m3";
                }
            }
            concentrationMap.put(concentrationType + "-" + concentrationUnit, concentrationData);
        }

        System.out.println(concentrationMap);

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
