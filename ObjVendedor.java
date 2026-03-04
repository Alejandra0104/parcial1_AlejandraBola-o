public class ObjVendedor 
{
    private String vendedor;
    private int Tel;
    private double[] ventas;

    public ObjVendedor() 
    {
        ventas = new double[12];
    }
    public ObjVendedor(String vendedor, int Tel) {
        this.vendedor = vendedor;
        this.Tel = Tel;
        this.ventas = new double[12];
    }

    public String getVendedor() {
        return vendedor;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    public double[] getVentas() {
        return ventas;
    }
    public int getTel() {
        return Tel;
    }
    public void setTel(int Tel) {
        Tel = Tel;
    }
    public void setVentaMes(int mes, double valor) {
        ventas[mes] = valor;
    }

    public double totalAnual() {

        double suma = 0;

        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }

        return suma;
    }

    
}
