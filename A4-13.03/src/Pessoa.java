public class Pessoa {
    //DECLARAÇÕA DAS PROPIEDADES
    public String strNome;
    public int intIdade;
    public String strEmail;

    //METODO CONSTRUTOR responsavel por instanciar o metodos construtor,SE usar o overload, este não precisa
    public Pessoa(){

    }
    //overload de metodos sobreposição, mesmo nome declarados de formas diferentes: assinatura do metodo
    public Pessoa(String _strNome,int _intIdade,String _strEmail)
    {

        strNome = _strNome;
        intIdade = _intIdade;
        strEmail = _strEmail;  
    }

    // assinatura do metodo Pode ser assim
    // public Pessoa(String _strNome,int _intIdade,String _strEmail)
    // {

    //     this.strNome = _strNome;
    //     this.intIdade = _intIdade;
    //     this.strEmail = _strEmail;  
    // }

    //DEMAIS METODOS 
    public String FormatarDados(){
        return "Nome: " +strNome+"\n"+"E-mail: " +strEmail+"\n"+ "Idade: "+intIdade;
    }
}
    
