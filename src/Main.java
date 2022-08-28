public class Main {
    public static void main(String[] args) {
        /**Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку на исключительные ситуации, используя:
         1. try- catch
         2. try-catch, где catch будет несколько
         3. try -catch, с использованием multi-catch
         4. try-catch-finally
         Продемонстрировать обработку исключительных ситуаций на примерах. */

        //1.
        try {
            int[] array = new int[-2];
        } catch (NegativeArraySizeException e) {
            System.out.println("Размер массива не может быть отрицательным!");
        }
        //2.
        try {
            Object array[] = new String[5];
            array[0] = 2;
        } catch (ArrayStoreException e) {
            System.out.println("Присваивание элементу массива объекта несовместимого типа");
        } catch (RuntimeException e) {
            System.out.println("Далеко занесло");
        }
        //3.
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[-3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Индекс за пределами массива");
        }
        //4.
        try {
            int o = Integer.valueOf("258.25f");
        } catch (NumberFormatException e) {
            System.out.println("Неправильное преобразование символьной строки в числовой формат");
        } finally {
            System.out.println("Вот и сказки конец");
        }
    }
}