package ejercicio_02;

public class Empleado {

    private String nombre;
    private String cargo;
    private Double salario;
    private Integer id;

    public Empleado(){}
    public Empleado(String nombre, String cargo, Double salario, Integer id) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double setAumento(int aumento){
         if (this.salario*aumento/100 > 0) {
             return this.salario += (this.salario * aumento / 100);
         }else {
             System.out.println("Ingrese una cantidad positiva");
         }
         return  this.salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ejercicio_02.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
