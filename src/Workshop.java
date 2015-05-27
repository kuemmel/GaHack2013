import java.util.*;
import java.io.IOException;

public class Workshop 
{
	private int nummer; 
	private String bezeichnung;
	private Date datum;
	private Referent referent;
	private ArrayList<Mensch> teilnehmer;

	public Workshop (int nummer, String bezeichnung, Date datum, Referent referent) throws IOException
	{
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.referent = referent;
	}

	public void teilnehmerAnmelden(Mensch teilnehmer) 
	{
		this.teilnehmer.add(teilnehmer);
	}

	public void teilnehmerAusschreiben(Mensch teilnehmer)
	{
		this.teilnehmer.remove(teilnehmer);
	}

	public ArrayList<Mensch> getTeilnehmer()
	{
		return this.teilnehmer;
	}

	public int getNummer()
	{
		return this.nummer;
	}	
	public Date getDatum()
	{
		return this.datum;
	}
	public Referent getReferent()
	{
		return this.referent;
	}
	public String getBezeichnung()
	{
		return this.bezeichnung;
	}	





}