package grosirkosmetik;


public class GrosirKosmetik {

    public static int level;
    public static String username;
    
    public static void main(String[] args) {
        level = 0;
        username = null;
        Koneksi conn = new Koneksi();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
