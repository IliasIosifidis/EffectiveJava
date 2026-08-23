package chapter8_Methods.varargs;

public class Simple {
  // Simple use of Varargs
  static int sum (int... args){
    int sum = 0;
    for (int arg : args){
      sum += arg;
    }
    return sum;
  }

  // The wrong way to use varargs to pass one or more arguments
  static int min(int...args){
    if (args.length == 0){
      throw new IllegalArgumentException("too few args");
    }
    int min = args[0];
    for (int i=1; i < args.length; i++){
      if (args[i] < min){
        min = args[i];
      }
    }
    return min;
  }

  // The right wat to use varargs to pass one or more arguments
  static int min(int firstArg, int ... remainingArgs){
    int min = firstArg;
    for (int arg : remainingArgs){
      if (arg < min){
        min = arg;
      }
    }
    return min;
  }

}
