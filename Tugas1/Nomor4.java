public class Nomor4 {

    public static void main(String[] args) {

        String nama = "Fadli Shidqi Firdaus";

        String replacedNama = nama.replace('a', 'o');
        System.out.println("Replace: " + replacedNama);

        String replacedAllNama = nama.replaceAll(".", "a");
        System.out.println("ReplaceAll: " + replacedAllNama);

        String lowerCaseNama = nama.toLowerCase();
        System.out.println("Nama huruf kecil: " + lowerCaseNama);

        String upperCaseNama = nama.toUpperCase();
        System.out.println("Nama huruf besar: " + upperCaseNama);
    }
}
