import java.io.IOException;

public class Mensch
{
	protected String name;
	protected String email;

	public Mensch(String name, String email) throws IOException
	{
		this.name = name;
		if(email.matches("([^.]+\\@[^\\.]+\\.(de|com|org|jp))"))
		{
			this.email = email;
		} else 
		{
			throw new IOException("Needs an email address with de,com,org, or jp domain.");
		}
	}

	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
}