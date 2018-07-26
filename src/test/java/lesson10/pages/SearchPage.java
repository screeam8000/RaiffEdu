package lesson10.pages;

public abstract class SearchPage extends AbstractPage {
    public abstract void search (String query);
    public abstract boolean isSearchResultAvailable();
}

