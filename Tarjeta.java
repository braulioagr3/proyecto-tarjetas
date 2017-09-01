public class Tarjeta
{
    // instance variables - replace the example below with your own
    private float Saldo;
    public Tarjeta()
    {
        // initialise instance variables
        Saldo = 0;
    }
    /**
     * Mediante validaciones permite insertar saldo y evitando que el usuario
     * ingrese saldo negativo
     */
    public void Depositar(float Dinero)
    {
        if(Dinero > 0 && Saldo > 0){
            Saldo = Saldo + Dinero;
        }
    }
    /**
     * Permite consultar el saldo
     * @return Saldo actual del usuario
     */
    public float Consultar()
    {
        return Saldo;
    }
    /**
     * Permite hacer retiros de saldo
     */
    public void Retirar(float Dinero)
    {
        if(Saldo >=Dinero)
            Saldo = Saldo - Dinero;
            else
            System.out.println("Saldo Insuficiente");
    }
}
