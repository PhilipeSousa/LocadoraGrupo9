package gerenciaReservas;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.List;

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
	static List<Reserva> cadastroReservas = new LinkedList<Reserva>();

	public Reserva(String responsavelPelaLocaca, String tipoReserva2,int numeroReserva2,String diaInicio2, String diaFim2,
			String horaInicio2, String horaFim2) {
				this. responsavelPelaLocacao = responsavelPelaLocaca;
				this.tipoReserva = tipoReserva2;
				this.diaInicio = diaInicio2;
				this.horaInicio = horaInicio2;
				this.diaFim = diaFim2;
				this.horaFim = horaFim2;
				this.numeroReserva = numeroReserva2;
	}
	

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
	private static void cadastrarReversa(Reserva res) {
		boolean adicionou = cadastroReservas.add(res);
		if (adicionou)
			JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!");
			
	}

	public static void cadReserva() {
		boolean repeat = true;
		String diaInicio = "";
		String diaFim = "";

		String responsavelPelaLocaca = JOptionPane.showInputDialog("Responsavel pela locacao: ");
		String tipoReserva = JOptionPane.showInputDialog("Tipo de reserva: ");
		String strnum = JOptionPane.showInputDialog("Numero da reserva: ");
		int numeroReserva = Integer.parseInt(strnum);

		
		while(repeat == true){
			try{
				diaInicio = JOptionPane.showInputDialog("Dia de inicio da locacao: ");
				if (diaInicio.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				diaFim = JOptionPane.showInputDialog("Dia do fim da locacao: ");
				if (diaFim.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String	horaInicio = JOptionPane.showInputDialog("Hora do inicio da locacao: ");
		String	horaFim = JOptionPane.showInputDialog("Hora do fim da locacao: ");
		
			
		Reserva res = new Reserva(responsavelPelaLocaca,tipoReserva ,numeroReserva, diaInicio, diaFim,
				horaInicio, horaFim);
				
		cadastrarReversa(res);	 	
	}

	public static boolean pesquisarReserva() {
		boolean resposta = false;

		String esc = JOptionPane.showInputDialog(null, "Buscar numero de reserva: ");
		int num = Integer.parseInt(esc);
		for (Reserva veiculo : cadastroReservas) {
			if (veiculo.getNumeroReserva() == num) {
				JOptionPane.showMessageDialog(null, "Encontrada a reserva :\nResponsavel pela reserva: " + veiculo.getResponsavelPelaLocacao());
				resposta = true;
			}
		}

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException e) {
			String msg =  "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
	}
	
}
