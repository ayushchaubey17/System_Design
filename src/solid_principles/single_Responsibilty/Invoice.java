package solid_principles.single_Responsibilty;
//
//class Invoice {
//    private Marker marker;
//    private int quantity;
//
//    public Invoice(Marker marker, int quantity) {
//        this.marker = marker;
//        this.quantity = quantity;
//    }
//
//
//
//    public void printInvoice(){
//
//    }
//
//
//    // if change to save to file
//    public void saveToDb(){}
//
//    // if any logic for calculating is change
//    public double calculate_price(){
//        return  (this.marker.price) * (this.quantity);
//
//    }
//
//
//}
//



class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //only one responsibilty for changing
    public  double calcuate_total(){
        return marker.price * this.quantity;
    }
}


class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice= invoice;

    }

    public void  savetToDb(){}
}




class InvoicePrinter{
    private Invoice invoice;


    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printTheInvoice(){}

}


