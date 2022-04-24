
public class Aims {

	public static void main(String[] args) {
		Order anOrder = new Order();
		Book bk1 = new Book("Sherlock Holmes");
		bk1.setType("Detective and Mystery");
		bk1.setCost(29.45f);
		bk1.setVolume(1);
		bk1.setAuthor("Sir Arthur Conan Doyle");
		bk1.setPageNumber(334);

		anOrder.addBook(bk1);

		Book bk2 = new Book("Sherlock Holmes");
		bk2.setType("Detective and Mystery");
		bk2.setCost(30.34f);
		bk2.setVolume(2);
		bk2.setAuthor("Sir Arthur Conan Doyle");
		bk2.setPageNumber(368);

		anOrder.addBook(bk2);

		Book bk3 = new Book("The Man Who Solved the Market");
		bk3.setType("Science");
		bk3.setCost(20.12f);
		bk3.setVolume(1);
		bk3.setAuthor("Gregory Zuckerman");
		bk3.setPageNumber(90);

		anOrder.addBook(bk3);

		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());

	}
}
