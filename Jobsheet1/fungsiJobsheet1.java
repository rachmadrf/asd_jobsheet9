public class fungsiJobsheet1 {

    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    
    public static void hitungPendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }
    
    public static void stokRoyalGarden4() {
        int[] pengurangan = {-1, -2, 0, -5};
        
        System.out.println("Stok RoyalGarden 4 setelah pengurangan:");
        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] += pengurangan[i];
            System.out.println("Jenis " + (i + 1) + ": " + stock[3][i]);
        }
    }
    
    public static void main(String[] args) {
        hitungPendapatan();
        System.out.println();
        stokRoyalGarden4();
    }
}