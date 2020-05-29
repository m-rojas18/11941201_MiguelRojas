package lab5_miguelrojas;

public class Gerente extends Persona{

    private String usuario;
    private String password;
    private String cargo;

    public Gerente(String usuario, String password, String cargo, String identificacion, String nombre_persona, int edad_persona, String sexo_persona, String estado_civil, double altura, int peso) {
        super(identificacion, nombre_persona, edad_persona, sexo_persona, estado_civil, altura, peso);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", password=" + password + ", cargo=" + cargo + '}';
    }
    
    
}
