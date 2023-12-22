import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Emergency service app

        /*
        Patients will move to the front of the queue according to
        their complaints in the Emergency Department
        (Priority QUEUE)

        Appendicitis -> Highest Priority
        Burn -> Medium priority
        Headache -> Lowest priority
         */

        Queue<Patient> emergencyService = new PriorityQueue<Patient>();

        emergencyService.offer(new Patient("Murat", "Burn"));
        emergencyService.offer(new Patient("Okan", "Headache"));
        emergencyService.offer(new Patient("Elif", "Appendicitis"));
        emergencyService.offer(new Patient("Oguz", "Burn"));
        emergencyService.offer(new Patient("Merve", "Burn"));
        emergencyService.offer(new Patient("Gizem", "Appendicitis"));

        int i = 1;

        while (emergencyService.isEmpty() != true)
        {
            System.out.println("*********************************");
            System.out.println("Row number : " + i);
            System.out.println(emergencyService.poll());
            System.out.println("*********************************");
            i++;
        }
    }
}