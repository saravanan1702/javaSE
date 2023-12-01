//using double star it means documentation
/** @author Saravanan
 * @version  2.0
 * @since 2025
 * */

package javadoc;

/** @author SARAVANAN
 *
 * class for library books
 * */
public class Book {

    /** @value 10 default value
      */
    static  int val=10;


    /**
     *
     * @param s Book Name
     * */
    public Book(String s){

    }
    /**
     * Issue a Book to a Student
     * @param roll roll No of the Student
     * @throws Exception if book isn't available throws exception*/
    public void issue(int roll)throws Exception{

    }

    /**
     * Check book is Available
     * @param str Book Name
     * @return  if book is available return true else false*/
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id  return book id
     * @return return book name*/
    public String getName(int id){
        return "";
    }
}
