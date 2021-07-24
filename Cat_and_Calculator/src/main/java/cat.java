import java.util.Scanner;

public class cat {
    private String name;
    private String phoneNum;
    private int age;

    public cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("аньён!");

        cat myCat = new cat("Барсик");
        System.out.println(myCat.name);
        String name = myCat.getName();
        System.out.println(name);
        myCat.consoleNameInput();
        System.out.println(myCat.name);
        myCat.InputNum();
        myCat.consolePhoneOut();
        myCat.inputAge();

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void consoleNameInput() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        this.name = str;
    }
    public  void  consolePhoneOut(){
        System.out.println(this.phoneNum);
    }

    public void InputNum() {
        Scanner scanner= new Scanner(System.in);

        String phoneNum = scanner.nextLine();
        this.phoneNum = phoneNum;
    }

    public void inputAge() {
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        try{
            this.age = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            System.out.println();
        }

    }
    public void checkAge(){
        String  state;
        if (this.age< 4)
            state= "어린 고양이";
        if(this.age > 3 && this.age < 6)
            state= "평범한 고양이";
        if (this.age > 5)
            state= "늙은 고양이";
    }
}



