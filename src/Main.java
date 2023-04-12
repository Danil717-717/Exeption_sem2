// обработайте возможные исклюительные ситуации.
//"Битые" значения в исхоном массиве считайте нулями.
//Можно внести в код правки, которые считаете необходимыми.

public class Main {

    public static void main(String[] args) {

    }

    public static int sum2d(String[] [] arr){
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum = Math.addExact(sum, val);
                }
            }
        }catch (NullPointerException e){
            System.out.println("Массив не должен ровняться null");
        }catch (NumberFormatException e){
            System.out.println("не получилось преобразовать стороку в целое число");
        }catch (ArithmeticException e){
            System.out.println("Слишком большое значение для int");
        }
        return sum;
    }

    public static int sum2dd(String[] [] arr){
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {           //NullPointerException
                for (int j = 0; j < 5; j++) {                //ArrayIndexOutOfBoundsException
                    int val = Integer.parseInt(arr[i][j]);  //NumberFormatException
                    sum += val;
                }
            }
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

}