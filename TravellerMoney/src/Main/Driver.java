package Main;
import Services.MergeSort;
import Services.NotesCounter;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        MergeSort MergeSorts = new MergeSort();
        NotesCounter NotesCount = new NotesCounter();
        System.out.println("Enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        MergeSorts.sort(notes, 0, notes.length - 1);
        NotesCount.NotesCounter(notes, amount);

    }

}