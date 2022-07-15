package com.yao.stringprocessing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jack Yao on 2022/3/30 1:01 PM
 */
public class StringParser2 {
    public static void main(String[] args) {
            final String s1 = "TWA: 100 ppm; 434 mg/m3  ;STEL: 125 ppm; 542.5 mg/m3 ;Ceiling: 0.005 ppm; 0.036 mg/m3";
//            final String s1 = "TWA: 100 ppm; 434 mg/m3  ;STEL: 125 ppm; 542.5 mg/m3";

            Map<String, Double> concentrationMap = new HashMap<>();
            String concentrationType = "";
            String concentrationUnit = "";
            Double concentrationData = 0.0;
            for (String element: s1.split(" ")) {
                System.out.println("====================================");
                System.out.println("element : " + element);
                if ("TWA".equals(element) || "TWA:".equals(element) || ";TWA:".equals(element)){
                    concentrationType = "TWA";
                }else if ("STEL".equals(element) || "STEL:".equals(element) || ";STEL:".equals(element)){
                    concentrationType = "STEL";
                }else if ("Ceiling".equals(element) || "Ceiling:".equals(element) || ";Ceiling:".equals(element)){
                    concentrationType = "Ceiling";
                }

                if (isNumeric(element)){
                    concentrationData = Double.parseDouble(element);
                    continue;
                }else if ("ppm".equals(element) || "ppm;".equals(element)){
                    concentrationUnit = "ppm";
                }else if ("mg/m3".equals(element) || "mg/m3;".equals(element)){
                    concentrationUnit = "mg/m3";
                }
                System.out.println("concentrationType : " + concentrationType);
                System.out.println("concentrationUnit : " + concentrationUnit);
                System.out.println("concentrationData : " + concentrationData);

                if (!"".equals(concentrationType) && !"".equals(concentrationUnit)) {
                    concentrationMap.put(concentrationType + "-" + concentrationUnit, concentrationData);
                }
            System.out.println(concentrationMap);
        }
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
