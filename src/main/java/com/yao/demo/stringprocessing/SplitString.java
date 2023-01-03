package com.yao.demo.stringprocessing;

import java.util.Map;
import java.util.TreeMap;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;

/**
 * Created by Jack Yao on 2022/3/29 10:51 AM
 */
public class SplitString {
    public static void main(String[] args) {


//        System.out.println(1/0);
//    	try {
//            System.out.println(1/0);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    	
        System.out.println("\nVVVVVVVVVV split with v11 \n");
        splitV10Data();
        System.out.println("\n---------- split with v11 \n");

        
        
        
//        String s1 = "[Q2021-11-11-0039] QA_Facility";
//
//        String s2 = "TWA: 100 ppm";
//
//        for (String element : s2.split(" ")) {
//            System.out.println(element);
//
//            if (isNumeric(element))
//                System.out.println("true");
//            else
//                System.out.println("false");
//        }
        
        

    }

    private static void splitV10Data() {
		String data = " sds_product_properties|'lookup'|'_SDS_DI_1'|'5 colors'|'5 odors'|''|NULL|'Partition coeff: n-octanol/water '|'63'|'1'|'22'|'33'|'53'|'55'|'56'|'57'|'58'|'59'|'60'|'61'|'62'|'_SDS_DK_2'|'7'|'64'|1|NULL| NULL|NULL|NULL|0'|'54'|'OxLab'|'66'|'ExpLab'|'67'|'30%%'|'68'|'40'|'69'|'50%%'|'70'|'51'|'52'|'0'|'234'\\nrevision_date|'12/16/22'\\nissued_date|'12/16/22'\\nversion|1\\nhtml_attachment|https://saas-dev-sds.logicsolutions.com.tw/output/quantumtest-dev-saas/221216070039.htm|'Australia WHS Act SDS'|'_SDS_AD_1'|'_SYS_A2_1'\\nsds_product_transport|'NotReg'";
		String[] dataArr = data.split("\\|");
		Map<Integer, String> dataMap = new TreeMap<>();
		int count = 0;
		for (String dataElement : dataArr) {
			dataMap.put(count, dataElement);
			count++;
		}
		System.out.println("dataMap : " + dataMap);

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
