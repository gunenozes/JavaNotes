/*
  1:-2147483648 sayısının mutlak değeri negatif çıkmaktadır çünkü 2147483648 32 bitlik sayı sisteminin dışında kalmaktadır,32 bitlik sayı sistemi sadece -2147483648 ile +2147483647 arasındaki değerleri temsil edebilir. Bu nedenle sonuç 2147483648 olduğunda değer -2147483648e kayar
  2:a)API'nin açılımı olan Application Programming Interface, Uygulama Programlama Arabirimi anlamına gelir.API'ler, iki yazılım bileşeninin belirli tanımlar ve protokoller aracılığıyla birbiriyle iletişim kurmasına olanak tanıyan mekanizmalardır.
    b)Kütüphane, bilgisayar programları tarafından yazılım geliştirme amaçlı kullanılan kalıcı kaynakların tümüdür.
    c)Maven Java paltformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracidir
   3:Debug, bir yazılımın hatasını bulma ve düzeltme sürecidir. Yazılım hataları genellikle yazılımın beklenmeyen şekilde davranmasına ve yanlış sonuçlar vermesine neden olur. Debug işlemi, hatanın nedenini belirlemek ve yazılım kodunu düzenlemek için kullanılır.

 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class JavaOdev2 {

    public static void main(String[] args)
    {
        
        for(int i=0;i < 10;i++){
            System.out.println("Merhaba");
        }
    
    }

}
//4)
class hesapmakinesi{
   public static void main(String[] args){
//Ilk sayiyi iste
String sayi1 = JOptionPane.showInputDialog("Ilk sayiyi giriniz");
double say1 = Double.parseDouble(sayi1);
//Ikinci sayiyi iste
String sayi2 = JOptionPane.showInputDialog("Ikinci sayiyi giriniz");
double say2 = Double.parseDouble(sayi2);
//Islem secimi
 String[] islemler = {"Toplama","Cikarma","Bolme","Carpma"};
 int islem = JOptionPane.showOptionDialog(null, "Hangi işlemi yapmak istersiniz?", "İşlem Seçimi", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, islemler, islemler[0]);
 double sonuc = 0.0;
   //Islemler switch ile ayrilir ve secime gore kullanilir
   switch (islem){
     case 0:
     sonuc = say1 + say2;
     break;
      case 1:
     sonuc = say1 - say2;
     break;
      case 2:
      if(say2 != 0){
        sonuc = say1/say2;
        
      }else{
        //0 a bolum durumunda olusan tanimsiz durumun belirtilmesi
        JOptionPane.showMessageDialog(null, "Tanimsiz");
         System.exit(0);
      }
      break;
      case 3:
      sonuc = say1*say2;
      break;

   }
   //Sonuc ekrana verilir
   JOptionPane.showMessageDialog(null, "Sonuç: " + sonuc);
}
}
//5)
class Siralama {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        //Siralancak tam sayilar alinir
        System.out.println("Uc tam sayi giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //If else yapisi kullanilarak siraya sokulup ekrana verilir.
        if(a<b && b< c){System.out.println(a + " < " + b + " < " + c);} 
        else if (a<c && c<b){System.out.println(a + " < " + c + " < " + b);}
        else if(b<a && a<c){System.out.println(b + " < " + a + " < " + c);}
        else if (b<c && c<a){System.out.println(b + " < " + c + " < " + a);}
        else if(c<a && a<b){System.out.println(c + " < " + a + " < " + b);}
        else if (c<b && b<a){System.out.println(c + " < " + b + " < " + a);}
        else if (a==c && c==b){System.out.println(a + " = " + b + " = " + c);}
        else if(a==b && a<c){System.out.println(a + " = " + b + " < " + c);}
        else if (c<a && a==b){System.out.println(c + " < " + b + " = " + a);}
        else if(a==c && a<b){System.out.println(a + " = " + c + " < " + b);}
        else if(b<a && a==c){System.out.println(c + " = " + a + " = " + b);}
        else if(b==c && b<a){System.out.println(b + " = " + c + " < " + a);}
        else if(a<b && b==c){System.out.println(a + " = " + b + " = " + c);}

       

        scanner.close();
    }
}
//6
class Ortanca {
    public static void main(String[] args) {
        System.out.println("Uc tam sayi giriniz: ");
         Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result = mid(num1, num2, num3);
        System.out.println("Verilen sayilarin ortancasi: " + result);
       scanner.close();
    }

    public static int mid(int a, int b, int c) {
        // Verilen üç sayıyı sıralayarak ortanca sayıyı belirle
        int[] numbers = {a, b, c};
        java.util.Arrays.sort(numbers);
        return numbers[1];
    }
}
//7
class Negativity {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("tam sayi giriniz: ");
         int num = scanner.nextInt();
        
     if (num > 0) {
            System.out.println("Sonuç: 1 ");
        } else if (num < 0) {
            System.out.println("Sonuç: -1 ");
        } else {
            System.out.println("Sonuç: 0 ");
        }
     scanner.close();
    }
   
    }
    //8
class Sekil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyutu giriniz: ");
        int n = scanner.nextInt();
        // Seklin ust tarafi
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Seklin alt tarafi
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
//9
 class Asal {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("tam sayi giriniz: ");
         int number = scanner.nextInt();
        System.out.println("Sayinin asal carpanlari:");
       // Asal carpanlari bulma
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
      
        }
        scanner.close();
    }

    
}
class Sekil2{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Kalinlik giriniz: ");
         int width = scanner.nextInt();
         System.out.println("Yukseklik giriniz: ");
         int height = scanner.nextInt();
 for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                if (j == i%width) {
                    System.out.print("*");
                }
                if (j==width)
                 System.out.print("|");
                  else{
                System.out.print(" ");
                 }
            }
            System.out.println();
        }
        scanner.close();
}
}