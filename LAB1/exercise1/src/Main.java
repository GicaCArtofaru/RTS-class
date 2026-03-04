//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    System.out.println("write two numbers\n");
    Scanner sc= new Scanner(System.in);
    int number1=sc.nextInt();
    int number2=sc.nextInt();
    System.out.println("write operation");
    String op=sc.next();
    switch (op){
        case "+"->System.out.println("Result: "+ (number1+number2));
        case "-"->System.out.println("Substraction" + (number1-number2));
        case "/"->{if(number2==0){System.out.println("Can't divide by 0 dummy )");} else { System.out.println("Division " + (number1/number2));}}
        case "x"->System.out.println("Multiplication "+(number1*number2));
    }
}
