import java.util.Scanner;

/*
 * 2°) Crie um algoritmo que será responsável por calcular o índice de gordura corporal. 
 Na situação do sexo masculino deverá conter os seguintes fluxos: 
 menor do que 11% = Atleta,
 entre 11% e 13% = bom,
 entre 14% e 20% = normal,
 entre 21% a 23% = elevado,
 acima de 23% = alto
 
 Na situação do sexo feminino:
 menor do que 16%= Atleta,
 entre 16% e 19% = bom,
 entre 20% e 28% = normal,
 entre 29% a 31% = elevado,
 acima de 31% = alto

 IMC = (p/h^2) * 100

 */

public class teste02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");

        double h = sc.nextDouble();

        System.out.println("Digite o seu peso: ");

        double p = sc.nextDouble();

        double potencia = Math.pow(h, 2);

        double IMC = (p / (h * potencia)) * 100;

        System.out.println("Digite o seu sexo 1 para masculino e 2 para feminino");

        int sexo = sc.nextInt();

        switch (sexo) {
            case (1):
                        /*
                        *  menor do que 11% = Atleta,
            entre 11% e 13% = bom,
            entre 14% e 20% = normal,
            entre 21% a 23% = elevado,
            acima de 23% = alto
             */
                if(IMC >= 11 && IMC <=13 ) {

                    System.out.println("bom");
                    
                }
                if(IMC >= 14 && IMC <=20) {
                    
                    System.out.println("normal");
                }
                if(IMC >= 21 && IMC <=23) {
                    
                    System.out.println("elevado");
                }
                if(IMC > 23) {

                    System.out.println("alto");

                }
                
                
                
                break;
                
                case (2):
                /*
                 *  Na situação do sexo feminino:
                menor do que 16%= Atleta,
                entre 16% e 19% = bom,
                entre 20% e 28% = normal,
                entre 29% a 31% = elevado,
                acima de 31% = alto
                                */

                if(IMC < 16 ) {
                    
                    System.out.println("Atleta");
                    
                }
                if(IMC <= 19 && IMC >= 16) {
                    
                    System.out.println("bom");
                    
                }
                
                if(IMC <= 31  && IMC >= 29) {
                    
                    System.out.println("normal");
                    
                }
                if( IMC > 31) {
                    
                    System.out.println("Elevado");
                    
                }
                
                break;


            default:
                System.out.println("Por favor digite apenas 1 ou 2");
                break;
        }



    }
}
