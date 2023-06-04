package modelo;

public class Administrador {
    private String nombre;
    private int codigo;
    private int nip;
    private String titulo;
    private String departamento;
    private String correo;
    private Materia materias;
    private String centroUniversitario;    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }

    public String getCentroUniversitario() {
        return centroUniversitario;
    }

    public void setCentroUniversitario(String centroUniversitario) {
        this.centroUniversitario = centroUniversitario;
    }
}
