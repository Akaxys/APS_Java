import java.util.*;

public class Combate {

    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();
    static int i;
    static int opcaoPlayer;
    static int opcaoEnemy;
    static int probabilidadePlayer;
    static int probabilidadeEnemy;
    static ArrayList<Defesa> DefesasInimigos;
    static ArrayList<Defesa> DefesasPlayer;

    public static void turnoAliado(){

        DefesasInimigos = Defesa.getDefesasInimigos();
        
        System.out.println("Seu Turno");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        System.out.println("Seus Pontos de Vida: " + JavaQuest.player.getVida());
        System.out.println("Seus Pontos de Mana: " + JavaQuest.player.getMana());
        System.out.println("Pontos de vida do " + JavaQuest.enemy.getNome() + ": " + JavaQuest.enemy.getVida());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Qual ataque deseja usar?");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        for (i=0; i<Ataque.AtaquesPlayer.size(); i++) {
            System.out.println("[" + i + "] " + ((Ataque) Ataque.AtaquesPlayer.get(i)).getNome() + ": Causa " + ((Ataque) Ataque.AtaquesPlayer.get(i)).getDano() + " de dano no inimigo");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            
            System.out.println("Escolha entre [0 - " + (Ataque.AtaquesPlayer.size()-1) + "]");
            opcaoPlayer = teclado.nextInt();
            
            if ((opcaoPlayer >= 0) && (opcaoPlayer < Ataque.AtaquesPlayer.size())) {
                
                if (Ataque.AtaquesPlayer.get(opcaoPlayer).getCustoMana() <= JavaQuest.player.getMana()) {
                    break;
                }
                else {
                    System.out.println("Você não tem mana suficiente para usar esse ataque!");
                }

            }
            else {
                System.out.println("Opção Inválida!");
            }

        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Inimigo está escolhendo suas defesas...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        opcaoEnemy = aleatorio.nextInt(0,(Defesa.DefesasInimigos.size()-1));
        
        if (opcaoEnemy == Defesa.DefesasInimigos.indexOf(Defesa.esquiva)) {
            System.out.println("Funcionou");
        }
        











    }
    
}
