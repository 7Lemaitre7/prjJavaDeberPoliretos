public class Series_Numericas {
    private int numeroDeTerminos, primerNumero, segundoNumero;

    public Series_Numericas(int numeroDeTerminos){
        if ((numeroDeTerminos > 0)) {
            this.numeroDeTerminos = numeroDeTerminos;
            System.out.println("Numero aceptado, comenzando...");
        } else {
            this.numeroDeTerminos = 0;
            System.out.println("Numero no aceptado");
        }
    }

    public void controlSeries(int i) {
        if (i < numeroDeTerminos - 1) {
           System.out.print(", "); 
        } else {
            System.out.print(" ");
        }
    }

    public void serie01(){
        int secuencia = 0;
        primerNumero = 1;
        segundoNumero = 0;
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(secuencia + " ");
            secuencia = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = secuencia;
        } System.out.println();
    }
    
    public void serie02() {
        primerNumero = 1;
        segundoNumero = 0;
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(primerNumero);
            primerNumero = primerNumero + 2;
            if (i < numeroDeTerminos - 1) {
                System.out.print("  0  ");
            } else {
                System.out.print("");
            }
        } System.out.println();
    }

    public void serie03() {
        int numerador = 0;
        primerNumero = 1;
        segundoNumero = 0;
        int denominador = 1;
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            numerador = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = numerador;
            denominador = denominador + 2;
        } System.out.println();
    }

    public void serie04() {
        int numerador = 0;
        primerNumero = 1;
        segundoNumero = 0;
        int denominador = 2;
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            numerador = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = numerador;
            denominador = denominador + 2;
        } System.out.println();
    }

    public void serie05() {
        int secuencia = 2;
        primerNumero = 2;
        segundoNumero = 1;
        int patron = 1;
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(secuencia + " ");
            if (patron == 4) {
                patron = 2;
            }
            secuencia = secuencia + patron;
            patron = patron * 2;
        } System.out.println();
    }
}
