package concentrese;

public class Carta {
    private String etiqueta;
    private String palo;
    private boolean estaDestapada;
    
    public Carta(String etiqueta, String palo){
        this.etiqueta=etiqueta;
        this.palo=palo;
    }
    
    public boolean estaDestapada(){
        return estaDestapada;
    }
    
    public void destapar(){
        estaDestapada=true;
    }
    
    public void tapar(){
        estaDestapada=false;
    }
    
    public String darPalo(){
        return palo;
    }
    
    public String darEtiqueta(){
        return etiqueta;
    }
    
    public Carta darCopia(){
        return new Carta(this.etiqueta, this.palo);
    }
    @Override
    public String toString(){
        return etiqueta+palo;
    }
    
}
