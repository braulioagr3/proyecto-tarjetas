public class Tarjeta
{
    // instance variables - replace the example below with your own
    private float Saldo;
    public Tarjeta()
    {
        // initialise instance variables
        Saldo = 0;
    }
    public void Depositar(float Dinero)
    {
        Saldo = Saldo + Dinero;
    }
    public void Consultar()
    {
        System.out.println("Su Saldo es: ");
        System.out.println(Saldo);
    }
    public void Retirar(float Dinero)
    {
        if(Saldo >=Dinero)
            Saldo = Saldo - Dinero;
            else
            System.out.println("Saldo Insuficiente");
    }
}