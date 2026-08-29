public class FunctionDemo {
    public static void main(String[] args) {
        helloWorld();
        double result = sum(5,4);
        System.out.println("sum="+result);
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }
}
