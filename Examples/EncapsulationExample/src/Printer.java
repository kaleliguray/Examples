public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if ((tonerLevel+tonerAmount) > 100 ) {
                return  -1;
            }
            tonerLevel += tonerAmount;
            return  tonerLevel;
        }
        return -1;
    }


    public int printPages(int pages){

        int pagesToPrint=pages;

        if(duplex)

            pagesToPrint=(pagesToPrint/2)+(pagesToPrint%2);

        this.pagesPrinted+= pagesToPrint;

        return pagesToPrint;

    }

    public int getPagesPrinted()

    {return this.pagesPrinted;
    }

}






































