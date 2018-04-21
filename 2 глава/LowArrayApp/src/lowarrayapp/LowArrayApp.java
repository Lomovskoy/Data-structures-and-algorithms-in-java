package lowarrayapp;

/**
 * Класс массива с низкоуровневым интерфейсом
 * @author imxo
 */
public class LowArrayApp {

    public static void main(String[] args) {
        
        LowArray arr;                           //Ссылка
        arr = new LowArray(100);                //Создание объекта
        int nElems = 0;                         //Количество элементов в массиве
        int j;                                  //Переменная цикла
        
        arr.setElem(0, 77);                     //Вставка 10 элементов
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 0);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;                            //Массив содержит 10 элементов
        
        for(j = 0; j < nElems; j++)             //Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println();
        
        int searchKey = 26;                     //Поиск элемента в ключём 66
        for (j = 0; j < nElems; j++)            //Для каждого элемента
            if(arr.getElem(j) == searchKey)     //Значение найдено?
                break;                          //Да - выход из цикла
        if(j == nElems)                         //Достигнут последний элемент?
            System.out.println("Не удается найти " + searchKey);    //Да
        else
            System.out.println("Найдено " + searchKey);             //Нет
        //----------------------------------------------------------------------
                                                //Удаление элемента с ключём 55
        for (j = 0; j < nElems; j++)            //Поиск удаляемого элемента
            if(arr.getElem(j) == 55)             
                break;                          
        for(int k = j; k < nElems; k++)         //Сдвиг последующихэлементов
            arr.setElem(k, arr.getElem(k + 1));
        nElems--;                               //Уменьшение размера
        //----------------------------------------------------------------------
        for (j = 0; j < nElems; j++)            //Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println();
    }
    
}
