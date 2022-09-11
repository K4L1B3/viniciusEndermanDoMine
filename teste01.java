/*
 * 
 1°) Faça um algoritmo que contenha 3 vetores, o primeiro deve ser um vetor com 30 posições, onde irá conter números inteiros aleatórios. 
 Após isso, separe esse vector em mais dois novos vetores onde no primeiro vector deve conter apenas os números pares e outro para números ímpares. Lembrando, você não deve alocar os valores manualmente, utilize um laço for ou while.
 */



/**
 * teste01
 */
public class teste01 {

    public static void main(String[] args) {

      
        int[] randomNums = new int[30];
        int[] parNums = new int[30];
        int[] impNums = new int[30];
        
        for (int i = 0; i < randomNums.length; i++) {

            randomNums[i] = (int) (Math.random() * 10);
            
            if (i % 2 == 0)
                parNums[i] = i;
            else
                impNums[i] = i;
      
        }
        
        
        System.out.println("Numeros randomicos: ");

        for (int i : randomNums) {

            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Numeros pares: ");
        for (int i : parNums) {

            System.out.println(i);
        }

        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Numeros impares: ");
        for (int i : impNums) {
            
            System.out.println(i);
        }

    }

}