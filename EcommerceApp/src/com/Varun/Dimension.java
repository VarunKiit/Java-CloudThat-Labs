package com.Varun;

public class Dimension{
    private double lt;
    private double bt;
    private double ht;

    public Dimension() {
    }

    public Dimension(double lt, double bt, double ht) {
        this.lt = lt;
        this.bt = bt;
        this.ht = ht;
    }

    public Dimension(double lt, double bt) {
        this.lt = lt;
        this.bt = bt;
    }

    public double getLength() {
        return lt;
    }

    public void setLength(double lt) {
        this.lt = lt;
    }

    public double getBreadth() {
        return bt;
    }

    public void setBreadth(double bt) {
        this.bt = bt;
    }

    public double getHeight() {
        return ht;
    }

    public void setHeight(double ht) {
        this.ht = ht;
    }
}
