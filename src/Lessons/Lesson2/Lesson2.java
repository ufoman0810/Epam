package Lessons.Lesson2;

public class Lesson2 {
    static int[] arrInstance = new int[100];

    public static void main(String[] args) {
        byte[] arrLocal = new byte[100];

/*        for (byte i = 6, j = 0; (j += i++) <= 10; i >>= 1, System.out.print(--j)) {
            System.out.println("|");
        }*/


        int x = -2147483648;
        int y = -x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(y == -x);
        int i = 300000;
        System.out.print(i * i);      //-194313216
        long m = i;
        System.out.print(m * m);      //90000000000*/
        //System.out.print(1/(m-i));  //деление на ноль

      /*  quizfull пройтись по тестам xml, sql, java, ооп, паттерны
        статические поля при наследовании
        permanent generation
        final нельзя наследовать
        методы с реализацией в Java 1.8 (default) (static)
        функциональный интерфейс
        bridge adapter composite повторить
        char 16 бит
        char->int неявное приведение типов
        переменная сбрасываеться в минус при инкрементировании после предела
        инвертирование в двоичной системе
        побитовые операции в Java
        сдвиг влево на один это умножение на двойку, сдвиг вправо это деление на 2 (циклический сдвиг), разница >> >>> (&, |, ^, ~)
        умножение Корацубы
        неявные операции (byte = 3 + 2)
        int b=-(min int) !!!!!!
                iEEE754 не предусматривает ошибок (float, double), деление на 0 даст infinity, 0.0/0.0 = notANumber (чтобы определить NAN a!=a)
        sout(0.3==0.1+0.1+0.1) разница 0.1 0.125
        char беззнаковый
        разница utf-8, utf-16, utf-32, ascii-часть utf (коды латинских символов совпадают)
                & && | || boolean
        оболочка Void
        0.125=a*2^-1+b*2^-2+c*2^-3
        как представляются в памяти действительные числа
        double b = 12e-350 протестить
        long->float потеря точности, потестить
        cybernetics

        дз реализация множества на базе массива (union), и односвязного списка  (написать свой)
        Кормен Алгоритмы (анализ сложности, алгоритмы сортировки 3-4, списки, деревья, рекурсивные-нерекурсивные, очередь с приоритетами)
        дз бит с номером n и m (написать функцию выставления двух битов числа в true/false setBits (int n, int m, boolean))
        попрактиковать реализовывать алгоритмы, структуры данных

        container в коллекциях
        преобразование десятичных в двоичные (остатки от деления на 2)*/
    }
}
