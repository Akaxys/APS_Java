import java.util.*;


public class JavaQuest {

    public static Personagem player;
    public static Inimigo enemy;
    static private int easyOrHard;


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\tBem-Vindo(a) ao JavaQuest!");
        System.out.println("A última arvore corre perigo, se apresse para salva-la!");

        System.out.println("Digite o nome do seu personagem: ");
        String nome_player = scanner.nextLine();
        
        System.out.println("Deseja jogar em qual dificuldade?\n[1] Fácil\n[2] Médio\n[3] Dificil\n[4] Insano");
        easyOrHard = scanner.nextInt();


        player = new Personagem(nome_player);
        Inimigo inimigo1 = new Inimigo("Soldado", 1, easyOrHard);
        Inimigo inimigo2 = new Inimigo("Sargento", 2, easyOrHard);
        Inimigo inimigo3 = new Inimigo("Tenente", 4, easyOrHard);
        Inimigo inimigo4 = new Inimigo("Major", 6, easyOrHard);
        Inimigo inimigo5 = new Inimigo("General", 12, easyOrHard);
    
        player.setVida(30);
        player.setMana(30);
        player.setVigor(30);
       
        // ------------------------------------------------------------------------------ //

        enemy = inimigo1;
        enemy.setVida(30);
        Ataque.adicionarAtaquesInimigos(Ataque.soco, Ataque.chute, Ataque.rasteira, Ataque.tiro);
        Combate.Batalha(1,30,30);


        enemy = inimigo2;
        enemy.setVida(50);
        Ataque.adicionarAtaquesInimigos(Ataque.flecha, Ataque.tiro, Ataque.apunhalada, Ataque.chute);
        Defesa.adicionarDefesasInimigos(Defesa.armaduraAvancada, Defesa.defesaBasica, Defesa.esquiva, Defesa.barreiraAvancada);
        Combate.Batalha(1,50,50);


        enemy = inimigo3;
        enemy.setVida(90);
        Ataque.adicionarAtaquesInimigos(Ataque.tiro, Ataque.tiroAvancado, Ataque.flechaMagica, Ataque.flecha);
        Defesa.adicionarDefesasInimigos(Defesa.defesaMagica, Defesa.defesaRapidaAvancada, Defesa.esquiva, Defesa.juggernaut);        
        Combate.Batalha(1,75,75);


        enemy = inimigo4;
        enemy.setVida(150);
        Ataque.adicionarAtaquesInimigos(Ataque.apunhalada, Ataque.apunhaladaAvancado, Ataque.rajada, Ataque.rajadaAvancado);
        Defesa.adicionarDefesasInimigos(Defesa.armaduraAvancada, Defesa.defesaBasica, Defesa.esquiva, Defesa.barreiraAvancada);
        Combate.Batalha(1,100,100);

        
        enemy = inimigo5;
        enemy.setVida(300);
        Ataque.adicionarAtaquesInimigos(Ataque.ataqueAncestral, Ataque.tiroVacuo, Ataque.cortesOrientais, Ataque.impactoPrimordial,Ataque.tiroCelestial, Ataque.fissuraAncestral);
        Defesa.adicionarDefesasInimigos(Defesa.kryptoDefesa, Defesa.auraCosmica, Defesa.esquiva, Defesa.netherite);
        Combate.Batalha(2,150,150);


















        
        scanner.close();

    }

}
