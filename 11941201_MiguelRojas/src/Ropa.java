

import java.awt.Color;

public class Ropa extends Objeto{

    
    private String talla;
    private String tipo_tela;
    private String pais_elaborado;

    public Ropa(String talla, String tipo_tela, String pais_elaborado, String color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.talla = talla;
        this.tipo_tela = tipo_tela;
        this.pais_elaborado = pais_elaborado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo_tela() {
        return tipo_tela;
    }

    public void setTipo_tela(String tipo_tela) {
        this.tipo_tela = tipo_tela;
    }

    public String getPais_elaborado() {
        return pais_elaborado;
    }

    public void setPais_elaborado(String pais_elaborado) {
        this.pais_elaborado = pais_elaborado;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipo_tela=" + tipo_tela + ", pais_elaborado=" + pais_elaborado + '}';
    }
    
    
    
}
