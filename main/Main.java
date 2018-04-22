package by.epam.library.main;

import java.util.List;
import by.epam.library.entity.Book;
import by.epam.library.entity.Library;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.LibraryService;
import by.epam.library.service.find.FindByAuthor;
import by.epam.library.service.find.FindByPrice;
import by.epam.library.service.find.Findable;
import by.epam.library.view.PrintAsList;
import by.epam.library.view.Printable;
import by.epam.library.view.PrirntAsTable;
import by.epam.library.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Thinking in Java", 45, "Ekkel", 2016));
		myLibrary.add(new Book("A Tour of C++", 39, "Stroustrup", 1996));
		myLibrary.add(new Magazine("Escape", 4, 50));
		myLibrary.add(new Book("War and piece", 25, "Tolstoy", 1986));
		myLibrary.add(new Book("Romeo and Juliette", 40, "Shakespeare", 2005));
		myLibrary.add(new Book("Dark alleys", 25, "Bunin", 2010));
		myLibrary.add(new Book("The Karamazovs", 33, "Dostoevsky", 2000));
		myLibrary.add(new Book("White nights", 12, "Dostoevsky", 1998));
		myLibrary.add(new Book("Anna Karenina", 29, "Dostoevsky", 2008));

		myLibrary.remove(new Book("Java", 45, "Java Author", 2016));

		Findable matcher = new FindByPrice(25);
		Findable matcher1 = new FindByAuthor("Dostoevsky");

		LibraryService libService = new LibraryService();

		List<PrintedEdition> lists = libService.find(myLibrary, matcher);
		List<PrintedEdition> lists1 = libService.find(myLibrary, matcher1);

		System.out.println("Found by required price: " + lists.size());

		ViewAction.print(new PrintAsList(), lists);
		ViewAction.print(new PrirntAsTable(), lists);

		System.out.println("Found by required author: " + lists1.size());

		ViewAction.print(new PrintAsList(), lists1);
		ViewAction.print(new PrirntAsTable(), lists1);
	}
}
