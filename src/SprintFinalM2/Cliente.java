package SprintFinalM2;

public class Cliente extends Usuario {
    private String afp;
    private int sistemaSalud;

    public Cliente(String nombre, String fechaNacimiento, int run, String afp, int sistemaSalud) {
        super(nombre, fechaNacimiento, run);
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("AFP: " + afp + ", Sistema de salud: " + (sistemaSalud == 1 ? "Fonasa" : "Isapre"));
    }
}

