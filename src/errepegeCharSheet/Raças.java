package errepegeCharSheet;

public enum Ra�as {
	HUMANO, ELFO_DA_LUA;

public String toString()
{
		switch (this)
		{
			case HUMANO:
				return "Humano";
			case ELFO_DA_LUA:
				return "Elfo da Lua";
			default:
				return "XXXXX"; //nunca cair� aqui
		}
}


	
}



