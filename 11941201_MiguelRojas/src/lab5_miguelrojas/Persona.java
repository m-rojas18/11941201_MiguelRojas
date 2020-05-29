package lab5_miguelrojas;

import java.util.ArrayList;

public class Persona {


    private String identificacion;
    private String nombre_persona;
    private int edad_persona;
    private String sexo_persona;
    private String estado_civil;
    private double altura;
    private int peso;
    private ArrayList<Mensaje> lista_mensajes = new ArrayList();
    
    public Persona(){
        
    }

    public Persona(String identificacion, String nombre_persona, int edad_persona, String sexo_persona, String estado_civil, double altura, int peso) {
        this.identificacion = identificacion;
        this.nombre_persona = nombre_persona;
        this.edad_persona = edad_persona;
        this.sexo_persona = sexo_persona;
        this.estado_civil = estado_civil;
        this.altura = altura;
        this.peso = peso;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public int getEdad_persona() {
        return edad_persona;
    }

    public void setEdad_persona(int edad_persona) {
        this.edad_persona = edad_persona;
    }

    public String getSexo_persona() {
        return sexo_persona;
    }

    public void setSexo_persona(String sexo_persona) {
        this.sexo_persona = sexo_persona;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Mensaje> getLista_mensajes() {
        return lista_mensajes;
    }

    public void setLista_mensajes(ArrayList<Mensaje> lista_mensajes) {
        this.lista_mensajes = lista_mensajes;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre_persona=" + nombre_persona + ", edad_persona=" + edad_persona + ", sexo_persona=" + sexo_persona + ", estado_civil=" + estado_civil + ", altura=" + altura + ", peso=" + peso + ", lista_mensajes=" + lista_mensajes + '}';
    }
    
    
}
