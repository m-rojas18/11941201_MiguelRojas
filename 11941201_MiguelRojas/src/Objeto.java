

import java.awt.Color;

public class Objeto {


    private Color color;
    private String descripcion;
    private String marca;
    private String tamano;
    private String calidad;
    private Persona persona_ingreso;

    public Objeto(Color color, String descripcion, String marca, String tamano, String calidad, Persona persona_ingreso) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.persona_ingreso = persona_ingreso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersona_ingreso() {
        return persona_ingreso;
    }

    public void setPersona_ingreso(Persona persona_ingreso) {
        this.persona_ingreso = persona_ingreso;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tamano=" + tamano + ", calidad=" + calidad + ", persona_ingreso=" + persona_ingreso + '}';
    }
    
    
    
}
