package com.academy.lesson05.task01;

public class Months {
    private int JAN;
    private int FEB;
    private int MAR;
    private int APR;
    private int MAY;
    private int JUN;
    private int JUL;
    private int AUG;
    private int SEP;
    private int OCT;
    private int NOV;
    private int DEC;

    public Months() {
        setJAN();
        setFEB();
        setMAR();
        setAPR();
        setMAY();
        setJUN();
        setJUL();
        setAUG();
        setSEP();
        setOCT();
        setNOV();
        setDEC();
    }

    public int getJAN() {
        return JAN;
    }

    public void setJAN() {
        JAN = 31;
    }

    public int getFEB() {
        return FEB;
    }

    public void setFEB() {
        this.FEB = 28;
    }

    public int getMAR() {
        return MAR;
    }

    public void setMAR() {
        this.MAR = 31;
    }

    public int getAPR() {
        return APR;
    }

    public void setAPR() {
        this.APR = 30;
    }

    public int getMAY() {
        return MAY;
    }

    public void setMAY() {
        this.MAY = 31;
    }

    public int getJUN() {
        return JUN;
    }

    public void setJUN() {
        this.JUN = 30;
    }

    public int getJUL() {
        return JUL;
    }

    public void setJUL() {
        this.JUL = 31;
    }

    public int getAUG() {
        return AUG;
    }

    public void setAUG() {
        this.AUG = 31;
    }

    public int getSEP() {
        return SEP;
    }

    public void setSEP() {
        this.SEP = 30;
    }

    public int getOCT() {
        return OCT;
    }

    public void setOCT() {
        this.OCT = 31;
    }

    public int getNOV() {
        return NOV;
    }

    public void setNOV() {
        this.NOV = 30;
    }

    public int getDEC() {
        return DEC;
    }

    public void setDEC() {
        this.DEC = 31;
    }

    public int returnMonthsDays(int monthNumber){
        if (monthNumber ==1) return getJAN();
        else if (monthNumber ==2) return getFEB();
        else if (monthNumber ==3) return getMAR();
        else if (monthNumber ==4) return getAPR();
        else if (monthNumber ==5) return getMAY();
        else if (monthNumber ==6) return getJUN();
        else if (monthNumber ==7) return getJUL();
        else if (monthNumber ==8) return getAUG();
        else if (monthNumber ==9) return getSEP();
        else if (monthNumber ==10) return getOCT();
        else if (monthNumber ==11) return getNOV();
        else if (monthNumber ==12) return getDEC();

        else return 1;
    }
}
