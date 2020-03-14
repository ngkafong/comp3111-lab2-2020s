package comp3111.lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for (int i = 0; i < chapters.length; i++)
			chapters[i] = "Chapter" + i;
	}
	
	
	public Book(String argument[]) {
		/* construct the object with an array of chapter names*/
		chapters = argument.clone();
	}
	
	public String getChapter(int i) {
		/* return the chapter by the given index*/
		/* "invalid chapter" if index <0 or >size */
		
		if (i < 0 || i >= chapters.length)
			return "invalid chapter";
		
		return chapters[i];
		
	}
	
	public String[] getChapters() {
		return chapters;
	}
}
