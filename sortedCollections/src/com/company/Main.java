package com.company;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.56, 100);
        stockList.addStock(temp);
        temp = new StockItem("car", 11.05, 8);
        stockList.addStock(temp);
        temp = new StockItem("glass", 22.06, 3);
        stockList.addStock(temp);
        temp = new StockItem("chair", 100.25, 22);
        stockList.addStock(temp);
        temp = new StockItem("hose", 35.89, 4);
        stockList.addStock(temp);
        temp = new StockItem("phone", 55.20, 18);
        stockList.addStock(temp);
        temp = new StockItem("bucket", 45.20, 65);
        stockList.addStock(temp);
        temp = new StockItem("towel", 0.12, 38);
        stockList.addStock(temp);
        temp = new StockItem("vase", 2.22, 66);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket myBasket = new Basket("Basket");
        sellItem(myBasket , "car",2);
        System.out.println(myBasket);

    }

    public static int sellItem(Basket basket , String item , int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We dont sell "+ item);
            return 0;
        }
        if(stockList.reserveStock(item , quantity)!=0){
            return basket.addToBasket(stockItem , quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket , String item , int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We dont sell "+ item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem , quantity) == quantity){
            return stockList.unreserveStock(item , quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem , Integer> item : basket.items().entrySet()){
            stockList.sellStock(item.getKey().getName() , item.getValue());
        }
        basket.clearBasket();
    }



}
