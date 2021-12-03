package hello;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------app start----------");

        final String secretKey = "secretKey";

        String originalString = "howtodoinjava.com";
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);

        System.out.println("----------app end----------");
    }
}
