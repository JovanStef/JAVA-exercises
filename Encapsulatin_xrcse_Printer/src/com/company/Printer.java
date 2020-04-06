package com.company;

public class Printer {
    private int tonerLvl = 100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLvl, boolean duplex) {
        if(tonerLvl>0&&tonerLvl<=100){
            this.tonerLvl = tonerLvl;
        }else{
            this.tonerLvl = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void printPages(int pages){
        int counter = 1;
        while (pages>0){
            if(this.getTonerLvl()<=pages/10){
                System.out.println("No more toner left");
                break;
            }else{
                double tonerPerPage = pages/10;
                this.useToner(tonerPerPage);
                System.out.println(counter + " pages printed!!!");
                pagesPrinted++;
                counter++;
                pages--;
            }

        }

    }
    public void useToner(double toner){
            tonerLvl-=toner;
    }
    public void fillToner(){
       this.tonerLvl = 100;
    }
    public int getTonerLvl() {
        return tonerLvl;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }


}
