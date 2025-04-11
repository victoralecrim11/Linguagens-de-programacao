<<<<<<< HEAD
/* 12. Crie uma função recursiva que encontre o menor elemento de um array de inteiros.*/

public class Ex12 {
    public static void main(String[] args) {
        // Código do exercício
        System.out.println("Exercício 12");

        System.out.println(menorNumeroVet(6, vet.length - 1));
    }

    public static int menorNumeroVet(int vet[], int posicao){
        if(posicao == 0){
            return vet[0]; // caso base: se a posição for 0, retorna 0
        }

        int valor = menorNumeroVet(vet, posicao - 1);
        if(vet[posicao] < valor){
            return vet[posicao];
        }
        else
            return valor;

    }
}
=======
public class Ex12 {
    public static void main(String[] args) {
        // Código do exercício
        System.out.println("Exercício 12");
    }
}
>>>>>>> ea52e1f148d61551f05f6f15a718ec827cc7d973
