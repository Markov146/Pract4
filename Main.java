import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        String[] ingridients = new String[]{"Лаваш","Лук","Курица","Морковь","Огурцы","Перец","Капуста"};
        int[] prices = new int[]{15,30,60,35,40,25,20};
        int totalPrice;
        printIng();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в шаурмичную");
        int productNumber = scanner.nextInt();;
        while (true) {
                if (productNumber == 1){
                    printAllIng(ingridients,prices);
                } else if (productNumber == 2) {
                    ingridients = addIngr(scanner,ingridients);
                } else if (productNumber == 3) {
                    printPrice(ingridients,prices);
                }else if (productNumber == 4){
                       System.out.println("Приятного аппетита!!");
                       System.exit(0);
                }
                System.out.println("Выберите действие: ");
                productNumber = scanner.nextInt();;
        }
    }


    private static void printAllIng(String[] ingridients,  int[] prices) {
        System.out.println("Наши ингредиенты:");
       for (int i = 0;i< ingridients.length;i++){

           System.out.println((i + 1) + ". " +ingridients[i] + " - " + prices[i]);
       }
    }
    private static String[] addIngr( Scanner scanner,String[] ingridients) {
        System.out.println("Введите номер ингредиента:" );
        String input = scanner.next();
        String[] ress = new String[ingridients.length +1];
        for (int i = 0;i<ingridients.length;i++){
            ress[i] = ingridients[i];
        }

        return ress;
    }
    private static void printPrice(String[] ingridients,int[] prices) {
        int totalPrice = prices[ress] * ingridients;
    }
    public static void printIng(){
        System.out.println("Меню:\n 1.Вывести все добавляемые ингредиенты и их стоимость \n2.Добавить ингредиент \n3.Итог \n4.Выход");
    }
}
