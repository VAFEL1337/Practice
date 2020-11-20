import java.util.ArrayList;

public class s145 {
    public void s145() {
    RecordBook recordBook = new RecordBook();
    recordBook.addSession("Зимняя сессия");
    recordBook.exam("Летний экзамен");
    recordBook.offset("Осенний зачёт");

    }
}
class RecordBook{
   private Book book =new Book();

            public void addSession(String sess){
            book.addSession(sess);
        }
            public void exam(String ex){
            book.exam(ex);
        }
            public void offset(String offs){
            book.offset(offs);
        }
    class   Book{
        private ArrayList<String> session  = new ArrayList<String>();

        public void addSession(String sess){
           session.add(sess);
            System.out.println("Ваша сессия ПРОВАЛЕНА");
        }
        public void exam(String ex){
            session.add(ex);
            System.out.println("Ваш экзамен ПРОВАЛЕН");
        }
        public void offset(String offs){
            session.add(offs);
            System.out.println("Ваш зачёт ПРОВАЛЕН");
                 }

            }

        }