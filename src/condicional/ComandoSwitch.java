package condicional;

//cardapio e nele contem em ordem sequencial, as opções de pratos,
//faça um cardapio digital, a qual guarde o prato da pessoa e a quantidade desejada daquele
//prato;
public class ComandoSwitch {
    public static void main(String[] args) {

        int opcao=2;
        String nomePrato="";
        int quantidade=0;

        switch (opcao) {
            case 1: {
                nomePrato="Feijoada";
                quantidade=2;
                break;
            }
            case 2 : {
                nomePrato="Panqueca";
                quantidade=1;
                break;
            } default: {
                System.out.println("Opção invalida!!");
                break;
            }
        }

        System.out.println("O prato escolhido é: "+nomePrato+" e a quantidade é: "+quantidade);

    }
}
