package DemoPackforCheckcom;
import com.univ.*;
import com.univ.Accounts;
import com.univ.Book;


public class univ {
    public static void main(String[] args) {
       Accadamics a=new Accadamics();
       a.display();
       Account acc=new Account();
       acc.StudentFees();
       Accounts acc1=new Accounts();
       acc1.accountDetails();
        Library l=new Library();
        l.books();
        LibraryAccount l1=new LibraryAccount();
        l1.account();
        com.univ.library.Book b1=new com.univ.library.Book();
        b1.book();
        Book b2=new Book();
        b2.booksforstudent();

    }
}
