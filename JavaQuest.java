import java.util.*;


public class JavaQuest {

    static Personagem player;
    static Inimigo enemy;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tBem-Vindo(a) ao JavaQuest!");

        System.out.println("A última arvore corre perigo, se apresse para salva-la!");

        System.out.println("Digite o nome do seu personagem: ");
        String nome_player = scanner.nextLine();

        // ------------------------------------------------------------------------------ //
      
        player = new Personagem(nome_player);
        enemy = new Inimigo("Soldado", 0);

        // ------------------------------------------------------------------------------ //


        // ------------------------------------------------------------------------------ //

        // Personagem principal
       
        // ------------------------------------------------------------------------------ //







        // ------------------------------------------------------------------------------ //



        scanner.close();
    }

    public static Personagem getPlayer() {
        return player;
    }
    
}
