public class Demo {
  public static String printLoop(int n) {
    String output = "";
    for (int i = n; i > 0; i --) {
      int disp = n - i + 1;
      for (int j = 0; j < i; j ++) {
        output += disp;
      }
      output += '\n';
    }
    return output;
  }
  public static void main(String[] args) {
    int n;
    if (args.length == 0) {
      n = 5;
    }
    else {
      n = Integer.parseInt(args[0]);
    }
    System.out.print(printLoop(n));
  }
}
