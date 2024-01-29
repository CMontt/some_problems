public class Main {
    public static void main(String[] args) {
        int problema1 = somarMultiplos();
        long problema2 = somarFibonacciImpar();

        System.out.println(problema1);
        System.out.println(problema2);
    }

    private static int somarMultiplos() {
        int soma = 0;
        int limite = 100;

        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        return soma;
    }

    private static long somarFibonacciPar() {
        int fib1 = 1;
        int fib2 = 2;
        int limite = 4000000;
        long soma = 0;

        while(fib2 <= limite){
            if(fib2 % 2 == 0){
                soma += fib2;
            }

            int fibProx = fib2 + fib1;
            fib1 = fib2;
            fib2 = fibProx;
        }

        return soma;
    }
}
