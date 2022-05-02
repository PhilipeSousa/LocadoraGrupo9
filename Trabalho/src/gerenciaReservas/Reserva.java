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

	public Reserva(String responsavelPelaLocacao, String tipoReserva2, int numeroReserva2, String diaInicio2,
			String diaFim2,
			String horaInicio2, String horaFim2) {
		this.responsavelPelaLocacao = responsavelPelaLocacao;
		this.tipoReserva = tipoReserva2;
		this.diaInicio = diaInicio2;
		this.horaInicio = horaInicio2;
		this.diaFim = diaFim2;
		this.horaFim = horaFim2;
		this.numeroReserva = numeroReserva2;
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

		String responsavelPelaLocacao = JOptionPane.showInputDialog("Responsavel pela locacao: ");
		String tipoReserva = JOptionPane.showInputDialog("Tipo de reserva: ");
		String strnum = JOptionPane.showInputDialog("Numero da reserva: ");
		int numeroReserva = Integer.parseInt(strnum);

		while (repeat == true) {
			try {
				diaInicio = JOptionPane.showInputDialog("Dia de inicio da locacao: ");
				if (diaInicio.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;

			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		repeat = true;
		while (repeat == true) {
			try {
				diaFim = JOptionPane.showInputDialog("Dia do fim da locacao: ");
				if (diaFim.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;

			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		String horaInicio = JOptionPane.showInputDialog("Hora do inicio da locacao: ");
		String horaFim = JOptionPane.showInputDialog("Hora do fim da locacao: ");

		Reserva res = new Reserva(responsavelPelaLocacao, tipoReserva, numeroReserva, diaInicio, diaFim,
				horaInicio, horaFim);

		cadastrarReversa(res);
	}

	public static boolean pesquisarReserva() {
		boolean resposta = false;

		String esc = JOptionPane.showInputDialog(null, "Buscar numero de reserva: ");
		int num = Integer.parseInt(esc);
		for (Reserva veiculo : cadastroReservas) {
			if (veiculo.getNumeroReserva() == num) {
				JOptionPane.showMessageDialog(null,
						"Encontrada a reserva :\nResponsavel pela reserva: " + veiculo.getResponsavelPelaLocacao());
				resposta = true;
			}
		}

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException e) {
			String msg = "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
	}

	public static void alterarReserva() {
		Reserva l = pesquisar_alt();
		if (l != null && l instanceof Reserva) {
			Reserva pf = (Reserva) l;
			String strEscolha = JOptionPane.showInputDialog("Digite: \n"
					+ "1 - Para alterar o nome do responsavel: \n"
					+ "2 - Para alterar a data de inicio: \n"
					+ "3 - Para alterar a data de fim: \n"
					+ "4 - Para alterar a hora de inicio: \n"
					+ "5 - Para alterar a hora de fim: \n");

			int escolha = Integer.parseInt(strEscolha);
			if (escolha == 1) {
				String marcaMod = JOptionPane.showInputDialog("Digite o novo nome do responsavel: ");
				l.setResponsavelPelaLocacao(marcaMod);
				JOptionPane.showMessageDialog(null, "nome alterado com sucesso!");
			}
			if (escolha == 2) {
				String modelMod = JOptionPane.showInputDialog("Digite a nova data de inicio: ");
				l.setDiaInicio(modelMod);
				JOptionPane.showMessageDialog(null, "data de inicio alterada com sucesso!");
			}
			if (escolha == 3) {
				String anofMod = JOptionPane.showInputDialog("Digite a nova data de fim: ");
				l.setDiaFim(anofMod);
				JOptionPane.showMessageDialog(null, "data de fim alterada com sucesso!");
			}
			if (escolha == 4) {
				String anoMod = JOptionPane.showInputDialog("Digite a nova hora de inicio: ");
				l.setHoraInicio(anoMod);
				JOptionPane.showMessageDialog(null, "hora de inicio alterada com sucesso!");
			}
			if (escolha == 5) {
				String renaMod = JOptionPane.showInputDialog("Digite a nova hora de fim: ");
				l.setHoraFim(renaMod);
				JOptionPane.showMessageDialog(null, "hora de fim alterada com sucesso!");
			}
		}

	}

	public static Reserva pesquisar_alt() {

		int escolha = 1;
		Reserva reservaPesquisado = null;

		if (escolha == 1) {

			String numeroReserva = JOptionPane.showInputDialog("Digite o numero da reserva que deseja alterar: ");
			int num = Integer.parseInt(numeroReserva);

			for (Reserva l : cadastroReservas) {
				if (l instanceof Reserva) {
					Reserva pf = (Reserva) l;
					if (l.getNumeroReserva() == num) {
						JOptionPane.showMessageDialog(null, "Reserva encontrada!");
						reservaPesquisado = l;
					}
				}
			}
		}
		return reservaPesquisado;
	}

	public static boolean removerReserva() {
		boolean resposta = false;

		String numeroReserva = JOptionPane.showInputDialog(null,
				"Buscar pelo numero de reserva o cadastro a ser excluido: ");
		int num = Integer.parseInt(numeroReserva);

		for (Reserva reserva : cadastroReservas) {
			if (reserva.getNumeroReserva() == num) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro de reserva:\nNumero: "
						+ reserva.getNumeroReserva() + "\nNome:" + reserva.getResponsavelPelaLocacao());

				int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o cadastro?",
						"Remover cadastro",
						JOptionPane.YES_NO_OPTION);

				if (confirmacao == JOptionPane.YES_OPTION) {
					cadastroReservas.remove(reserva);
					JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!");
					resposta = true;
				} else {
					JOptionPane.showMessageDialog(null, "Decisao revogada");
					resposta = true;
				}

			}
		}

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException e) {
			String msg = "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
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

	public void setResponsavelPelaLocacao(String responsavelPelaLocacao) {
		this.responsavelPelaLocacao = responsavelPelaLocacao;
	}

	public void setReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setDiaFim(String diaFim) {
		this.diaFim = diaFim;
	}

	public void setDiaInicio(String diaInicio) {
		this.diaInicio = diaInicio;
	}

	public void setNumeroDiarias(int numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}

	public void setNumeroReservas(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
}
