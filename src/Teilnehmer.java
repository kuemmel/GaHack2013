import java.io.IOException;

public class Teilnehmer extends Mensch
{
	public enum Status { STUDENT, NICHT_MITGLIED, MITGLIED };
	protected Status status;

	public Teilnehmer(String name, String email, String status) throws IOException
	{
		this(name,email,checkStatus(status));
	}

	public Teilnehmer(String name, String email, Status status) throws IOException
	{
		super(name,email);
		this.status = status;
	}

	private static Status checkStatus (String status)
	{
		if(status.matches("(S|s)tudent"))
		{	
			return(Status.STUDENT);			
		} else if (status.matches("^mitglied"))
		{
			return(Status.MITGLIED);
		} else 
		{
			return(Status.NICHT_MITGLIED);
		}
	}

	public Status getStatus()
	{
		return this.status;
	}

}