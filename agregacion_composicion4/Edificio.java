package agregacion_composicion4;
public class Edificio {

    private String nombre;
    private double superficie;
    private Departamento[] deps = new Departamento[100];
    private int cantDep = 0;
    private Parqueo parqueo;

    public Edificio(String nombre, double superficie) {
        this.nombre = nombre;
        this.superficie = superficie;
    }

    public void agregarDepartamento(Departamento d) {
        deps[cantDep++] = d;
    }

    public void setParqueo(Parqueo p) {
        this.parqueo = p;
    }

    public Departamento[] getDepartamentos() {
        return deps;
    }

    public Parqueo getParqueo() {
        return parqueo;
    }
}
