package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.menjacnicainterface.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {
	private LinkedList<Valuta> valute;

	@Override
	public void dodajKursValute(Valuta v, Kurs k) {
		if (!valute.contains(v)) return;

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v)) {
				valute.get(i).getKursevi().addFirst(k);
				break;
			}
		}
	}

	@Override
	public void obrisiKursNaDan(Valuta v, GregorianCalendar datum) {
		if (!valute.contains(v)) return;

		Valuta val = new Valuta();
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v)) {
				val = valute.get(i);
				break;
			}
		}

		for (int i = 0; i < val.getKursevi().size(); i++) {
			if (val.getKursevi().get(i).getDatum().equals(datum)) {
				val.getKursevi().remove(i);
				break;
			}
		}
	}

	@Override
	public Kurs vratiKursNaDan(Valuta v, GregorianCalendar datum) {
		if (!valute.contains(v)) return null;

		Valuta val = new Valuta();
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(val)) {
				val = valute.get(i);
				break;
			}
		}

		for (int i = 0; i < val.getKursevi().size(); i++) {
			if (val.getKursevi().get(i).getDatum().equals(datum)) {
				return val.getKursevi().get(i);
			}
		}
		return null;
	}
}
