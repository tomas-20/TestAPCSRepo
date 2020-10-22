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
  public static String arrToString(int[] arr) {
    int length = arr.length;
    int last = length - 1;
    String output = "{";
    for (int i = 0; i < length; i ++) {
      output += arr[i];
      if (i != last) {
        output += ", ";
      }
    }
    return output + '}';
  }
  public static String arrToString(String[] arr) {
    int length = arr.length;
    int last = length - 1;
    String output = "{";
    for (int i = 0; i < length; i ++) {
      output += arr[i];
      if (i != last) {
        output += ", ";
      }
    }
    return output + '}';
  }
  public static String arrayDeepToString(int[][] arr) {
    int length = arr.length;
    String[] things = new String[length];
    for (int i = 0; i < length; i ++) {
      things[i] = arrToString(arr[i]);
    }
    return arrToString(things);
  }
  public static int random(int n) {
    return (int) (Math.random() * n);
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int mult = maxValue + 1;
    int[][] output = new int[rows][cols];
    for (int i = 0; i < rows; i ++) {
      for (int j = 0; j < cols; j ++) {
        output[i][j] = random(mult);
      }
    }
    return output;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int mult = maxValue + 1;
    int colMult = cols + 1;
    int[][] output = new int[rows][];
    for (int i = 0; i < rows; i ++) {
      int colLength = random(colMult);
      output[i] = new int[colMult];
      for (int j = 0; j < colLength; j ++) {
        output[i][j] = random(mult);
      }
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
    System.out.println(arrayDeepToString(create2DArrayRandomized(6, 4, 4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)));
  }
}
