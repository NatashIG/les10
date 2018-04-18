package by.epam.library.main;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.Library;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.LibraryService;
import by.epam.library.service.find.FindByPrice;
import by.epam.library.service.find.Findable;
import by.epam.library.view.PrintAsList;
import by.epam.library.view.Printable;
import by.epam.library.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		
		myLibrary.add(new Book("Java", 300));
		myLibrary.add(new Book("C++", 250));
		myLibrary.add(new Magazine(40, 50));
		
		//myLibrary.remove(new Book("Java", 300));
		
		Findable matcher = new FindByPrice(300);
		
		LibraryService libService = new LibraryService();
		
		List<PrintedEdition> lists = libService.find(myLibrary, matcher);
		
		System.out.println(lists.size());

		ViewAction.print(new PrintAsList(), lists);
	}
	
	
	

}
