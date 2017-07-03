/**
 * Created by zemoso on 3/7/17.
 */
public class Innerclass {
    class In1
    {
        public In1(String s)
        {
            System.out.println("This is a Innerclass"+s);
        }
    }
}
class Innerclass2 extends Innerclass{
    class In2 extends Innerclass.In1
    {
        public In2(String s) {
            super(s);
        }
    }
}