package gun2_2.sayi_bulma;

public class Main {
    public static void main(String[] args) {


        System.out.printf("Hello and welcomedd!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir.");
        }


    }

}
