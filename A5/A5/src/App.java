public class App {
    public static void main(String[] args) throws Exception {
            //var float f no final
            Pessoa _pessoa = new Pessoa("Frederico", 12.8f, 13, 2.800);

            //calcular o valor da parcela possivel de acordo com o salario
            double retornoEmprestimo = _pessoa.ValorEmprestimo(2800);

            //imprimir dados
            _pessoa.ImprimirDados(retornoEmprestimo);

            double valorParcelaFinan = (_pessoa.CalImovelPac(8000)*360);
            double totalFinan = valorParcelaFinan * 360;
            System.out.println(totalFinan);

            _pessoa.setName("OLIVIA");
            System.out.println(_pessoa.getName());
            
    }
}
