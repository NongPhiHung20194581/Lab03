import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public Order() {
		for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
			itemOrdered[i] = new DigitalVideoDisc(null, null, null, 0, 0);
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvd) {
		for (int i = 0; i < dvd.length; i++) {
			if (this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
				this.itemOrdered[qtyOrdered].setTitle(dvd[i].getTitle());
				this.itemOrdered[qtyOrdered].setCategory(dvd[i].getCategory());
				this.itemOrdered[qtyOrdered].setDirector(dvd[i].getDirector());
				this.itemOrdered[qtyOrdered].setLength(dvd[i].getLength());
				this.itemOrdered[qtyOrdered].setCost(dvd[i].getCost());
				this.qtyOrdered += 1;
			} else if (this.getQtyOrdered() >= MAX_NUMBER_ORDERED) {
				System.out.println("Max number orders reacched!");
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
			this.itemOrdered[qtyOrdered].setTitle(dvd1.getTitle());
			this.itemOrdered[qtyOrdered].setCategory(dvd1.getCategory());
			this.itemOrdered[qtyOrdered].setDirector(dvd1.getDirector());
			this.itemOrdered[qtyOrdered].setLength(dvd1.getLength());
			this.itemOrdered[qtyOrdered].setCost(dvd1.getCost());
			this.qtyOrdered += 1;
		} else if (this.getQtyOrdered() >= MAX_NUMBER_ORDERED) {
			System.out.println("Can't add" + dvd1.getTitle());
			System.out.println("Can't add" + dvd2.getTitle());
		}
		if (this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
			this.itemOrdered[qtyOrdered].setTitle(dvd2.getTitle());
			this.itemOrdered[qtyOrdered].setCategory(dvd2.getCategory());
			this.itemOrdered[qtyOrdered].setDirector(dvd2.getDirector());
			this.itemOrdered[qtyOrdered].setLength(dvd2.getLength());
			this.itemOrdered[qtyOrdered].setCost(dvd2.getCost());
			this.qtyOrdered += 1;
		} else if (this.getQtyOrdered() >= MAX_NUMBER_ORDERED) {
			System.out.println("Can't add" + dvd2.getTitle());
		}

	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.itemOrdered[i].getCategory() == disc.getCategory() &&
					this.itemOrdered[i].getCost() == disc.getCost() &&
					this.itemOrdered[i].getDirector() == disc.getDirector() &&
					this.itemOrdered[i].getLength() == disc.getLength() &&
					this.itemOrdered[i].getTitle() == disc.getTitle()) {
				for (int j = i; j < this.qtyOrdered - 1; j++) {
					this.itemOrdered[j] = this.itemOrdered[j + 1];
				}
				this.itemOrdered[this.qtyOrdered - 1] = null;
				this.qtyOrdered -= 1;
			}
		}
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}

	public void prin() {
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat month = new SimpleDateFormat("MM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		Date date = new Date();

		MyDate today = new MyDate(day.format(date), month.format(date), Integer.parseInt(year.format(date)));

		System.out.println("Date: " + today.print());
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(
					(i + 1) + ". DVD - " + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCategory() + " - " +
							itemOrdered[i].getDirector() + " - " + itemOrdered[i].getLength() + ": "
							+ itemOrdered[i].getCost());
		}
		System.out.println("Total cost: " + totalCost());

	}
}
