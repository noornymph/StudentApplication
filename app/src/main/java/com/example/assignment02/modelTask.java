package com.example.assignment02;

public class modelTask {

    private String sabaq,sabaqi,manzil,rollNum;

     modelTask(String sabaq, String sabaqi, String manzil, String rollNum) {
        this.sabaq = sabaq;
        this.sabaqi = sabaqi;
        this.manzil = manzil;
        this.rollNum = rollNum;
    }

     String getSabaq() {
        return sabaq;
    }

     void setSabaq(String sabaq) {
        this.sabaq = sabaq;
    }

     String getSabaqi() {
        return sabaqi;
    }

     setSabaqi(String sabaqi) {
        this.sabaqi = sabaqi;
    }

     String getManzil() {
        return manzil;
    }

     void setManzil(String manzil) {
        this.manzil = manzil;
    }

     String getRollNum() {
        return rollNum;
    }

     void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }
}
