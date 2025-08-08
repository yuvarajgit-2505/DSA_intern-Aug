public class SellandBuy {
    public static void main(String[] args) {
        int[] arr={45, 12, 3, 10, 50};
         int buy=arr[0];
         int sell=arr[1];
         for(int i=1;i<arr.length;i++){
             if(arr[i]<buy){
                 buy=arr[i];
                 sell=arr[i];
             }
             if(arr[i]>sell){
                 sell=arr[i];
             }

         }
         if(sell<=buy){
             buy=arr[arr.length-2];
             sell=arr[arr.length-1];
         }
        System.out.println("Best time to Buy is "+buy+" And sell is "+sell);
    }
}
