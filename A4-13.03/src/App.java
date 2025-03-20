public class App {
    public static void main(String[] args) throws Exception {
        //CRIAR A 1º INSTANCIA(OBJETO) DA CLASSE PESSOA
        //Pessoa _pessoa 
        //1º pessoas diz respeito a classe, é inicializado através do metodo construtor new

        
        //Pessoa carlos = new Pessoa()
        // carlos.strNome = "Carlos Eduardos ";
        // carlos.intIdade = 52;
        // carlos.strEmail ="email@unisinos.br";

        // nathalia.strNome = "Nathalia Martins";
        // nathalia.intIdade = 20;
        // nathalia.strEmail = "email@unisinos.br";

        //COM A ASSINATURA DO METODO
        Pessoa carlos = new Pessoa("Carlos Eduardo", 18, "email@unisinos.br");
       

        //IMPRIMIR OS DADOS EM TELA
        String Impressora = carlos.FormatarDados();
        System.out.println(Impressora);
        
        //IMPRIMIR OS DADOS EM TELA
        
        //System.out.println(nathalia.FormatarDados()); 


        //Destrutor 
        carlos = null;

        //vetores 
        Pessoa[] _pessoas = new Pessoa[5];
        _pessoas[0] = carlos;

        _pessoas[0].intIdade = 11;
    }
}

