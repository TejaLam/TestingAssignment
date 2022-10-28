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
     public void testOpenFile(){Implementation implementation = new Implementation();
         Assertions.assertEquals(1,implementation.openFile("src/urinal.dat"));
         System.out.println("=======Teja Lam==Test three executed========");
     }

     @Test
     public void testWriteToFile(){
         Implementation implementation = new Implementation();
         String optFile="src/rule.txt";
         Assertions.assertEquals(1,implementation.writeToFile(optFile,3));
         System.out.println("=======Teja Lam==Test four executed========");
        }
    }
