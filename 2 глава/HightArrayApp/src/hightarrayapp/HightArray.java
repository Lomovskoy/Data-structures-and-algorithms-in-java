package hightarrayapp;

/**
 * Высокоуровневый класс обёрткадля массива.
 * @author imxo
 */
public class HightArray {
    
    private long[] a;                           //Сcылка на массив а
    private int nElems;                         //Количество элементов в массиве
    
    public HightArray(int max){                 //Конструктор
        this.a = new long[max + 1];             //Создание массива
        nElems = 0;                             //Пока нет ни одного элемента
    }
    
    public boolean find(long searchKey){        //Поиск заданного значения
        int j;
        for(j = 0; j < searchKey; j++)          //Для каждого элемента
            if(a[j] == searchKey)               //Значение найдено?
                break;                          //Да - выходиз цикла
        if(j == nElems)                         //Достигнут последний элемент
            return false;                       //Да
        else
            return true;                        //Нет
    }
    
    public void insert(long value){             //Вставка элементов в массив
        a[nElems] = value;                      //Собственно вставка
        nElems++;                               //Увеличение размера
    }
    
    public boolean delete(long value){
        int j;
        for (j = 0; j < nElems; j++)            //Поиск заданного значения
            if(value == a[j])
                break;                          //Найти не удалось
        if(j == nElems)
            return false;                       //Занчение найденно
        else{
            for (int k = j; k < nElems; k++)    //Сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--;                           //Уменьшение размера
            return true;
        }
    }
    
    public void display(){                      //Вывод содержимого массива
        for (int j = 0; j < nElems; j++)        //Для каждого элемента
            System.out.print(a[j] + " ");       //Вывод
        System.out.println();
    }
    
    public long getMax(){
        long max = -1;                          //Устанавливаем максимальное значение -1
        if(nElems == 0)                         //Если массив пуст
            return max;                         //Возвращаем -1
        
        for (int j = 1; j < nElems; j++)        //Для каждого элемента
            if(a[j] > max)                      //Если значение элемента больше текущего максимального
                max = a[j];                     //Приравниваем максимальное значение ему
        return max;                             //Возвращаем максимальное
    }
    
    public long removeMax(){                    //метод возваращает макимальный удалённый элемент
        long max = getMax();                    //Узнаём самый большой элемент
        if(max == -1)                           //Если ответ -1 массив пуст
            return max;                         //Возваращаем -1 - код ошибки
        else{                                   //Если же нет
            boolean del = delete(max);          //Удаляем этот самый большой элемент
            if(del)                             //Если удаление вернула true
                return max;                     //Возвращаем эот элемент удаляния
            else                                //Если же нет
                return -1;                      //Возвращаем -1 код ошибки
        }
        
    }
    
    public void noDups(){                       //Удаляем все дублекаты
       
        for (int i = 0; i < nElems; i++){       //Для каждого элемента
            for (int j = i+1; j < nElems; j++) {//Для каждого вложенного элеента
                if(a[i] == a[j]){               //Есди находим совпадение
                    delete(a[i]);               //Удаляем элемент
                    j--;                        //Оставляем флаг на том же месте
                }                               //Посколько массив сам сдивается
            }
        }
    }
}
