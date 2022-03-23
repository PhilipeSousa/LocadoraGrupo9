package gerenciaReservas;

import javax.swing.JOptionPane;

import gerenciaLocatarios.*;
import gerenciaFrota.*;

public class Reserva {
	int numeroReserva,
			numeroDiarias,
			inicio,
			fim;
	String responsavelPelaLocacao,
			tipoReserva;
	Veiculos veiculo;
	Locatario locatario;
	static Reserva[] res = new Reserva[0];

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public int getNumeroDiarias() {
		return numeroDiarias;
	}

	public int getInicio() {
		return inicio;
	}

	public int getFim() {
		return fim;
	}

	public String getResponsavelPelaLocacao() {
		return responsavelPelaLocacao;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	private static void cadastrarReserva(Reserva re) {
		Reserva[] temp = new Reserva[res.length + 1];
		for (int i = 0; i < res.length; i++) {
			temp[i] = res[i];
		}
		temp[res.length] = re;
		res = temp;
		JOptionPane.showMessageDialog(null, "Reserva efetivada!");
	}

}
