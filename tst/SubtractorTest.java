public class SubtractorTest {
   public void testSubract() {
     Subtractor subtractor = new Subtractor();
     int result = subtractor.subtract(5,2);
     assert(result==3);
   }
}
