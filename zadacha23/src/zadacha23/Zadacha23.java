package zadacha23;
import java.util.Scanner;
public class Zadacha23 {
    static boolean sort(int[] arr_coi) {
        boolean sorted = false;
        for (int i = arr_coi.length-1 ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                if (arr_coi[j] < arr_coi[j+1]) {
                    int tmp = arr_coi[j];
                    arr_coi[j] = arr_coi[j+1];
                    arr_coi[j+1] = tmp;
                }
            }
        }
           return sorted = true; 
    }
    static void findcoincids(int[] arr_coi) {
        if (arr_coi[0] == 4) System.out.println("Impossible");
        if (arr_coi[0] == 3) System.out.println("Four of a Kind");
        if (arr_coi[0] == 2 && arr_coi[1] == 1) System.out.println("Full House");
        if (arr_coi[0] == 2 && arr_coi[1] == 0) System.out.println("Three of a Kind");
        if (arr_coi[0] == 1 && arr_coi[1] == 1) System.out.println("Two Pairs");
        if (arr_coi[0] == 1 && arr_coi[1] == 0) System.out.println("One Pair");
        if (arr_coi[0] == 0) System.out.println("Nothing");
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr_coi = {0, 0, 0, 0, 0};
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть 5 цілих чисел: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        int straight = 0;
        for (int i = 1; i < 5; i++) if (arr[i] == arr[i - 1] + 1) straight++;
        if (straight == 4) System.out.println("Straight");
        
        
        for (int j = 0; j < 4; j++) {
            if (arr[j] == 14) continue;
            for (int i = j + 1; i < 5; i++) {
                if (arr[i] == arr[j]) {
                arr_coi[j]++;
                arr[i] = 14;
            }
            arr[j] = 14;
        }
        sort(arr_coi);
        if (sort(arr_coi)) findcoincids(arr_coi);        
        }
    }
}    

