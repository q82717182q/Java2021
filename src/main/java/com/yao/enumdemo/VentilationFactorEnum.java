package com.yao.enumdemo;

/**
 * Created by Jack Yao on 2022/4/7 10:09 AM
 */
public enum VentilationFactorEnum {


    Confined_Space_Unventilated("_SDS_EF_1","局限空間/無通風",0.1),
    Improper_Ventilation("_SDS_EF_2","通風不良",0.01),
    Displacement_Ventilation("_SDS_EF_3","整體換氣",0.001),
    Local_Exhaust("_SDS_EF_4","局部排氣",0.0001),
    Sealed("_SDS_EF_5","密閉作業",0.00001),
    ;

    private String code;
    private String descTr;
    private Double predictor;

    VentilationFactorEnum(String code, String descTr, Double predictor) {
        this.code = code;
        this.descTr = descTr;
        this.predictor = predictor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescTr() {
        return descTr;
    }

    public void setDescTr(String descTr) {
        this.descTr = descTr;
    }

    public Double getPredictor() {
        return predictor;
    }

    public void setPredictor(Double predictor) {
        this.predictor = predictor;
    }

    public static Double getPredictor(String predictorString) {
        Double predictor = 0.0;
        switch (predictorString) {
            case "局限空間/無通風":
                predictor = Confined_Space_Unventilated.getPredictor();
                break;
            case "通風不良":
                predictor = Improper_Ventilation.getPredictor();
                break;
            case "整體換氣":
                predictor = Displacement_Ventilation.getPredictor();
                break;
            case "局部排氣":
                predictor = Local_Exhaust.getPredictor();
                break;
            case "密閉作業":
                predictor = Sealed.getPredictor();
                break;
        }
        return predictor;
    }


}
