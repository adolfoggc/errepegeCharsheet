package errepegeCharSheet;

import java.util.ArrayList;

public class Per�cia {
	private Per�cias nome;
	private short total;
	private short gradua��o = 0;
	private short habilidade;
	private boolean semTreinamento;
	private short outros;
	private boolean penalidadeDeArmadura;
	private ArrayList <Classes> classes; //classes que possuem a per�cia
	
	
	Per�cia(Per�cias nome) //COLOCAR LISTA DE CLASSES PARA CADA PER�CIA
	{
		switch(nome)
		{ 
			case ABRIR_FECHADURAS:
			{
				habilidade = (short)1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case ACROBACIAS: 
			{
				habilidade = (short)1;
				semTreinamento = false;
				penalidadeDeArmadura = true;
				
				break;
			}
			case ADESTRAR_ANIMAIS:
			{
				habilidade = (short)5;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			} 
			case ARTE_DA_FUGA:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			}
			case ATUA��O:
			{
				habilidade = (short)5;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case AVALIA��O:
			{
				habilidade = (short)3;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case BLEFAR:
			{
				habilidade = (short)5;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CAVALGAR:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONCENTRA��O:
			{
				habilidade = (short)2;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_ARCANO:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_ARQUITETURA_E_ENGENHARIA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_GEOGRAFIA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_HIST�RIA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_LOCAL:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;	
			}
			case CONHECIMENTO_MASMORRAS:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_NATUREZA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_NOBREZA_E_REALEZA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_PLANOS:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CONHECIMENTO_RELIGI�O:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case CURA:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case DECIFRAR_ESCRITA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case DIPLOMACIA:
			{
				habilidade = (short)5;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case DISFARCES:
			{
				habilidade = (short)5;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case EQUILIBRIO:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			}
			case ESCALAR:
			{
				habilidade = (short)0;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			}
			case ESCONDER_SE:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			}
			case FALAR_ABISSAL:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_AN�O:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_AQUAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_AURAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_BELERIAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_CELESTIAL:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_CHONDATAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_COMUM:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_DRACONICO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_DRUIDICO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_�LFICO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_GIBTICS:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_GIGANTE:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_GNOLL:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_GNOMO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_GOBLIN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_HALFLING:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_IGNAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_INFERNAL:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_ORC:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_RYUUGO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_SCHNEE:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_SILVESTRE:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_SUBTERRANEO:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_TERRAN:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALAR_THURIR:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FALSIFICA��O:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case FURTIVIDADE:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			} 
			case IDENTIFICAR_MAGIA:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case INTIMIDA��O:
			{
				habilidade = (short)5;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case NATA��O:
			{
				habilidade = (short)0;
				semTreinamento = true;
				penalidadeDeArmadura = true;  //TIPO ESPECIAL DE PENALIDADE
				
				break;
			}
			case OBSERVAR:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case OBTER_INFORMA��O:
			{
				habilidade = (short)5;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			} 
			
			///OF�CIOS
			
			case OPERAR_MECANISMO:
			{
				habilidade = (short)3;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			case OUVIR:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}			
			case PRESTIDIGITA��O:
			{
				habilidade = (short)1;
				semTreinamento = false;
				penalidadeDeArmadura = true;
				
				break;
			}
			case PROCURAR:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			
			//PROFISS�ES
			
			case SALTAR:
			{
				habilidade = (short)0;
				semTreinamento = true;
				penalidadeDeArmadura = true;
				
				break;
			}
			case SENTIR_MOTIVA��O:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case SOBREVIV�NCIA:
			{
				habilidade = (short)4;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case USAR_CORDAS:
			{
				habilidade = (short)1;
				semTreinamento = true;
				penalidadeDeArmadura = false;
				
				break;
			}
			case USAR_INSTRUMENTO_M�GICO:
			{
				habilidade = (short)5;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
			default:
			{
				habilidade = (short)-1;
				semTreinamento = false;
				penalidadeDeArmadura = false;
				
				break;
			}
		}
	}
	
	public short penalidade(short penalidadeDeArmadura)
	{
		if(this.penalidadeDeArmadura == true)
		{
			if(this.nome == Per�cias.NATA��O)
			{
				return (short) (2*(penalidadeDeArmadura));
			}
			else
			{
				return penalidadeDeArmadura;
			}
		}
		else
		{
			return 0;
		}
	}
	
	public String dizerHabilidade()
	{
		switch (this.habilidade)
		{
			case (short)0:
			{
				return "For�a";
			}
			case (short)1:
			{
				return "Destreza";
			}
			case (short)2:
			{
				return "Constitui��o";
			}
			case (short)3:
			{
				return "Intelig�ncia";
			}
			case (short)4:
			{
				return "Sabedoria";
			}
			case (short)5:
			{
				return "Carisma";
			}
			case (short)-1:
			{
				return "Nenhuma Habilidade Relacionada";
			}
			default:
			{
				return "HABILIDADE N�O LISTADA";
			}
		}
		
	}
	
}
