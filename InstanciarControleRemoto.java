package POO.Encapsulamento;

public class InstanciarControleRemoto {
    public static void main(String[] args) {
        ControleRemoto cce = new ControleRemoto ();
        cce.ligar ();
        cce.play ();
        cce.maisVolume ();
        cce.abrirMenu ();
    }
}
