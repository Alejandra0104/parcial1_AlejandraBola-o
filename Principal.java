import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();

        ObjVendedor [] m = new ObjVendedor[5];

        m = met.llenarVendedores(m, sc);

        met.vendedorMayorVenta(m);
    }   
}
