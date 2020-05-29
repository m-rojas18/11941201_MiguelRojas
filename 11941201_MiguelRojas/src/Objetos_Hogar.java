

import java.awt.Color;

public class Objetos_Hogar extends Objeto{


    private String descripcion_lugar;
    private String instrucciones;
    private int tiempo_garantia;

    public Objetos_Hogar(Color color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
    }

    public Objetos_Hogar(String descripcion_lugar, String instrucciones, int tiempo_garantia, Color color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        super(color, descripcion, marca, tamano, calidad, persona_ingreso);
        this.descripcion_lugar = descripcion_lugar;
        this.instrucciones = instrucciones;
        this.tiempo_garantia = tiempo_garantia;
    }

    public String getDescripcion_lugar() {
        return descripcion_lugar;
    }

    public void setDescripcion_lugar(String descripcion_lugar) {
        this.descripcion_lugar = descripcion_lugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getTiempo_garantia() {
        return tiempo_garantia;
    }

    public void setTiempo_garantia(int tiempo_garantia) {
        this.tiempo_garantia = tiempo_garantia;
    }

    @Override
    public String toString() {
        return "Objetos_Hogar{" + "descripcion_lugar=" + descripcion_lugar + ", instrucciones=" + instrucciones + ", tiempo_garantia=" + tiempo_garantia + '}';
    }
    
    
}
