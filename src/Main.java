public class Main {
    public static void main(String[] args) {
        // Задание 4
        var friend = 19;
        friend = friend + 2;
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        var boxing1 = 78.2;
        var boxing2 = 82.7;
        var boxing = boxing1 + boxing2;
        System.out.println("Общий вес боксеров " + boxing + " кг!");
        var boxingBlack = boxing2 - boxing1;
        System.out.println("Разница в весе боксеров " + boxingBlack + " кг!");

        // Задание 7
        System.out.println("Разница в весе боксеров " + (boxing2 - boxing1) + " кг!");
        System.out.println("Разница в весе боксеров " + (boxing2 % boxing1) + " кг!");

        // Задание 8
        var hours = 640;
        var hoursDay = 8;
        var total = hours / hoursDay;
        System.out.println("Всего работников в компании - " + total + " человек");
        total = total + 94;
        hours = total * hoursDay;
        System.out.println("Если в компании работает " + total + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
    }
}