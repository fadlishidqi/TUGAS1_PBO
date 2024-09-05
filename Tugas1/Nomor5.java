public class Nomor5 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // Operasi logika OR
        boolean orResult = a || b;
        System.out.println("Hasil dari a OR b: " + orResult);

        // Operasi logika XOR
        boolean xorResult = a ^ b;
        System.out.println("Hasil dari a XOR b " + xorResult);

        // Operasi logika NOT
        boolean notResultA = !a;
        boolean notResultB = !b;
        System.out.println("Hasil dari NOT a: " + notResultA);
        System.out.println("Hasil dari NOT b: " + notResultB);
    }
}
