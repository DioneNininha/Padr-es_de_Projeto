package adapter;

/**
 * 
 * @author D
 *
 */
public class SGBDAdapter extends SGBDUltimate {

	private SGBDGratuito sgbdGratuito;
	private SGBDBasico sgbdBasico;
	private SGBDUltimate sgbdUltimate;

	public SGBDAdapter(SGBDGratuito sgbdGratuito) {

		this.sgbdGratuito = sgbdGratuito;
	}

	public SGBDAdapter(SGBDBasico sgbdBasico) {
		this.sgbdBasico = sgbdBasico;
	}

	public SGBDAdapter(SGBDUltimate sgbdUltimate) {

		this.sgbdUltimate = sgbdUltimate;
	}

	public void solicBancoGratutito() {

		sgbdGratuito.bancoGratuito();
	}

	public void solicBancoBasico() {

		sgbdBasico.bancoBasico();
	}

	public void solicBancoUltimate() {

		sgbdUltimate.bancoUltimate();
	}
}
