import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;
        String[][] results = new String[games][3];

        for (int i = 0; i < games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < games; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / games));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / games));
    }
}