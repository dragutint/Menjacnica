package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.menjacnicainterface.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {
	private LinkedList<Valuta> valute;

	@Override
	public void dodajKursValute(Valuta v, Kurs k) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v)) {
				valute.get(i).getKursevi().addLast(k);
				break;
			}
		}
	}

	@Override
	public void obrisiKursNaDan(Valuta v, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						valute.get(i).getKursevi().remove(j);
						return;
					}
				}
			}
		}
	}

	@Override
	public Kurs vratiKursNaDan(Valuta v, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v)) {
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		return null;
	}

}
