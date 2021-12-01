package chengshu.test1;

/**
 * @author chengshu1998
 * @date 2021/11/30 - 11:38
 **/
public class test1 {
    public static void main(String[] args) {
        Base base = new Sub();
        base.add(1, 2, 3);
    }
}

class Base{
    public void add(int a, int... arr){
        System.out.println("base");
    }
}

class Sub extends Base{
    public void add(int a, int[] arr){
        System.out.println("sub");
    }
}