import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) throws Exception {
        String alumno = "Santiago.Pinta";
        String numCedula = "1752192086";
        System.out.println("Hola, yo soy " + alumno + " y mi cédula es " + numCedula);
        int numeroDeTerminos = 0;
        Scanner datosUsuario = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos: ");
        numeroDeTerminos = datosUsuario.nextInt();

        // Series Numericas
        Series_Numericas pinta = new Series_Numericas(numeroDeTerminos);

        pinta.serie01();
        pinta.serie02();
        pinta.serie03();
        pinta.serie04();
        pinta.serie05();
        // Series de Caracteres
        
        // Series de Figuras con Niveles
        
        // Series de Cadena de Caracteres
        
        // Series Extra Animadas
    
        datosUsuario.close();
    }
}
