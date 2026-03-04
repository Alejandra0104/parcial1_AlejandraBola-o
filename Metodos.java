import java.util.Scanner;

public class Metodos 
{
    public ObjVendedor[] llenarVendedores(ObjVendedor[] m, Scanner sc) {

        for (int i = 0; i < m.length; i++) {

            System.out.print("Ingrese nombre del vendedor " + (i+1) + ": ");
            String nombre = sc.next();

            System.out.print("ingrese el teléfono: ");
            int Tel = sc.nextInt();

            m[i] = new ObjVendedor(nombre, Tel);

            for (int mes = 0; mes < 12; mes++) {

                System.out.print("Venta mes " + (mes+1) + ": ");
                double venta = sc.nextDouble();

                m[i].setVentaMes(mes, venta);
            }
            System.out.println("**************************************");
        }

        return m;
    }

    public void vendedorMayorVenta(ObjVendedor[] m) {

        double mayor = 0;
        ObjVendedor mejor = null;
        

        for (int i = 0; i < m.length; i++) {

            double total = m[i].totalAnual();

            System.out.println("Total anual de " + m[i].getVendedor() + ": " + total);

            if (i == 0 || total > mayor) {
                mayor = total;
                mejor = m[i];
            }
        }

        System.out.println("Mejor vendedor: " + mejor.getVendedor());
        System.out.println("Teléfono: " + mejor.getTel());
        System.out.println("Total vendido en el año: " + mayor);
    }
}
