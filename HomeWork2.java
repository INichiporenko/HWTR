public class HomeWork2 {
    public static void main (String[] args) {
        int LohgWallWidth;
        LohgWallWidth = 3;

        int LongWallHeight;
        LongWallHeight = 2;

        int ShortWallWidth;
        ShortWallWidth = 2;

        int ShortWallHeight;
        ShortWallHeight = 2;

        System.out.println ("Площа великоі стіни");
        int result = LohgWallWidth * LongWallHeight;
        System.out.println(LohgWallWidth + " * " + LongWallHeight + " = " + result);

        System.out.println ("Площа короткоі стіни");
        int result2 = ShortWallWidth * ShortWallHeight;
        System.out.println(ShortWallWidth + " * " + ShortWallHeight + " = " + result2);

        System.out.println ("Площа кімнати");
        int result3 = ((LohgWallWidth * LongWallHeight) + (ShortWallWidth * ShortWallHeight)) * 2;
        System.out.println(((ShortWallWidth + " * " + ShortWallHeight) + " + " + (LohgWallWidth + " * " + LongWallHeight)) + " * " + 2 + " = " + result3);

        double WindowHeight;
        WindowHeight = 1.0;

        double WindowWidth;
        WindowWidth = 0.5;

        double DoorHeight;
        DoorHeight = 1.8;

        double DoorWidth;
        DoorWidth = 0.5;

        System.out.println ("Площа вікна");
        double result4 = WindowHeight * WindowWidth;
        System.out.println(WindowHeight + " * " + WindowWidth + " = " + result4);

        System.out.println ("Площа двері");
        double result5 = DoorHeight * DoorWidth;
        System.out.println(DoorHeight + " * " + DoorWidth + " = " + result5);

        System.out.println ("Площа кімнати з урахування вікна і двері");
        double result6 = result3 - (result4 + result5);
        System.out.println(result3 + " - " + (result4 + " + " + result5) + " = " + result6);

        double WallPaperWidth;
        WallPaperWidth = 1.0;

        double WallPaperHeight;
        WallPaperHeight = 6;

        System.out.println ("Площа 1 рулону шпалери");
        double result7 = WallPaperWidth * WallPaperHeight;
        System.out.println(WallPaperWidth + " * " + WallPaperHeight + " = " + result7);

        System.out.println ("Необхідна кількість рулонів шпалер");
        double result8 = result6 / result7;
        System.out.println(result6 + " / " + result7 + " = " + result8);



    }
}
