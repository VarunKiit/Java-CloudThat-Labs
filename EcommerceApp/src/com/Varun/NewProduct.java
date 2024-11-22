package com.Varun;

public class NewProduct extends Product{

    private int productCode;

    public NewProduct(String productName, double price) {
        super(productName, price);
    }

    public NewProduct(String productName, double price, int productCode) {
        super(productName, price);
        this.productCode = productCode;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {

        return super.toString() +
                ", "+
                "productCode=" + productCode +
                '}';
    }

}
