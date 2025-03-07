public class App {
    public static void main(String[] args) throws Exception {
       double fSalario = 10000;
       double IR =0;
       
       if ((fSalario >=1000)&& (fSalario <2500))
       {
            IR = fSalario * 0.1;
       }
            
        else
        {
            if (fSalario < 5000)
            {
                IR = fSalario * 0.2;
            }
            else
            {
                IR = fSalario * 0.25;
            }
        }
            
     System.out.println(IR);
    }
}

