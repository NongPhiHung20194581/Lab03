
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private Book itemOrdered[] = new Book[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public Order() {
		for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
			itemOrdered[i] = new Book(null, null, null, 0, 0, 0);
		}
	}

	public void addBook(Book bk) {
		if (this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
			this.itemOrdered[qtyOrdered].setTitle(bk.getTitle());
			this.itemOrdered[qtyOrdered].setType(bk.getType());
			this.itemOrdered[qtyOrdered].setAuthor(bk.getAuthor());
			this.itemOrdered[qtyOrdered].setPageNumber(bk.getPageNumber());
			this.itemOrdered[qtyOrdered].setVolume(bk.getVolume());
			this.itemOrdered[qtyOrdered].setCost(bk.getCost());
			this.qtyOrdered += 1;
		} else {
			System.out.println("Max numbers reached !!!");
		}
	}

	public void removeBook(Book bk) {
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.itemOrdered[i].getType() == bk.getType() &&
					this.itemOrdered[i].getCost() == bk.getCost() &&
					this.itemOrdered[i].getAuthor() == bk.getAuthor() &&
					this.itemOrdered[i].getPageNumber() == bk.getPageNumber() &&
					this.itemOrdered[i].getVolume() == bk.getVolume() &&
					this.itemOrdered[i].getTitle() == bk.getTitle()) {
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

}
