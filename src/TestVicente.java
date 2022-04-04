
public class TestVicente {
    private static int[] OrdenarArreglo(int arreglo[]){
        int aux;
       
        
       for(int i = 0; i < arreglo.length-1; i++){
        for(int j = 0;j < arreglo.length-1;j++){
          if(arreglo[j] > arreglo[j+1]){
            aux = arreglo[j+1];
            arreglo[j+1] = arreglo[j];
            arreglo[j] = aux;
          }   
        }
      }
    return arreglo;
    }
    
    /*
     *  Metodo que reciba un arreglo numerico e identifique si los numeros que la
     * componenestan ordenados de forma creciente, decreciente o esta desordenado.
    */
    private static String VerificarArreglo(int arreglo[]){
        boolean crec = true;
        boolean decre = true;
        String forma = "";
        
        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i] < arreglo[i+1]) {
                crec = false;
            }else if (arreglo[i] > arreglo[i+1]) {
                decre = false;
            }
        }
        if (crec && decre) {
            forma = "Todos los numeros son iguales.";
        }else if(crec == false && decre){
            forma = "El arreglo esta ordenado de forma creciente.";
        }else if (crec && decre == false) {
            forma = "El arreglo esta ordenado de forma decreciente.";
        } else {
            forma = "El arreglo esta desordenado.";
        }
        return forma;
    }
    
    
    /*
     *   Metodo que indique si un numero es perfecto, un numero es perfecto si
     * la suma de sus divisores(sin contarse el mismo numero) es le mismo numero
     * ej 6 es perfecto por que 3+2+1= 6.
    */
    
    private static void EsPerfecto(int numero){
        int aux = 0;
        if (numero %2 == 0) {
            for (int i = 1; i < numero; i++) {
                if (numero%i == 0) {
                    aux += i;
                }
            }
            if (numero == aux) {
                System.out.println(numero + " Es un numero perfecto");
            }else{
                System.out.println(numero + " No es perfecto");
            }
        }else{
            System.out.println(numero + " No es perfecto");
        }
    }
    
    /*
     *   Metodo que indique si una cadena es palindromo o no lo es(un palindromo
     * es la palabra que se lee igual de derecha aizquierda)
    */
    
    private static void EsPalindromo(String cadena){
        char array[] = cadena.toCharArray();
        char array1[] = new char [array.length];
        int aux = array.length-1;
        
        for (int i = 0; i < array.length; i++) {
            array1[aux] = array[i];
            aux--;
        }
        String cadena1 = String.valueOf(array1);
        System.out.println("");
        if (cadena.equalsIgnoreCase(cadena1)) {
            System.out.println(cadena + " Es palindromo.");
        }else{
            System.out.println(cadena + " No es palindromo.");
        }
    }
    
    public static void main(String[] args){
        int arreglo[] = {15,212,36,0,551,81,41,121,12315,0};
        int arreglo1[] = {0,0,0,0};
        
       OrdenarArreglo(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println(VerificarArreglo(arreglo1));
        System.out.println("");
        EsPerfecto(28);
        EsPerfecto(296);
        EsPerfecto(2980);
        EsPerfecto(8128);
        
        EsPalindromo("bienvenido");
        EsPalindromo("reconoCer");
        
    }
}
