
public class Inimigo {

    private String name;
    private int vida;
    private int bonusAtaque;
    private int bonusDefesa;
    private int dificuldade;


        // Construtor
    public Inimigo(String nome, int pv){
        this.name = nome;
        this.vida = pv;
    }

        // Nome
    public String getNome() {
        return name;
    }

        // Vida
    public int getVida() {
        return vida;
    }
    public void setVida(int pv){
        this.vida = pv;
    }

        // Bonus Ataque
    public int getbonusAtaque() {
        return bonusAtaque;
    }
    public void setbonusAtaque(int bonusAtaque) {
        this.bonusAtaque += bonusAtaque; 
    }

        // Bonus Defesa
    public int getbonusDefesa() {
        return bonusDefesa;
    }
    public void setbonusDefesa(int bonusDefesa) {
        this.bonusDefesa += bonusDefesa; 
    }

        // Dificuldade
    public int getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dif){
        this.dificuldade = dif;
    }
    

}
