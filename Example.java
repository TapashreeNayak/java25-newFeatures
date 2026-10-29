import module java.base;
int var =10;
void main(String[] args) {
  //  System.out.println("Hello, World!");
  IO.print("Hello, World! Value of var is: " + var);
  IO.println("Enter value  of var is: ");
  String input = IO.readln();
  var = Integer.parseInt(input);
  IO.println("Your Value of var is: " + var);


  List<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(2);
  IO.println("Value in list: " );
  list.forEach((value) -> {
    IO.println( value);
  });   

}