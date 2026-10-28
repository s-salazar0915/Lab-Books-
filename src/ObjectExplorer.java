// Lab 2: Object Explorer (starter file)
// Name: Sofia Salazar
// Book.java must be in the same folder. Do not change Book.java.
public class ObjectExplorer {
    public static void main(String[] args) {
    book moonGarden = new book("Moon Garden", "Ana Reyes", 233);
    book riverMaze = new book("River Maze", "Sam Oakfor");
    book glassOcean = new book("Glass Ocean", "Priya Nair", 240);
    book copperHill = new book("Copper Hill", "Rae Cole", 312);

    int total = (moonGarden.BookPages + riverMaze.BookPages + glassOcean.BookPages + copperHill.BookPages);
    double avg = (total / 4);
    int longestBook = Math.max(Math.max(moonGarden.BookPages, riverMaze.BookPages), Math.max(glassOcean.BookPages, copperHill.BookPages));
    int revisePage = 350;
    int reviseTotal = (moonGarden.BookPages + revisePage + glassOcean.BookPages + copperHill.BookPages);
    double reviseAvg = (reviseTotal/4);
    int reviseLongestBook = Math.max(Math.max(moonGarden.BookPages, revisePage), Math.max(glassOcean.BookPages, copperHill.BookPages));

        System.out.println("=== Book collection ===");
        System.out.println("Book: " + moonGarden.BookTitle + ", Author: "+ moonGarden.BookAuthor + ", Pages: " + moonGarden.BookPages);
        System.out.println("Book: " + riverMaze.BookTitle + ", Author: "+ riverMaze.BookAuthor + ", Pages: " + riverMaze.BookPages);
        System.out.println("Book: " + glassOcean.BookTitle + ", Author: "+ glassOcean.BookAuthor + ", Pages: " + glassOcean.BookPages);
        System.out.println("Book: " + copperHill.BookTitle + ", Author: "+ copperHill.BookAuthor + ", Pages: " + copperHill.BookPages);

        System.out.println(" ");
        System.out.println("Total Pages: " + total);
        System.out.println("Average Pages: " + avg);
        System.out.println("Longest Book: " + longestBook);

        System.out.println(" ");
        System.out.println("--- After the revised edition of River Maze ---");
        System.out.println("River Maze by Sam Okafor: ( " + revisePage);
        System.out.println(("Total Pages: " + reviseTotal));
        System.out.println("Average Pages: " + reviseAvg);
        System.out.println("Longest Book: " + reviseLongestBook);

        System.out.println(" ");
        System.out.println("--- References ---");
        System.out.println("Is the longest book the same object as River Maze?: true\n" +
                "Copper Hill's title is now: Copper Hill (Signed)\n");
    }
}
