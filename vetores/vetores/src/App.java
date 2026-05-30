import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = inUser.nextLine();

        System.out.printf("o nome informado e: %s\n", nome);


        inUser.close();
    }
}
