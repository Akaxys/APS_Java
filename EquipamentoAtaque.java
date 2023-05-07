import java.util.*;

public class EquipamentoAtaque {

    private String nome;
    private int bonusAtaque;
    private Ataque ataque1;
    private Ataque ataque2;


    // Construtor
    public EquipamentoAtaque(String nome, int bonusAtk, Ataque atk1, Ataque atk2) {
        this.nome = nome;
        this.bonusAtaque = bonusAtk;
        this.ataque1 = atk1;
        this.ataque2 = atk2;
    }


        // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

        // Bonus de Ataque
    public int getBonusAtaque(){
        return bonusAtaque;
    }
    public void setBonusAtaque(int bonusAtk) {
        this.bonusAtaque = bonusAtk;
    }

        // Ataque adicional 1
    public Object getAtaque1(){
        return ataque1;
    }
    public void setAtaque1(Ataque atk1) {
        this.ataque1 = atk1;
    }

        // Ataque adicional 1
    public Object getAtaque2(){
        return ataque2;
    }
    public void setAtaque2(Ataque atk2) {
        this.ataque2 = atk2;
    }


    // Equipamentos de ATAQUES 
    public static EquipamentoAtaque pistolaLaser = new EquipamentoAtaque("Pistola A Laser", 10, Ataque.tiroConcentrado, Ataque.tiroAvancado);
    public static EquipamentoAtaque escopetaCanoSerrado = new EquipamentoAtaque("Escopeta de cano Serrado", 10, Ataque.rajada, Ataque.rajadaAvancado);
    public static EquipamentoAtaque adagaLaser = new EquipamentoAtaque("Adaga Laser", 10, Ataque.apunhalada, Ataque.apunhaladaAvancado);
    public static EquipamentoAtaque arcoFlecha = new EquipamentoAtaque("Arco e Flecha", 10, Ataque.flecha, Ataque.flechaMagica);
    public static EquipamentoAtaque bestaAutomatica = new EquipamentoAtaque("Besta Automática", 10, Ataque.flechaMagica, Ataque.flechaVenenosa);
    public static EquipamentoAtaque rifleChoque= new EquipamentoAtaque("Rlife de choque", 10, Ataque.tiroStun, Ataque.tiroConcentrado);
    public static EquipamentoAtaque espadaEnergia = new EquipamentoAtaque("Espada de energia", 10, Ataque.Investida, Ataque.impactoEletrico );
    public static EquipamentoAtaque granadasFragmentacao= new EquipamentoAtaque("Granadas de fragmentação", 10, Ataque.granada, Ataque.cozinharGranada);
    public static EquipamentoAtaque bastaoEletrico= new EquipamentoAtaque("Bastão Elétrico", 10, Ataque.Investida, Ataque.impactoEletrico);
    public static EquipamentoAtaque lancaDeGalio = new EquipamentoAtaque("Lança de Gálio", 10, Ataque.apunhalada, Ataque.arremessoLanca);
    public static EquipamentoAtaque espadaAncestralLendario= new EquipamentoAtaque("Espada Ancestral Lendária", 10, Ataque.ataqueAncestral, Ataque.fissuraAncestral);
    public static EquipamentoAtaque escopetaCelestialLendaria= new EquipamentoAtaque("Escopeta Celestial Lendária", 10, Ataque.tiroCelestial, Ataque.bombardeioCelestial);
    public static EquipamentoAtaque rifleDeVacuoLendario= new EquipamentoAtaque("Rifle de Vácuo Lendário", 10, Ataque.tiroVacuo, Ataque.gravidade30);
    public static EquipamentoAtaque marteloPrimordialLendario= new EquipamentoAtaque("Martelo Primordial Lendário", 10, Ataque.impactoPrimordial, Ataque.terremotoPrimordial);
    public static EquipamentoAtaque kusarigamaLendaria= new EquipamentoAtaque("Kusarigama Lendária", 10, Ataque.cortesOrientais, Ataque.rasgarTerreno);

    
    // ArrayList de todos os equipamentos de Ataque
    public static List<EquipamentoAtaque> EquipamentosAtaque = new ArrayList<>(Arrays.asList(pistolaLaser, escopetaCanoSerrado, adagaLaser, arcoFlecha,
    bestaAutomatica, rifleChoque, espadaEnergia, granadasFragmentacao, bastaoEletrico, lancaDeGalio, espadaAncestralLendario, escopetaCelestialLendaria,
    rifleDeVacuoLendario, marteloPrimordialLendario, kusarigamaLendaria));

    

}
