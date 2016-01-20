package errepegeCharSheet;

public class executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CriarFicha cf = new CriarFicha((short)0, "Zé Doidim", Raças.ELFO_DA_LUA);
		cf.dizPontos();
		cf.dizHabilidades();
		for(int i = 0;i<10;i++)
		{	
			cf.distribuirPontos((short)1, false);
			cf.dizPontos();
			cf.dizHabilidades();
		}
		for(int i = 0;i<7 ;i++)
		{	
			cf.distribuirPontos((short)1, true);
			cf.dizPontos();
			cf.dizHabilidades();
		}
		cf.modsRaça(Raças.ELFO_DA_LUA);
		cf.dizPontos();
		cf.dizHabilidades();
		cf.toString();
	}

}
