import java.util.Scanner;

public class app {      //versao 0.1

    //codigo simplificado sem utilização de POO ou conceitos avançados, apenas para fins didaticos 

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o nome da materia: ");
            String materia = in.next();
                                                                    // < pegar as notas e materia
        System.out.println("Insira as notas das unidades: ");
        System.out.print("Nota 1: ");
            double nota1 = in.nextDouble();
        System.out.print("Nota 2: ");
            double nota2 = in.nextDouble();
        System.out.print("Nota 3: ");
            double nota3 = in.nextDouble();
        System.out.println("");
        
        double media = media(nota1, nota2, nota3);
        boolean aprovado = aprovado(media);

        System.out.println("Materia: " + materia);
        System.out.printf(" Nota 1 Unidade: %.1f%n Nota 2 Unidade: %.1f%n Nota 3 Unidade: %.1f%n", nota1, nota2, nota3);
        System.out.printf("Media Geral: %.1f%n", media);
        System.out.println("Aprovado sem Final: " + aprovado);
        if(aprovado == false){
            double notaFinal = notaFinal(media);

            System.out.printf("Quantidade de pontos Necessarios na final: %.1f%n", notaFinal);
        }


        in.close();
    }

    //função calc media
    public static double media(double nota1, double nota2, double nota3){

        double media = (nota1 + nota2 + nota3)/3;
        return media;
    }

    //função confere se o aluno foi aprovado
    public static boolean aprovado(double media){
        
        boolean aprovado = false;
        if(media >= 21){
            aprovado = true;
        }
        return aprovado;
    }

    //função para calcular nota na prova final
    public static double notaFinal(double media){
        
        double provaFinal = (50 - 6 * media)/3;
        return provaFinal;
    }

    
}
