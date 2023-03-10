package org.example;

public enum ProductRepo {
    Smartphones(1),
    Cameras(2),
    Notebooks(3);

    private int productID;

    ProductRepo(int productID) {
        this.productID = productID;
    }

    public int getProductID (){
        return productID;
    }


}
