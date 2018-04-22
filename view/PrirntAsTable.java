package by.epam.library.view;

import java.util.List;
import by.epam.library.entity.PrintedEdition;

public class PrirntAsTable implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {

		System.out.println("Table A - Found items");
		System.out.println("-----------------------------------------------");
		System.out.println("Title   \tPrice\tAuthor\tPublished year");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < units.size(); i++) {
			System.out.println(units.get(i).getTitle() + "\t" + units.get(i).getPrice() + "\t" + units.get(i).getAuthor() + "\t" + units.get(i).getPublishedYear());
			System.out.println("-----------------------------------------------");
		}
	}
}
