import java.util.Scanner;
public class Laprak01 {
    
}
public static void main(String[] args){
        Scanner input = new Scanner (System.in);

int x, y;
int penjumlahan, pengurangan, perkalian;
double pembagian;
System.out.print("Masukkan operator pertama: ");
x = input.nextInt();
System.out.print("Masukkan operator kedua: ");
y = input.nextInt();

//Hitungan
penjumlahan = x + y;
pengurangan = x - y;
perkalian   = x * y;
pembagian   =  (double) x / y;

System.out.println("Hasil penjumlahan: " + penjumlahan);
System.out.println("Hasil pengurangan: " + pengurangan);
System.out.println("Hasil perkalian  : " + perkalian);
System.out.println("Hasil pembagian  : " + pembagian);
}

