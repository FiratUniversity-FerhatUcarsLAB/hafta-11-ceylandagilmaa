public class Exercise4_4 {                                  // Sınıf tanımı

    public static int getNumber() {                         // int döndüren metot
        return 42;                                          // 42 değerini döndürür
    }

    public static void sayHello() {                         // void metodu
        System.out.println("hello");                        // "hello" yazdırır
    }

    public static void main(String[] args) {                // Programın başlangıç noktası

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();                                        // Değer döner, fakat kullanılmadığı için ekrana bir şey yazılmaz

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);              // HATA! sayHello() void olduğu için + 7 ile kullanılamaz

        // Cevaplarinizi yorum olarak ekleyin.              // Öğrenciden cevap istenen bölüm
    }
}
