package rubrica12.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	
	public HomePage() {
		add(new BookmarkablePageLink<String>("AutorJava", AutorJava.class));
		add(new BookmarkablePageLink<String>("ListaAutor", ListaAutor.class));
		
		add(new BookmarkablePageLink<String>("LibroJava", LibroJava.class));
		add(new BookmarkablePageLink<String>("ListaLibro", ListaLibro.class));
	}
}