package interfete;

public interface Subject {
	void adaugaObserver(Observer o);

	void stergeObserver(Observer o);

	void notifica(String mesaj);
}
