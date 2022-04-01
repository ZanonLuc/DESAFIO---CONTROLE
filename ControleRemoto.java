package POO.Encapsulamento;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    /* Construtor */

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    /* Métodos get e set */

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    /* Implementação dos métodos presentes na interface */

    @Override
    public void ligar() {
        this.setLigado ( true );
    }

    @Override
    public void desligar() {
        this.setLigado ( false );
    }

    @Override
    public void abrirMenu() {
        System.out.println ("----------MENU----------" );
        System.out.println ("Está ligado? "+ this.getLigado () );
        System.out.println ("Está tocando? "+ this.getTocando () );
        System.out.print ("Volume: "+ this.getVolume ());

        for ( int i = 0; i <= this.getVolume (); i += 10){
            System.out.print (" |");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println ("" );
        System.out.println ("Fechando menu... " );
    }

    @Override
    public void maisVolume() {
        if (this.getLigado ()){
            this.setVolume ( this.getVolume () + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado ()){
            this.setVolume ( this.getVolume () - 5);
        }else if (this.getVolume () < 0){
            System.out.println ("Volume mínimo alcançado." );
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado () && this.getVolume () > 0) {
            this.setVolume ( 0 );
        }
    }

    @Override
    public void desligarMudo() {
        if ( this.getLigado () && this.getVolume () == 0) {
            this.setVolume (50);
        }
    }

    @Override
    public void play() {
        if ( this.getLigado () && !(this.getTocando ())) {
            this.setTocando ( true );
        }else{
            System.out.println ("Não é possível reproduzir." );
        }
    }

    @Override
    public void pause() {
        if ( this.getLigado () && this.getTocando ()) {
            this.setTocando ( false );
        }else{
            System.out.println ("Não é possível pausar." );
        }
    }
}
