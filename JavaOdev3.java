


/* 
1)
Syntax hataları:Syntax error yani söz dizilimi hataları, geliştirilen programda, kullanılan programlama dilinin kurallarına aykırı bazı ifadelerin yer almasından dolayı ortaya çıkan, genelde yazılımcı tarafından yapılan hatalardır. Söz dizilimi hataları tespit edilip çözülene kadar derlenemez ve program çalışmaz.
Runtime hataları:Runtime error, yani çalışma zamanı hataları, programın düzgün çalışmasını engelleyen bir yazılım veya donanım hatası olduğunu belirten hata türleridir. Olmayan bir dosyanın açılması sırasında veya olmayan bir dosyanın üzerine veri yazmaya çalışıldığı zaman ya da işletim sisteminin yapamayacağı şeylerin istenmesi durumunda çalışma zamanı hatalarıyla karşılaşmak mümkündür.
Mantık hataları:Programın yanlış çalışmasına neden olan, istenmeyen çıktılar üreten veya beklenmedik sorunlara neden olan genelde yazılımcı tarafından yapılan hata türleridir. Mantıksal hataları tespit etmek zor ve uğraştırıcı bir süreçtir.
Derleme hataları:Bazı programlama dilleri bir derleme adımı gerektirir. Derleme, yüksek seviyeli programlama dilinizin bilgisayarın anlayabileceği daha düşük seviyeli bir dile dönüştürülmesine denir. Derleme veya derleme zamanı hatası, derleyici kodunuzu alt seviye dile nasıl dönüştüreceğini bilmediğinde meydana gelir.
*/

import java.util.Random;
import javax.swing.JOptionPane;
import java.lang.Math; 
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


//2
 class DiceRoller {

    public static void main(String[] args) {

        Map<Integer, String> imageMap = new HashMap<>();
        imageMap.put(1, "DiceFaces/1.png");
        imageMap.put(2, "DiceFaces/2.png");
        imageMap.put(3, "DiceFaces/3.png");
        imageMap.put(4, "DiceFaces/4.png");
        imageMap.put(5, "DiceFaces/5.png");
        imageMap.put(6, "DiceFaces/6.png");
        // Yeni rasgele sayi olusturucu olustur
        Random dice = new Random();

        // 1 ile 6 arasinda rasgele sayi olustur
        int diceRoll = dice.nextInt(6) + 1;
        int diceRoll2 = dice.nextInt(6) + 1;
        // Zarin sonucu yaz
        System.out.println("Zar 1'in sonucu: " + diceRoll);
        System.out.println("Zar 2'in sonucu: " + diceRoll2);

        String diceRoll1FilePath = imageMap.get(diceRoll);
        String diceRoll2FilePath = imageMap.get(diceRoll2);

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        BufferedImage image1 = null;
        BufferedImage image2 = null;
        try {
            image1 = javax.imageio.ImageIO.read(new File(diceRoll1FilePath));
            image2 = javax.imageio.ImageIO.read(new File(diceRoll2FilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        final BufferedImage imgLast1 = image1;
        final BufferedImage imgLast2 = image2;

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imgLast1, 0, 0, this);
                g.drawImage(imgLast2, 400, 0, this);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}


//3
  class Tahmin{
public static void  tahmin(String[] args){
 Random gameNumber = new Random();
  //while yapisi icin boolean veri olustur
 boolean guessedCorrectly = false;
  //Rasgele sayi olustur
int numberGenerate = gameNumber.nextInt(100)+1;

  JOptionPane.showMessageDialog(null, "Tahmin oyununa hosgeldiniz!");
 
        while (!guessedCorrectly){
             try {
                //Tahmin girisi al
                String guessString = JOptionPane.showInputDialog("Tahmin giriniz:");
                
                if (guessString == null) {
                    break;
                }
                    int guess = Integer.parseInt(guessString);
                
                    if (guess < 1 || guess > 100) {
                    JOptionPane.showMessageDialog(null, "Lutfen 1 ile 100 arasinda bir sayi giriniz.");}
                    else if (guess == numberGenerate){
                         guessedCorrectly = true;
                    JOptionPane.showMessageDialog(null, "Tebrikler dogru sayi tahmin ettiniz sayi: " + numberGenerate );
                    }
                    else{
                           JOptionPane.showMessageDialog(null, "Lutfen tekrar deneyin");
                    }
             }
              catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Lutfen gecerli bir integer giriniz.");
            }
        }
    }
}
//5
class isPrime{
public static boolean isPrime(int val) {
    if (val < 2)
        return false;

    for (int i = 2, max = (int)Math.sqrt(val); i <= max; i++)
        if (val % i == 0)
            return false;

    return true;
}
}
