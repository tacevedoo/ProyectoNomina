package ProgramaNomina;
public class Empleado {
	private String Nombres;
	private String Apellidos;
	private double SalarioDia;
	private double OtrosIngresos;
	private double PagosSalud;
	private double AportePensiones;
	private int DiasTrabajados;
	private TipoCargo Cargo;
	private TipoGenero Genero;
	
	public Empleado(String nombres, String apellidos, double salarioDia, double otrosIngresos, double pagosSalud, double aportePensiones, int diasTrabajados, TipoCargo cargo, TipoGenero genero) {
		Nombres = nombres;
		Apellidos = apellidos;
		SalarioDia = salarioDia;
		OtrosIngresos = otrosIngresos;
		PagosSalud = pagosSalud;
		AportePensiones = aportePensiones;
		DiasTrabajados = diasTrabajados;
		Cargo = cargo;
		Genero = genero;
	}

	public String getNombres() {
		return Nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public double getSalarioDia() {
		return SalarioDia;
	}

	public double getOtrosIngresos() {
		return OtrosIngresos;
	}

	public double getPagosSalud() {
		return PagosSalud;
	}

	public double getAportePensiones() {
		return AportePensiones;
	}

	public int getDiasTrabajados() {
		return DiasTrabajados;
	}

	public TipoCargo getCargo() {
		return Cargo;
	}

	public TipoGenero getGenero() {
		return Genero;
	}
	
	public double CalcularNomina() {
		return ((SalarioDia * DiasTrabajados) + OtrosIngresos - PagosSalud - AportePensiones);
	}
}
