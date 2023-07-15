package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse w = new Warehouse();
        int size = StdIn.readInt();
        for(int i = 0; i < size; i++){
            String request = StdIn.readString();
            if(request.equals("purchase")){
                int day    = StdIn.readInt();
                int id     = StdIn.readInt();
                int amount = StdIn.readInt();
                w.purchaseProduct(id, day, amount);
            }else if(request.equals("add")){
                int    day    = StdIn.readInt();
                int    id     = StdIn.readInt();
                String name   = StdIn.readString();
                int    stock  = StdIn.readInt();
                int    demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            }else{
                StdOut.print("Error: bad request in line " + i);
            }
        }
        StdOut.println(w);
	// Use this file to test purchaseProduct
    }
}
