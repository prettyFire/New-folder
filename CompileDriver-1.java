/**
 * Generics Compilation questions.
 * 
 * @author Nathan Sprague
 * @version V1, 8/2016
 * @author Shai Malik
 */
public class CompileDriver {

  public static void main(String[] args) {

    Pair<String, Integer> p1;
    Pair<String, Number> p2;
    Pair<Object, Object> p3;
    Pair<?, ?> p4;
    Pair<?, ? extends Number> p5;

    p1 = new Pair<String, Integer>("A", 7); //c
    int a = p1.getSecond();// c

    p1 = new Pair<Integer, Double>(23, 12.0);// n Type mismatch

    p2 = new Pair<String, Integer>("B", 8);//n Type mismatch

    p3 = new Pair<String, Integer>("C", 9);//n Type mismatch

    p4 = new Pair<String, String>("House", "Car");//c
    p4 = new Pair<String, Integer>("D", 10);//c

    Integer b = p4.getSecond();//n Type mismatch
    Integer c = (Integer) p4.getSecond();// c

    p5 = new Pair<String, String>("E", "G"); // n Type mismatch
    p5 = new Pair<String, Double>("E", 11.0);//c
    p5 = new Pair<String, Integer>("E", 11);//c

    Integer d = p4.getSecond();//n Type mismatch
    Integer e = (Integer) p4.getSecond();//c
  }

}