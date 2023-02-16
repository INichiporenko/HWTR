public class HomeWork0902 {
     static double calculateArea (double diametr) {
         double area = Math.round(Math.PI * (diametr * diametr/4));
         return area;
    }

    static double calculatrPizzaCalories (double diametr, double calorieslnSquareSm) {
         double calories = calculateArea(diametr) * calorieslnSquareSm;
         return calories;
    }

    public static void main(String[] args) {
         double diametr1 = 20;
         double diametr2 = 25;
         double calorieslnSquareSm = 10;

         double resArea1 = calculateArea(diametr1);
         System.out.println("Площадь пиццы диаментром 20 см = " + resArea1);

         double resCalories1 = calculatrPizzaCalories(diametr1, calorieslnSquareSm);
         System.out.println("Количество калорий в пицце диаментром 20 см = " + resCalories1);

         double resArea2 = calculateArea(diametr2);
         System.out.println("Площадь пиццы диаментром 25 см = " + resArea2);

         double resCalories2 = calculatrPizzaCalories(diametr2, calorieslnSquareSm);
         System.out.println("Количество калорий в пицце диаментром 25 см = " + resCalories2);

         double razCalories = resCalories2 - resCalories1;
         System.out.println("Разница калорий между двумя пиццами = " + razCalories);



    }
}