import java.io.IOException;

public class Referent extends Mensch
{
	protected String firma;

	public Referent(String name, String email, String firma) throws IOException
	{
		super(name,email);
		this.firma = firma;
	}

	public String getFirma()
	{
		return this.firma;
	}
}