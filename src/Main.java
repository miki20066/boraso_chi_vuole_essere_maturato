import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ApiClient client=new ApiClient();

    Scanner in=new Scanner(System.in);
        System.out.println("inserisci il numero di domande");
        int amount=in.nextInt();

        client.fetcQuestion(amount, "easy", "multiple");


        System.out.println(client.fetcQuestion(amount, "easy", "multiple"));

    }
}