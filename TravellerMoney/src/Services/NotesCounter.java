package Services;

public class NotesCounter {

    public void NotesCounter(int[] note, int amount) {
        int NoteCounter[] = new int[note.length];
        try {
            for (int i = 0; i < note.length; i++) {
                if (amount >= note[i]) {
                    NoteCounter[i] = amount / note[i];
                    amount = amount - NoteCounter[i] * note[i];
                }
            }
            if (amount > 0) {
                System.out.println("Exact amount cannot be given with the highest denomination");
            } else {
                System.out.println("Your payment to give minimum number of notes will be");
                for (int i = 0; i < note.length; i++) {
                    if (NoteCounter[i] != 0) {
                        System.out.println(note[i] + ":" + NoteCounter[i]);
                    }
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e + "invalid");

        }
    }
}
