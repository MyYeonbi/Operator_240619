public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기
        String result1 = "hello" + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기 1
        String result3 = "a + b = " + 10; //문자열에 숫자열 더하기 => 숫자가 문자열로 바뀐다.
        System.out.println(result3);

        //문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = " + num;
        System.out.println(result4);

        //문자열에 더하는 것은 모두 문제열이 된다.
    }
}
