package SprintFinalM2;

public class Administrativo extends Usuario {
    private String area;
    private String fechaContrato;

    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String fechaContrato) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.fechaContrato = fechaContrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area + ", Fecha de contrato: " + fechaContrato);
    }
}
