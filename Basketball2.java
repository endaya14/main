
import java.util.*;
public class Basketball2 {

    public static void main(String[] args) throws java.io.IOException {
        Scanner scanInput = new Scanner(System.in);
        String sHomeTeam;
        String sAwayTeam;
        int iNumGames;
        int iGamesLeft = 0;

        System.out.println("Enter home team's name: ");
        sHomeTeam = scanInput.nextLine();
        System.out.println(sHomeTeam);

        System.out
                .println("How many games are in the home team's basketball season?");
        iNumGames = scanInput.nextInt();
        System.out.println(iNumGames);

        // start looping
        do {
            System.out.println("Enter opponent team's name: ");
            scanInput = new Scanner(System.in);
            sAwayTeam = scanInput.nextLine();
            if(!"".equals(sAwayTeam.trim()) && !"exit".equals(sAwayTeam.trim()))
            {

                System.out.println(sAwayTeam);
                iGamesLeft = --iNumGames;
                System.out.println("There are " + iGamesLeft+ " games left in the basketball season");

            }

        }// end do
        while (iGamesLeft > 0 && !"exit".equalsIgnoreCase(sAwayTeam));
    }
}