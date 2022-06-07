package Activities;




interface Addable{
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args){
        Addable addingNumbers1 = (num1,num2) -> num1+num2;
        Addable addingNumbers2 = (num1,num2) -> {
            return num1+num2;
        };

        System.out.println(addingNumbers1.add(5,10));
        System.out.println(addingNumbers1.add(10,10));
    }
}