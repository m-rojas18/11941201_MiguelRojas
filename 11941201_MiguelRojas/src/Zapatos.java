

import java.awt.Color;

public class Zapatos extends Objeto{
    
    
    private String talla;
    private String descripcion_suela;
    private int comodidad;

    public Zapatos(Color color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
    }

    public Zapatos(String talla, String descripcion_suela, int comodidad, Color color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.talla = talla;
        this.descripcion_suela = descripcion_suela;
        this.comodidad = comodidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescripcion_suela() {
        return descripcion_suela;
    }

    public void setDescripcion_suela(String descripcion_suela) {
        this.descripcion_suela = descripcion_suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", descripcion_suela=" + descripcion_suela + ", comodidad=" + comodidad + '}';
    }
    
    
    
    
    
    
}
