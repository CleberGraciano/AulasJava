package condicional;
//    modificador de acesso(publico ou privado) - tipo de retorno (void ) - nomeMetodo - parametros(com ou sem)

public class Metodo {

    public String fazerPipoca() {
        int tempo=2;
        int potencia = 200;
        return "Fazendo pipoca";
    }

    public String fazerCarneBovina(){
        int tempo=20;
        int potencia = 200;

        return "Carne cozinhando daqui a "+tempo+" minutos está pronta";

    }

    public String aquecer(int tempo, int potencia){
        return "Aquecendo sua comida";
    }




}
