package errepegeCharSheet;

/*
Método distribuirPontos() para assim que pontos == 0. Num programa com GUI, a parada será o usuário apertar o botão OK
Uma solução será ter como condição de saída do loop uma variável externa, alterada ao clicar no OK




*/

public class CriarFicha {
	private short pontos = 0;
	private short modo; //modo de pontuação do personagem
	private short habs[] = {8,8,8,8,8,8};
	private Personagem perso;
	
	//talvez seja necessário mudar o construtor
	CriarFicha(short modo, String nome, Raças raca){ 
		Personagem p = new Personagem(nome, raca);
		this.setPerso(p);
		//distribuição de pts de habilidade
		this.modificadorDePontos();
		
		//penultima linha antes das perícias
		//this.modsRaça(raca);
		//this.perso.setHabilidades(habs);
		//
		//perícias
		
		
	} //final construtor
	
	
	public void dizHabilidades()
	{
		System.out.println("\nHabilidades:\nForça: "+habs[0]+"\nDestreza: "+habs[1]+"\nConstituição: "+habs[2]+"\nInteligência: "+habs[3]+"\nSabedoria: "+habs[4]+"\nCarisma: "+habs[5]+"\n\n");
	}
	
	public void modsRaça(Raças r)
	{
		switch (r)
		{
			case HUMANO:
				break;
			case ELFO_DA_LUA:
			{
				
				habs[1] = (short) (habs[1]+ 2); //destreza
				habs[2] = (short) (habs[2]-2); //constituição

				break;
			}	
			default: //nunca deverá cair aqui, mas serve de molde
			{
				habs[0] = (short)(habs[0]+ 0); //força
				habs[1] = (short)(habs[1]+ 0); //destreza
				habs[2] = (short)(habs[2]+ 0); //constituição
				habs[3] = (short)(habs[3]+ 0); //inteligência
				habs[4] = (short)(habs[4]+ 0); //sabedoria
				habs[5] = (short)(habs[5]+ 0); //carisma
			}
		}
		//return mods;
	}
	
	short getHabMod(short h)
	{
		return (short) ((h/2)-5);
	}


	public short[] getHabs() {
		return habs;
	}


	public void setHabs(short habs[]) {
		this.habs = habs;
	}


	public short getModo() {
		return modo;
	}


	public void setModo(short modo) {
		this.modo = modo;
	}


	public short getPontos() {
		return pontos;
	}


	public void setPontos(short pontos) {
		this.pontos = pontos;
	}


	public Personagem getPerso() {
		return perso;
	}


	public void setPerso(Personagem perso) {
		this.perso = perso;
	}
	
	private void modificadorDePontos()
	{
		switch(modo)
		{
			case (short)0: //mothafucka heroes of errepege
			{	
				habs[0] = (short)(habs[0]+ 2); //força
				habs[1] = (short)(habs[1]+ 2); //destreza
				habs[2] = (short)(habs[2]+ 2); //constituição
				habs[3] = (short)(habs[3]+ 2); //inteligência
				habs[4] = (short)(habs[4]+ 2); //sabedoria
				habs[5] = (short)(habs[5]+ 2); //carisma
				pontos = (short)28;
				break;
			}
			default:
			{
				
			}
		}
		
	}//fim modif Pontos
	
	public void dizPontos()
	{
		System.out.println("\nPontos = "+this.pontos);
	}
	
	//método onde x é a posição no vetor de habilidades e boolean indica se quer aumentar (true) ou diminuir (false) essa habilidade
	public void distribuirPontos(short p, boolean b)
	{
		habs[p] = this.mudaHab(habs[p], b);
	}//fim distribuir pontos
	
	
	//método onde x é o valor de uma habilidade e boolean indica se quer aumentar (true) ou diminuir (false) essa habilidade
	private short mudaHab(short x, boolean b) //true = aumentar, false = diminuir
	{
		if(b) //aumentar
		{
		    switch (x)
		    {
		    	case(short)(10):
		    	{
		    		if(pontos >= (short)1)
		    		{
		    			pontos--;
		    			x = (short)11;
		    		}
		    		break;
		    	}
		    	case(short)(11):
		    	{
		    		if(pontos >= (short)1)
		    		{
		    			pontos = (short) (pontos - 1);
		    			x = (short)12;
		    		}
		    		break;
		    	}
		    	case(short)(12):
		    	{
		    		if(pontos >= (short)1)
		    		{
		    			pontos = (short) (pontos - 1);
		    			x = (short)13;
		    		}
		    		break;
		    	}
		    	case(short)(13):
		    	{
		    		if(pontos >= (short)2)
		    		{
		    			pontos = (short) (pontos - 2);
		    			x = (short)14;
		    		}
		    		break;
		    	}
		    	case(short)(14):
		    	{
		    		if(pontos >= (short)1)
		    		{
		    			pontos = (short) (pontos - 1);
		    			x = (short)15;
		    		}
		    		break;
		    	}
		    	case(short)(15):
		    	{
		    		if(pontos >= (short)2)
		    		{
		    			pontos = (short) (pontos - 2);
		    			x = (short)16;
		    		}
		    		break;
		    	}
		    	case(short)(16):
		    	{
		    		if(pontos >= (short)2)
		    		{
		    			pontos = (short) (pontos - 2);
		    			x = (short)17;
		    		}
		    		break;
		    	}
		    	case(short)(17):
		    	{
		    		if(pontos >= (short)2)
		    		{
		    			pontos = (short) (pontos - 4);
		    			x = (short)18;
		    		}
		    		break;
		    	}
		    	default:
		    	{
		    		if(pontos >= (short)1 && x!=18) //impede que tente aumentar se x == 18
		    		{
		    			pontos = (short) (pontos - 1);
		    			x = (short) (x +1);
		    		}
		    		break;
		    	}
		    }

		}
		else
		{
			switch (x)
		    {
		    	case(short)(10):
		    	{
		    		pontos = (short) (pontos + 1);
		    		x = (short)9;
		    		break;
		    	}
		    	case(short)(11):
		    	{
		    		pontos = (short) (pontos + 1);
		    		x = (short)10;
		    		break;
		    	}
		    	case(short)(12):
		    	{
		    		pontos = (short) (pontos + 1);
		    		x = (short)11;
		    		break;
		    	}
		    	case(short)(13):
		    	{
		    		pontos = (short) (pontos + 1);
		    		x = (short)12;
		    		break;
		    	}
		    	case(short)(14):
		    	{
		    		pontos = (short) (pontos + 2);
		    		x = (short)13;
		    		break;
		    	}
		    	case(short)(15):
		    	{	
		    		pontos = (short) (pontos + 1);
		    		x = (short)14;
		    		break;
		    	}
		    	case(short)(16):
		    	{
		    		pontos = (short) (pontos + 2);
		    		x = (short)15;
		    		break;
		    	}
		    	case(short)(17):
		    	{
		    		pontos = (short) (pontos + 2);
		    		x = (short)16;
		    		break;
		    	}
		    	case(short)(18):
		    	{		
		    		pontos = (short) (pontos + 4);
		    		x = (short)17;
		    		break;
		    	}
		    	default:
		    	{		
		    		if (x>3) //x tem de ser pelo menos 4
		    		{
		    			pontos = (short) (pontos + 1);
		    			x = (short) (x-1);
		    		}
		    		break;
		    	}
		    }
		}
		return x;
	}
}


