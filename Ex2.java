public class Ex2 {

    public static int somarArray(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
   
        int resultado = somarArray(numeros);
        System.out.println("Soma: " + resultado);
    }
}