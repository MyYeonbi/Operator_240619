public class operatorAdd2 {
    public static void main(String[] args) {
        //++a : 값을 먼저 증가 시킴. 증감 연산자를 피연산자 앞에 둘 수 있다.
        //이것을 앞에 있다고 해서 전위(prefix)증감 연산자라 한다.

        //a++ : 증감 연산자를 피연산자 뒤에 둘수 있다. 이것을 뒤에 있다고 해서 후위(postfix) 증감연산자라 한다.


        //전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " +b);

        //후위 증감 연산자 사용 예
        a = 1; //a값을 다시 1로 지정
        b = 0; //b값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴.
        System.out.println("a = " + a + ", b = " + b); //결과 : a =2 , b = 1

    }
}
