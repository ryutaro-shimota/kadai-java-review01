
public class Review01 {

    public static void main(String[] args) {
        
        int price = 1500;
        int taxRate = 10;
        int total;
        total = tax(price, taxRate);
        System.out.println(price + "円の商品の税込み価格は" + total + "円（消費税は" + (price * taxRate /100 ) + "円)です。");
        
    }
    
    public static int tax(int price, int taxRate) {
        int total = price + price * taxRate / 100;
        return total;
        
    }


}
