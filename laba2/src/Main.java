import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.1

        Point point1 = createPoint(scanner, 1);
        Point point2 = createPoint(scanner, 2);
        Point point3 = createPoint(scanner, 3);

        System.out.println("Точки на плоскости:");
        System.out.println("Первая точка: " + point1);
        System.out.println("Вторая точка: " + point2);
        System.out.println("Третья точка: " + point3);

        // 1.3
        System.out.print("1.3 Введите ФИО первого человека: ");
        Name odin = createNameFromInput(scanner);

        System.out.print(" Введите ФИО второго: ");
        Name dva = createNameFromInput(scanner);

        System.out.print("Введите ФИО третьего : ");
        Name tri = createNameFromInput(scanner);

        System.out.println("Созданные имена:");
        System.out.println(odin);
        System.out.println(dva);
        System.out.println(tri);

        //2.1
        Point point1Start = new Point(1, 3);
        Point point1End = new Point(23, 8);
        Line line1 = new Line(point1Start, point1End);

        Point point2Start = new Point(5, 10); // начало линии 2
        Point point2End = new Point(25, 10); // конец линии 2
        Line line2 = new Line(point2Start, point2End);

        Line line3 = new Line(line1.getStart(), line2.getEnd());

        System.out.println("2.1 " +line1);
        System.out.println(line2);
        System.out.println(line3);

        // изменение 1 линии
        line1.setStart(new Point(2, 4));
        line1.setEnd(new Point(24, 9));


        // изменение 2 линии
        line2.setStart(new Point(6, 10));
        line2.setEnd(new Point(26, 10));

        line3.setStart(line1.getStart());
        line3.setEnd(line2.getEnd());

        System.out.println("После изменения первой и второй линии:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        // изменение 1 лини
        Point oldPoint1End = line1.getEnd();
        line1.setEnd(new Point(52, 9)); // Изменяем только первую линию

        System.out.println("После изменения первой линии без изменения третьей:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        //3.3
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.addPath(B, 5);
        A.addPath(D, 6);

        B.addPath(A, 5);
        B.addPath(C, 3);
        B.addPath(F, 1);

        C.addPath(D, 4);
        C.addPath(B, 3);

        D.addPath(A, 6);
        D.addPath(C, 4);

        E.addPath(D, 2);
        E.addPath(F, 2);

        F.addPath(A, 1);
        F.addPath(E, 2);

        System.out.println("3.3 " + A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

    }
    // 1.1
    private static Point createPoint(Scanner scanner, int pointNumber) {
        double x = 0;
        double y = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("1.1 Введите координаты для точки " + pointNumber + " (X Y): ");
            String input = scanner.nextLine();

            String[] coordinates = input.split(" ");
            if (coordinates.length == 2) {
                if (isNumeric(coordinates[0]) && isNumeric(coordinates[1])) {
                    x = Double.parseDouble(coordinates[0]);
                    y = Double.parseDouble(coordinates[1]);
                    validInput = true;
                } else {
                    System.out.println("Ошибка: введите числовые значения для координат.");
                }
            } else {
                System.out.println("Ошибка: необходимо ввести две координаты через пробел.");
            }
        }

        return new Point(x, y);
    }

    private static boolean isNumeric(String str) {  // проверка строки на существование числа в ней
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '.' && c != '-') {
                return false;
            }
        }
        return true;
    }
    //1.1
    //1.3
    private static Name createNameFromInput(Scanner scanner) {
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");

        String surname = parts.length > 0 ? parts[0] : null;
        String firstName = parts.length > 1 ? parts[1] : null;
        String patronymic = parts.length > 2 ? parts[2] : null;

        return new Name(surname, firstName, patronymic);
    }
    //1.3
}