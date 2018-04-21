package orderapp;

import java.util.Arrays;
import java.util.Random;

/**
 * Работа с классом упорядоченного массива
 * @author imxo
 */
public class OrderApp {

    public static void main(String[] args) {
        int maxSize = 100;                  //Максимальный размер массива
        OrdArray arr;                       //Ссылка на массив
        arr = new OrdArray(maxSize);        //создание массива
        
        arr.insert(77);                     //Вставка 10 элементов
        arr.insert(99); 
        arr.insert(44); 
        arr.insert(55);
        arr.insert(22); 
        arr.insert(88); 
        arr.insert(11); 
        arr.insert(0); 
        arr.insert(66); 
        arr.insert(33); 
        
        System.out.println();
        arr.display();                      //Вывод элементов
        
        int searchKey = 88;
        
        if(arr.find(searchKey) != arr.size())//Поиск элемента
            System.out.println("Найдено " + searchKey);
        else
            System.out.println("Не удается найти " + searchKey); 
        
        System.out.println("Удалено 0, 55, 99");
        arr.delete(0);                      //удаление 3х элемента
        arr.delete(55);
        arr.delete(99);
        
        arr.display();                      //Вывод элементов
        
        long[] firstArr = new long[5];
        long[] secondArr = new long[10];
        
        Random random = new Random();
        int a = 0; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"
        
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(firstArr));
        
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(secondArr));
        
        OrdArray test = new OrdArray(firstArr.length + secondArr.length);
        test.merge(firstArr, secondArr);
        
        System.out.println(Arrays.toString(test.getArray()));

    }
}
