package gerenciaReservas;

//import javax.swing.JOptionPane;

public class Reserva {
	int numeroReserva,
			numeroDiarias;

	String responsavelPelaLocacao,
			tipoReserva,
			diaInicio,
			horaInicio,
			diaFim,
			horaFim;

	Valores valores;

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public int getNumeroDiarias() {
		return numeroDiarias;
	}

	public String getDiaInicio() {
		return diaInicio;
	}

	public String getDiaFim() {
		return diaFim;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public String getResponsavelPelaLocacao() {
		return responsavelPelaLocacao;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	private static void cadastrarReserva(Reserva re) {
		/*
		 * Reserva[] temp = new Reserva[res.length + 1];
		 * for (int i = 0; i < res.length; i++) {
		 * temp[i] = res[i];
		 * }
		 * temp[res.length] = re;
		 * res = temp;
		 * JOptionPane.showMessageDialog(null, "Reserva efetivada!");
		 * }
		 */
	}

}
