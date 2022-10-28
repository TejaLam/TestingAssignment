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
    }
