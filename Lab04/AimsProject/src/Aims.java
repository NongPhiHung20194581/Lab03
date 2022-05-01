
public class Aims {

	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Encanto");

		dvd1.setCategory("Animation");
		dvd1.setCost(35.14f);
		dvd1.setDirector("Byron Howard, Jared Bush");
		dvd1.setLength(97);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Venom");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(30.25f);
		dvd2.setDirector("Ruben Fleischer");
		dvd2.setLength(121);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Soul");
		dvd3.setCategory("Animation");
		dvd3.setCost(25.46f);
		dvd3.setDirector("Pete Docter");
		dvd3.setLength(90);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Kungfu Panda");

		dvd4.setCategory("Animation");
		dvd4.setCost(26.65f);
		dvd4.setDirector("Alessandro Carloni");
		dvd4.setLength(128);

		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Peter Rabit");

		dvd5.setCategory("Animation");
		dvd5.setCost(30.45f);
		dvd5.setDirector("Roger Allers");
		dvd5.setLength(88);

		DigitalVideoDisc dvd[] = { dvd1, dvd2, dvd3 };

		anOrder.addDigitalVideoDisc(dvd);
		anOrder.addDigitalVideoDisc(dvd4, dvd5);
		anOrder.prin();

	}
}
