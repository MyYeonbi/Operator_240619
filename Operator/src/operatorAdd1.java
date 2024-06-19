public class operatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

         a = a + 1;
        System.out.println("a = " +a); //1

        a = a + 1;
        System.out.println("a = " +a); //2

        //증감 연산자
        ++a; //a = a + 1;
        System.out.println("a = "+ a);//3
        ++a; //a = a + 1;
        System.out.println("a = " +a);//4

        --a;
        System.out.println("a = " +a); //3

        //++a : 값을 먼저 증가 시킴. 증감 연산자를 피연산자 앞에 둘 수 있다.
        //이것을 앞에 있다고 해서 전위(prefix)증감 연산자라 한다.

        //a++ : 증감 연산자를 피연산자 뒤에 둘수 있다. 이것을 뒤에 있다고 해서 후위(postfix) 증감연산자라 한다.


    }
}
