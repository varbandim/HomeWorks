package ru.geekbrains.lesson2.homework;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например,
в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения
MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */
public class Main {
    private static final String[][] MATRIX = {
            {"1","3","6","8"},
            {"2","1","65","11"},
            {"31","44","1","3"},
            {"3","4","5","11"}
    };
    private static final String[][] MATRIX2 = {
            {"1","3","6","8"},
            {"2","1","65","11"},
            {"31","44","1","3"},
    };
    private static final String[][] MATRIX3 = {
            {"1","3","6","8"},
            {"2","1","65"},
            {"31","44","1","15"},
            {"3","4","5","11"}
    };
    private static final String[][] MATRIX4 = {
            {"1","3","6","8"},
            {"2","1","65","Ёжик"},
            {"31","44","1","3"},
            {"3","4","5","11"}
    };

    public static void main(String[] args) {
        try{
            System.out.println("Summ = " + Matrix.sumMatrix(MATRIX3));
        }catch(Matrix.MyArraySizeException e){
            System.out.println("MyArraySizeException - " + e.getMessage());
        }catch(Matrix.MyArrayDataException e){
            System.out.println("MyArrayDataException - " + e.getMessage());
        }
    }
}