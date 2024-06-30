import java.util.*;
public class LoopingScannerString {
    public static void main(String[] args) {
        int count;
        String subjectName;
        System.out.println("Please enter number of subjects");
        Scanner subjectCount = new Scanner(System.in);
        count = subjectCount.nextInt();
        String subs[] = new String[count];
        System.out.println("Please enter subject name ");
        for (int i = 0; i < subs.length;i++){
            Scanner subject = new Scanner(System.in);
            System.out.print("Subject : ");
            subjectName = subject.nextLine();
            subs[i] = subjectName;
        }
        
    }
}
