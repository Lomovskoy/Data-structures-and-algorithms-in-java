package classdataapp;

/**
 * Класс инкапсулирующий работу с массивом обьектов типа Person
 * @author imxo
 */
public class ClassDataArray {
    
    private Person[] a;                         //Ссылка на массив
    private int nElems;                         //Количество элементов данных

    public ClassDataArray(int max) {            //Конструктор
        a = new Person[max];                    //Создание массива
        nElems = 0;                             //Пока нет не одного элемента
    }
    
    public Person find(String searchName){      //Поиск заданного значения
        int j;                                  
        for (j = 0; j < nElems; j++)            //Для каждого элемента
            if(a[j].getLast().equals(searchName))//Если найденно
                break;                          //Выход из цикла
        if(j == nElems)                         //Если достигнут последний эл.
            return null;                        //Значение не найденно
        else                                    
            return a[j];                        //Значение найденно
    }
    
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);//Включение записи в массив
        nElems++;                               //Увеличение размера
    }
    
    public boolean delete(String searchName){   //Удаление из массива
        int j;
        for ( j = 0; j < nElems; j++)           //Поиск удалённого элемента
            if(a[j].getLast().equals(searchName))
                break;
        if(j == nElems)                         //Если найти не удалось
            return false;
        else{                                   //Если значение найденно
            for (int k = j; k < nElems; k++)    //Сдвиг следующих элементов
                a[k] = a[k + 1];
            nElems--;                           //Уменьшение размера
            return true;
        }
    }
    
    public void displayA(){                     //Вывод содержимого массива
        for (int j = 0; j < nElems; j++) {      //Для каждого элемента
            a[j].displayPerson();               //Вывод
        }
    }
}
