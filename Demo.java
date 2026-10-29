

void main(){
//    System.out.println("Hello, World!");
    IO.println("Hello, World!");
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter your name: ");
//    String name = scanner.nextLine();
//    System.out.println("Hello, " + name + "!");
    IO.print("Enter your name: ");
    String name = IO.readln();
    IO.println("Hello, " + name + "!");
}