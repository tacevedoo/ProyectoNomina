package ProgramaNomina;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class VentanaNomina extends JFrame{
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private ListaEmpleados lista;
	private JLabel empleados, nomina;
	private JTable tabla;
	
	public VentanaNomina(ListaEmpleados lista) {
		this.lista = lista;
		inicio();
		setTitle("Nómina de Empleados");
		setSize(350,250); 
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		empleados = new JLabel();
		empleados.setText("Lista de empleados:");
		empleados.setBounds(20, 10, 135, 23);
		String[][] datos = lista.ObtenerMatriz();
		String[] titulos = { "NOMBRE","APELLIDOS","SUELDO"};
		DefaultTableModel model = new DefaultTableModel(datos,titulos);
	    tabla = new JTable(model);
	    tabla.setBounds(20, 50, 310, 100);
		nomina = new JLabel();
		nomina.setText("Total nómina mensual = $ " + String.format("%.2f", lista.TotalNomina));
		nomina.setBounds(20, 160, 250, 23);
		contenedor.add(empleados);
		contenedor.add(tabla);
		contenedor.add(nomina);
	}
}
