//DAL
package data;
import java.util.ArrayList;
import java.util.List;

public class BookDataAccess {
    private List<Book> books;

    public BookDataAccess() {
        books = new ArrayList<>();
         books.add(new Book("Java Programming", "John Doe", "978-0134685991"));
         books.add(new Book("Advanced Java", "Jane Smith", "978-0134686096"));
         books.add(new Book("Python Programming", "Alice Johnson", "978-0135166307"));
         books.add(new Book("Data Structures and Algorithms", "Michael Brown", "978-0133354135"));
         books.add(new Book("Introduction to Machine Learning", "Sarah Davis", "978-0134804620"));
         books.add(new Book("Web Development with Node.js", "Chris Wilson", "978-1491921979"));
         books.add(new Book("C++ Primer", "Stanley Lippman", "978-0321992789"));
         books.add(new Book("Effective Java", "Joshua Bloch", "978-0134686097"));
         books.add(new Book("Learning Python", "Mark Lutz", "978-1449356860"));
         books.add(new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell", "978-0134610996"));
         books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059"));
         books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "978-0136083238"));
         books.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", "978-0201633610"));
         books.add(new Book("The Mythical Man-Month: Essays on Software Engineering", "Frederick P. Brooks Jr.", "978-0201833625"));
         books.add(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", "978-0201485677"));
         books.add(new Book("Head First Java", "Kathy Sierra", "978-0596009205"));
         books.add(new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606"));
         books.add(new Book("You Don't Know JS: Scope & Closures", "Kyle Simpson", "978-1491904193"));
         books.add(new Book("Learning JavaScript Data Structures and Algorithms", "Loiane Groner", "978-1785888960"));
         books.add(new Book("The Clean Coder: A Code of Conduct for Professional Programmers", "Robert C. Martin", "978-0136083238"));
         books.add(new Book("Understanding Machine Learning: From Theory to Algorithms", "Shai Shalev-Shwartz", "978-1108455984"));
         books.add(new Book("Computer Networking: A Top-Down Approach", "James Kurose", "978-0135155666"));
         books.add(new Book("Database System Concepts", "Abraham Silberschatz", "978-0078022159"));
         books.add(new Book("Introduction to the Theory of Computation", "Michael Sipser", "978-1133187790"));
         books.add(new Book("Operating System Concepts", "Abraham Silberschatz", "978-1119471159"));
         books.add(new Book("Artificial Intelligence for Robotics: Build intelligent robots that perform human tasks using AI techniques and Python libraries.", "Francisco J. Valverde," ,  "978-1800562032")); 
         books.add(new Book("Computer Vision: Algorithms and Applications","Richard Szeliski","978-1848829343")); 
         books.add(new Book("Programming in Haskell","Graham Hutton","978-1108434102")); 
         books.add(new Book("Introduction to Quantum Computing","Philip Kaye","978-1770492950")); 
         books.add(new Book("Machine Learning Yearning","Andrew Ng","979-1095135500")); 
         books.add(new Book("Deep Learning","Ian Goodfellow","9780262035613")); 
         books.add(new Book("Hands-On Machine Learning with Scikit-Learn, Keras, and TensorFlow","Aurélien Géron","9781492032649")); 
         books.add(new Book("Natural Language Processing with Python","Steven Bird","9780596009298")); 
         books.add(new Book("The Art of Computer Programming","Donald E. Knuth","9780201896831")); 
         books.add(new Book("Computer Graphics: Principles and Practice","John F. Hughes","9780323777841")); 
         books.add(new Book("Introduction to the Theory of Computation","Michael Sipser","9781133187790")); 
         books.add(new Book("Software Engineering at Google","Titania McGrath","9798610052444")); 
         books.add(new Book("The Art of Electronics","Paul Horowitz","9798610052444")); 
         books.add(new Book("Digital Design and Computer Architecture","David Harris","9780123944245")); 
         books.add(new Book("Modern Operating Systems","Andrew S. Tanenbaum","9780136006633")); 
         books.add(new Book("Computer Architecture: A Quantitative Approach","John L. Hennessy","9780128119051")); 
         books.add(new Book("Introduction to Information Retrieval","Christopher D. Manning","9780262035675")); 
         books.add(new Book("Artificial Intelligence: Foundations of Computational Agents","David L. Poole","9798601625973")); 
         books.add(new Book("The Algorithm Design Manual","Steven S. Skiena","9783030542552")); 
         books.add(new Book("Elements of Programming Interviews in Python: The Insiders' Guide","Adnan Aziz," ,  "9798610052444")); 
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;  // Book not found
    }
}

