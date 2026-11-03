import java.util.Scanner;
public class StudiKasus15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000, jumlahCup, uangBayar;
        int totalHarga, diskon  =0, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Uang yang dibayar: ");
        uangBayar = sc.nextInt(); 

        totalHarga = jumlahCup * hargaPerCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }else{
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Discount: " + diskon);
        System.out.println("Total price: " + totalHarga);
        System.out.println("Total to pay: " + totalBayar); 
        
        if (totalHarga >= totalBayar) {
            kembalian = totalHarga - totalBayar;
            System.out.println("Here's your change, boss: " + kembalian);            
        } else {
            kurang = totalBayar - totalHarga;
            System.out.println("Your money isn't enough, mate: " + kurang);
        }
        sc.close();

    }
}