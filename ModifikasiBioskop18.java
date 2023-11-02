public class ModifikasiBioskop18 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println("Jumlah baris: " + penonton.length);
        System.out.println("Panjang baris: " + penonton[0].length);

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        System.out.println("Penonton pada baris ke-3:");
        for (String penontonBaris3 : penonton[2]) {
            System.out.println(penontonBaris3);
        }
         System.out.println("Data seluruh array:");
         for (String[] baris : penonton) {
             for (String data : baris) {
                 System.out.print(data + " ");
             }
             System.out.println(); 
            }
        }
 }