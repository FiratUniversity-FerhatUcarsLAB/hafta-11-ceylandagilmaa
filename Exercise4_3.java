public class Exercise4_3 {                         // Sınıf tanımı başlıyor

public static void zoop() {                        // zoop metodu
    baffle();                                      // baffle metodunu çağır
    System.out.print("You wugga ");                // "You wugga " yaz
    baffle();                                      // tekrar baffle metodunu çağır
}  

public static void main(String[] args) {           // main metodu (programın başlangıcı)
    System.out.print("No, I ");                    // "No, I " yaz
    zoop();                                        // zoop metodunu çağır
    System.out.print("I ");                        // "I " yaz
    baffle();                                      // baffle metodunu çağır
}  

public static void baffle() {                      // baffle metodu
    System.out.print("wug");                       // "wug" yaz
    ping();                                        // ping metodunu çağır
}  

public static void ping() {                        // ping metodu
    System.out.println(".");                       // "." yaz ve yeni satıra geç
}

}                                                   // Sınıf kapanışı
