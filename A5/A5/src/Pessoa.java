public class Pessoa 
{
    //definição dos atributos//
    private String Nome;
    private float Aniversario;
    private int NumerodaSorte;
    private double Salario;
    
    //metodo construtor
    public Pessoa(String _Nome,float _Aniversario,int _NumerodaSorte,double _Salario)
    {
        this.Nome = _Nome == "" ? "***" : _Nome;
        this.Aniversario = _Aniversario;
        this.NumerodaSorte = _NumerodaSorte;
        this.Salario = _Salario;

    }

    public double  ValorEmprestimo (double Salario){
        double _valorParcela = 0;

        //calculo 
        //Salario <= 5000 ? "" :"";
        if (Salario <= 5000) 
            _valorParcela = Salario *0.2;
            
        else if (Salario > 5000 && Salario<=8000) 
            _valorParcela = Salario *0.3;
            
        else
            _valorParcela = Salario * 0.35;

        return _valorParcela;

    }

    public void ImprimirDados(double emprestimo){
        System.out.println("Prezado candidato"+ this.Nome +", cujo número da sorte é:"+ this.NumerodaSorte+ "você foi contemplado com um limite para emprestimo de"+emprestimo);

    }

    public double CalImovelPac (double Salario){
        double totalPac = 0;
        if (Salario < 5000)
         totalPac = Salario * 0.05;
        else if(Salario > 5000 && Salario<=8000)
         totalPac = Salario *0.06;
        else
         totalPac = Salario* 0.65;


        return totalPac;
    }

    public void ImprimirDadosImovel(double _totalFinan){
        System.out.println("Prezado candidato"+ this.Nome+"você podera financiar um imóvel de até"+_totalFinan+ "a partir do seu slario de "+this.Salario);

    }

    public void setName(String _nome){
        this.Nome = _nome;
    } 

    public String getName(){
        return this.Nome;
    }
}

