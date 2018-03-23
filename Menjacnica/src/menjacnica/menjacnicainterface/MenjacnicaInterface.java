package menjacnica.menjacnicainterface;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterface {
	public void dodajKursValute(Valuta v, Kurs k);
	public void obrisiKursNaDan(Valuta v, GregorianCalendar datum);
	public Kurs vratiKursNaDan(Valuta v, GregorianCalendar datum);
}
