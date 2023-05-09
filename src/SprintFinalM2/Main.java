package SprintFinalM2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        
        Cliente cliente = new Cliente("Juan Pérez", "12-05-1985", 12345678, "Modelo", 1);
        Profesional profesional = new Profesional("María Rodríguez", "23-06-1990", 23456789, "Ingeniera en Informática", "15-10-2015");
        Administrativo administrativo = new Administrativo("Pedro Sánchez", "30-11-1975", 34567890, "Finanzas", "02-01-2000");

        usuarios.add(cliente);
        usuarios.add(profesional);
        usuarios.add(administrativo);

        for (Usuario usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }
}
