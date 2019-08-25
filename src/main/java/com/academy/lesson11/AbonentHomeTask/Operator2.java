package com.academy.lesson11.AbonentHomeTask;

import java.util.Random;

public class Operator2 {
    private String operator;
    private String number;
    private Long id;

    public Operator2() {
        setNumber(getSomeOperatorAndCreateNumber());
    }
    public Operator2(Long id, String name) {
        this.id = id;
        this.operator = name;
    }

    @Override
    public String toString() {
        return "Operator2{" +
                "operator='" + operator + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String[] operators = {"Life", "Kievstar", "Vodafone"};

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSomeOperatorAndCreateNumber() {
        int index = new Random().nextInt(operators.length);
        String operator = operators[index];
        String opertorCode = "";
        if (operator.equals("Life")) {
            opertorCode = createOpertorCode(new String[]{"38063", "38093", "38073"});
        }
        else if (operator.equals("Kievstar")) {
            opertorCode = createOpertorCode(new String[]{"38097", "38067", "38098"});
        }
        else if (operator.equals("Vodafone")) {
            opertorCode = createOpertorCode(new String[]{"38050", "38066", "38095"});
        }
        setOperator(operator);
        return opertorCode+generateLastNumber();
    }

    private String createOpertorCode(String[] codeVariable) {
        Integer selectedPref = new Random().nextInt(codeVariable.length);
        return codeVariable[selectedPref];
    }

    public static int generateLastNumber() {
        return (int) (1000000 + (Math.random() * 8999999));
    }
}


