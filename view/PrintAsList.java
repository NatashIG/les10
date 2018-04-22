package by.epam.library.view;

import java.util.List;
import by.epam.library.entity.PrintedEdition;

public class PrintAsList implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {
		System.out.println("List of found items: ");
		for (int i = 0; i < units.size(); i++) {
			System.out.println(units.get(i));
		}
	}
}
