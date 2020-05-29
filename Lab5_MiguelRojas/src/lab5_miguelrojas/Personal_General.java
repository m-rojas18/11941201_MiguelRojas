package lab5_miguelrojas;

public class Personal_General extends Persona{


    private String ocupacion;
    private String horario;
    private int tiempo_trabajado;
    private int sueldo;

    public Personal_General(String ocupacion, String horario, int tiempo_trabajado, int sueldo, String identificacion, String nombre_persona, int edad_persona, String sexo_persona, String estado_civil, double altura, int peso) {
        super(identificacion, nombre_persona, edad_persona, sexo_persona, estado_civil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo_trabajado = tiempo_trabajado;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo_trabajado() {
        return tiempo_trabajado;
    }

    public void setTiempo_trabajado(int tiempo_trabajado) {
        this.tiempo_trabajado = tiempo_trabajado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal_General{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempo_trabajado=" + tiempo_trabajado + ", sueldo=" + sueldo + '}';
    }
    
    
}
