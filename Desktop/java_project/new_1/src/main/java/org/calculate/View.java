package org.calculate;

public  class View {

    public Integer  num1;
    public Integer num2;

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public View(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;

    }



    @Override
    public String toString() {
        return "Vuie{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
