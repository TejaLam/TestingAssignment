import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
 public class urinalsTest {

        @Test
        void testForWrongInput() {
            Implementation implement = new Implementation();
            boolean i = implement.goodString("Teja Lam");
            System.out.println("====== TEJA LAM == TEST ONE EXECUTED =======");
            Assertions.assertEquals(false,i);
        }

     @Test
     void testCountUrinalsBeforeAddingCode() {
         Implementation implement = new Implementation();
         Integer i = implement.countUrinals("10000");
         System.out.println("====== TEJA LAM == TEST TWO EXECUTED =======");
         Assertions.assertEquals(2,i);
     }

     @Test
     void testOpenFileIntoSystem(){
         Implementation implement = new Implementation();
         System.out.println("====== TEJA LAM == TEST THREE EXECUTED =======");
         Assertions.assertEquals(false,implement.openFile());
     }


    }
