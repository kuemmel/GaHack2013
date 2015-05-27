
public class Mensch
{
	private String name;
	private String email;

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

	public getName()
	{
		return this.name;
	}
	public getEmail()
	{
		return this.email;
	}
}