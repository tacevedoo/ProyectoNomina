package ProgramaNomina;
import java.util.*;
public class ListaEmpleados {
	public Vector<Object> Lista;
	public double TotalNomina = 0;
	
	public ListaEmpleados() {
		Lista = new Vector<Object>();
	}
	
	public void AgregarEmpleado(Empleado a) {
		Lista.add(a);
	}
	
	public double CalcularTotalNomina() {
		for (int i=0;i<Lista.size();i++) {
			Empleado e = (Empleado) Lista.elementAt(i);
			TotalNomina = TotalNomina + e.CalcularNomina();
		}
		return TotalNomina;
	}
	
	public String[][] ObtenerMatriz(){
		String Datos[][] = new String[Lista.size()][3];
		for(int i=0;i<Lista.size();i++) {
			Empleado e = (Empleado) Lista.elementAt(i);
			Datos[i][0] = e.getNombres();
			Datos[i][1] = e.getApellidos();
			Datos[i][2] = Double.toString(e.CalcularNomina());
			TotalNomina = TotalNomina + e.CalcularNomina();
		}
		return Datos;
	}
	
	public String convertirTexto() {
		String Texto = "";
		for (int i=0;i<Lista.size(); i++) {
			Empleado e = (Empleado) Lista.elementAt(i);
			Texto = Texto + "Nombre = " + e.getNombres() + "\n" 
						+ "Apellidos = " + e.getApellidos() + "\n"
						+ "Cargo = " + e.getCargo() + "\n" 
						+ "Género = " + e.getGenero() + "\n" 
						+ "Salario = $" + e.getSalarioDia() + "\n" 
						+ "Días trabajados = " + e.getDiasTrabajados() + "\n"
						+ "Otros ingresos = $" + e.getOtrosIngresos() + "\n"
						+ "Pagos salud = $" + e.getPagosSalud() + "\n"
						+ "Aportes pensiones = $" + e.getAportePensiones() + "\n---------\n";
		}
		Texto = Texto + "Total nómina = $" + String.format("%.2f", CalcularTotalNomina());
		return Texto;
	}
}
