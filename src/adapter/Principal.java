package adapter;

/**
 * 
 * @author D
 *
 */
public class Principal {
	public static void main(String[] args) {

		SGBDGratuito grt = new SGBDGratuito();

		SGBDAdapter NContaGrt = new SGBDAdapter(grt);
		NContaGrt.solicBancoGratutito();

		SGBDBasico bsc = new SGBDBasico();

		SGBDAdapter NoContaBsc = new SGBDAdapter(bsc);
		NoContaBsc.solicBancoBasico();

		SGBDUltimate ultm = new SGBDUltimate();

		SGBDAdapter NContaUltm = new SGBDAdapter(ultm);
		NContaUltm.solicBancoUltimate();
	}

}
