package orderapp;

/**
 * Класс инкапсулирующий работу массива.
 * @author imxo
 */
public class OrdArray {
    
    private long[] arr;                       //Ссылка на массив а
    private int nElems;                     //Количество элементов данных

    public OrdArray(int max) {              //Конструктор
        arr = new long[max];                  //Создание массива    
        nElems = 0;
    }
    
    public int size(){
        return nElems;
    }
    
    public int find(long searchKey){        //Метод двоичного поиска.
        int lowerBond = 0;                  //Нижнаяя гнаница массива
        int upperBond = nElems-1;           //Верхняя груница массива
        int curIn;                          //Указатель поиска
        
        while (true) {                      
            curIn = (lowerBond + upperBond) / 2; //Делим массив пополам
                                            //0 + (-1) / 2 = 0 из за округления
            if(arr[curIn] == searchKey)       //Если элемент найден
                return curIn;               //Возвращаем индекс
            
            else if(lowerBond > upperBond)  //Есди элемент не найден
                return nElems;              //Возвращаем длинну массива
            
            else{                           //Деление диапазона
                if(arr[curIn] < searchKey)    //Если текущий элемент < искомое значение
                    lowerBond = curIn + 1;  //Приравниваем нижнюю границу массива к
                                            //указателю поиска +1
                else                        //Если нет
                    upperBond = curIn - 1;  //Приравниваем верхнюю границу массива к
            }                               //указателю поиска -1
        }
    }
                                            
    public void insert(long value){         //Вставка элемента в массив
        int low = 0;                        //Нижнаяя гнаница массива
        int upp = nElems-1;                 //Верхняя груница массива
        int j = 0;                          //Флаг вставки
        
                                            //Бинарный поиск
        if(nElems != 0){                    //Если массив не пуст
            while (true) { 
                j = (low + upp) / 2;        //Делим массив пополам
                if(j == 0){                 //Если диапазон вставки = 0, место вставки найденно
                    if(arr[j] < value)        //Если текущий элемено < искомого для вставки
                        j += 1;             //Возвращаем индекс + 1
                    break;
                }else{                      //Если диапазон > 0 - деление диапазона
                    if(arr[j] < value){       //Если текущий элемент < Флаг вставки
                        if(arr[j+1] > value ||//Если след элемент > Флаг вставки
                                arr[j+1] > nElems){   //или > длинны массива
                            j += 1;         //Прибавляем к флагу вставки 1
                            break;          
                        }                   //Если след элемент !> Флаг вставки
                        low = j + 1;        //Приравниваем нижнюю границу массива к флаг + 1
                    } else if(arr[j] > value){//Если текущий элемент > Флаг вставки   
                        if(arr[j-1] < value){ //Если предыд. элем. < Флаг вставки
                            break;          //Выйти из цикла оставляя текущий 
                        }                   //флаг для вставки
                        upp = j - 1;        //Приравниваем верхнюю границу массива к
                    }                       //флаг вставки -1
                    else{
                        break;
                    }
                }                           
            }
        }
        
//        for ( j = 0; j < nElems; j++)       //Определеине позиции вставки
//            if(a[j] > value)                //линейный поиск
//                break;
        
        for (int k = nElems; k > j; k--)    //Перемещение последующих элементов 
            arr[k] = arr[k - 1];
        
        arr[j] = value;                       //Вставка
        nElems++;                           //Увеличение размера
    }
    
    public boolean delete(long value){      //Удаление элемента
        int j = find(value);
        if(j == nElems)                     //Если найти не удалось
            return false;
        else{//Если найти удалось
            for (int k = j; k < nElems; k++)//Перемещение последующих элементов 
                arr[k] = arr[k + 1];
            nElems--;                       //Уменьшение размера
            return true;
        }
    }
    
    public void display(){                      //Вывод содержимого массива
        for (int j = 0; j < nElems; j++)        //Для каждого элемента
            System.out.print(arr[j] + " ");       //Вывод
        System.out.println();
    }
    
    public void merge(long[] firstArr, long[] secondArr){
        for (int i = 0; i < firstArr.length; i++) {
            insert(firstArr[i]);
        }
        for (int j = 0; j < secondArr.length; j++) {
            insert(secondArr[j]);
        }
    }
    
    public long[] getArray(){               //Вернуть массив
        return arr;
    }
}
