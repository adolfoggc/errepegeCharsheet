package errepegeCharSheet;

import java.util.ArrayList;

public class Personagem {
private String nome;
private int idade;
private Raças raca;
private boolean sexF; 
private short altura; //em cm
private short peso; //em g
private short tendência;
private String divindade;
private short[] habilidades;

/*
2x --- leal 
1x --- neutro
0x --- caótico
x2 --- bom
x1 --- neutro
x0 --- mau
*/

//talvez as classes sejam melhores aproveitadas como um enum
private String class1[];
private short nvl1;
private String class2[];
private short nvl2;
private String class3[];
private short nvl3;
private String class4[];
private short nvl4;
//classes de prestigio?
private String class5[];
private short nvl5;
private String class6[];
private short nvl6;

//modificadores de raça
private ArrayList <Talentos> Talentos;
private short Talento_Reg; //identificador no enum de talentos
private ArrayList <Talentos> Talentos_Classe;

private short Pericias[];//talvez seja melhor um arraylist
private ArrayList <Perícia> perícias;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public Raças getRaca() {
	return raca;
}

public void setRaca(Raças raca) {
	this.raca = raca;
}

public String nomeRaça() {
	return this.raca.toString();
}

public boolean isSexF() {
	return sexF;
}

public void setSexF(boolean sexF) {
	this.sexF = sexF;
}

public String nomeSexo() {
	if(this.sexF == true)	{
		return "Feminino";
	}
	else {
		return "Masculino";
	}
}

public short getAltura() {
	return altura;
}

public void setAltura(short altura) {
	this.altura = altura;
}

public float alturaMetros(){
	return (float)this.getAltura()/100;
}

public short getPeso() {
	return peso;
}

public void setPeso(short peso) {
	this.peso = peso;
}

public float pesoKg(){
	return (float) this.getPeso()/1000;
}

	Personagem(String nome, Raças raça)
	{
		this.setNome(nome);
		this.setRaca(raça);
	}

	public short getTendência() {
		return tendência;
	}

	public void setTendência(short tendência) {
		this.tendência = tendência;
	}

	public String getDivindade() {
		return divindade;
	}

	public void setDivindade(String divindade) {
		this.divindade = divindade;
	}
	

	public short[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(short[] habilidades) {
		this.habilidades = habilidades;
	}
	
	
	//saída de informações da ficha
	String toStringHabilidade(short elem)
	{
		
		switch (elem)
		{
			case 0:
			{
				return "Força: "+habilidades[0];
			}
			case 1:
			{
				return "Destreza: "+habilidades[1];
			}
			case 2:
			{
				return "Constituição: "+habilidades[2];
			}
			case 3:
			{
				return "Inteligência: "+habilidades[3];
			}
			case 4:
			{
				return "Sabedoria: "+habilidades[4];
			}
			case 5:
			{
				return "Carisma: "+habilidades[5];
			}
			default: return " ";
		}
	}
	
	
	void habsToString()
	{
		for(short i = 0; i<6; i++)
		{
			this.toStringHabilidade(i);
		}
	}

	public ArrayList <Perícia> getPerícias() {
		return perícias;
	}

	public void setPerícias(ArrayList <Perícia> perícias) {
		this.perícias = perícias;
	}
	
}
