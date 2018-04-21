package hightarrayapp;

/**
 * Класс массива с высокоуровневым доступом
 * @author imxo
 */
public class HightArrayApp {

    public static void main(String[] args) {
        
        int maxSize = 100;                  //Максимальный размер массива
        HightArray arr;                     //Ссылка на массив
        arr = new HightArray(maxSize);      //создание массива
        
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
        
        arr.display();                      //Вывод элементов
        
        int searchKey = 35;
        if(arr.find(searchKey))             //Поиск элемента
            System.out.println("Найдено " + searchKey);
        else
            System.out.println("Не удается найти " + searchKey); 
        
        arr.delete(0);                      //удаление 3х элемента
        arr.delete(55);
        arr.delete(99);
        
        arr.display();                      //Вывод элементов
        
        long max = arr.getMax();            //Переменная содержащая макимальное значение массива
        if(max == -1)                       //Если оно -1
            System.out.println("Массив пуст - невозможно найти максимальное значение");
        else                                //Если любое другое число
            System.out.println("Максимальное значение массива: " + max);
        
        long del = arr.removeMax();         //Удаляем самый большой элемент массива
        if(del != -1)                       //Если удаление не вернуло код ошибки
            System.out.println("Удалён самый большой элемент." + del);
        else                                //Если же вернуло -1 - код ошибки
            System.out.println("Невозможно удалить самый большой жлемент массив пуст");
        
        arr.display();                      //Показываем весь массив
        
        HightArray arrSort;                 //Ссылка на массив
        arrSort = new HightArray(maxSize);  //создание сортированного массива 
        
        while(true){
            del = arr.removeMax();          //Удаляем самый большой элемент массива
            if(del == -1)                   //Если ответ -1 - код ошибки
                break;                      //Цикл пуст - выходим
            else{                           //Если же нет
                arrSort.insert(del);        //Добавляем самое большое значение 
            }                               //в сорт массив
        }
        System.out.println("Сортированный массив");
        arrSort.display();                  //Выводим на экран новый массив
        
        HightArray arr2;                     //Ссылка на массив
        arr2 = new HightArray(maxSize);      //создание массива
     
        arr2.insert(77);                     //Вставка 20 элементов
        arr2.insert(99); 
        arr2.insert(44); 
        arr2.insert(55); 
        arr2.insert(22); 
        arr2.insert(88); 
        arr2.insert(11); 
        arr2.insert(0); 
        arr2.insert(66); 
        arr2.insert(33);
        arr2.insert(77);                     
        arr2.insert(99); 
        arr2.insert(44); 
        arr2.insert(55); 
        arr2.insert(22); 
        arr2.insert(88); 
        arr2.insert(11); 
        arr2.insert(0); 
        arr2.insert(66); 
        arr2.insert(33);
        
        System.out.println("Массив с дубликатами: ");
        arr2.display();
        arr2.noDups();
        System.out.println("Массив без дубликатов: ");
        arr2.display();
    }
    
}
