package counter;

import java.util.Scanner;

/**
 * Test the observer-Observavle behavior for Counter object.
 * @author Thanapoom Rattanathumawat
 */
public class ObserverTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 1. Create the subject (Observable)
        Counter counter = new Counter();
        // 2. Create the observer with reference to subject
        ConsoleView view = new ConsoleView(counter);
        // 3. Add observer to subject
        counter.addObserver(view);
        // 4. Run the app.
        while(true){
            System.out.print("how much? ");
            int howmuch = console.nextInt();
            counter.add(howmuch);
        }
    }
}
