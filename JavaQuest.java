import java.util.*;


public class JavaQuest {

    public static Personagem player;
    public static Inimigo enemy;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tBem-Vindo(a) ao JavaQuest!");
        System.out.println("A última arvore corre perigo, se apresse para salva-la!");
        System.out.println("Digite o nome do seu personagem: ");
        String nome_player = scanner.nextLine();

        // ------------------------------------------------------------------------------ //
      
        player = new Personagem(nome_player);
        player.setVida(30);
        player.setMana(30);
        player.setVigor(30);
        enemy = new Inimigo("Soldado", 30);

        // ------------------------------------------------------------------------------ //


        Combate.turnoAliado();


        scanner.close();

    }

}
