package condicional;


//        3 notas
//        fazer media
//        se media > 7 aprovada
//        senão reprovada
//        comparar qual é maior nota entre as 3

public class ComandoIf {
    public static void main(String[] args) {

        double nota1 = 5;
        double nota2 = 8;
        double nota3 = 2;
        double maiorNota=0;
        double media=0;

        if (nota1>nota2 && nota1 > nota3){
            maiorNota = nota1;
        } else if (nota2  > nota1 && nota2>nota3) {
            maiorNota = nota2;
        }else {
            maiorNota = nota3;
        }

        System.out.println("A maior nota é: "+maiorNota);
        media = (nota1+nota2+nota3)/3;
        System.out.println("A media é: "+media);


        if ( media >= 7){
            System.out.println("Aprovado pois a média é: "+media);
        } else {
            System.out.println("Reprovado pois a média é: "+media);
        }



    }
}
