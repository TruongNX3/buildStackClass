public class numberStackTest {
    public static void main(String[] args) {
        NumbersStack numbersStack = new NumbersStack();

        numbersStack.push(10);
        testThat(numbersStack.getCount()==0);

        numbersStack.push(20);
        testThat(numbersStack.getCount()==1);

        numbersStack.push(30);
        testThat(numbersStack.getCount()==2);

        testThat(numbersStack.pop()==20);

        numbersStack.push(200);
        testThat(numbersStack.getCount()==3);
        testThat(numbersStack.pop()==200);

    }

    public static void testThat(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
