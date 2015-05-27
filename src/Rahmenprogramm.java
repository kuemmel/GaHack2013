import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class Rahmenprogramm
{
	private String bezeichnung;
	private Date datum;
	private long zeit;
	private String ort;
	private ArrayList<Mensch> teilnehmer;

	public Rahmenprogramm(String bezeichnung, Date datum, long zeit, String ort)
	{
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
		this.teilnehmer = new ArrayList<Mensch>();
	}

	public void teilnehmerAnmelden(Mensch teilnehmer) 
	{
		this.teilnehmer.add(teilnehmer);
	}

	public void teilnehmerAusschreiben(Mensch teilnehmer)
	{
		this.teilnehmer.remove(teilnehmer);
	}

	public String getBezeichnung()
	{
		return this.bezeichnung;
	}
	public Date getDatum()
	{
		return this.datum;
	}
	public long getZeit()
	{
		return this.zeit;
	}
	public String getOrt()
	{
		return this.ort;
	}
	public ArrayList<Mensch> getTeilnehmer()
	{
		return this.teilnehmer;
	}
}