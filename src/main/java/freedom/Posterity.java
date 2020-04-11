package freedom;

import com.kingdom.Hello;

public class Posterity extends Hello {

    public static void main(String[] args) {
        new Posterity().foo();
    }
     void foo() {
        System.out.println("this is posterity.");
    }
}
