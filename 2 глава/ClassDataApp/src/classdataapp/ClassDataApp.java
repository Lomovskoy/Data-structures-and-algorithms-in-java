package classdataapp;

/**
 * Работа с Классами как с типом данных
 * @author imxo
 */
public class ClassDataApp {

    public static void main(String[] args) {
        
        int maxSize = 100;                      //Размер массива
        ClassDataArray arr;                     //Ссылка на массив
        arr = new ClassDataArray(maxSize);      //Создание массива
        
        arr.insert("Кирилл", "Ломовской", 30);  //Вставка 10 элементов
        arr.insert("Сергей", "Жихарев", 30);
        arr.insert("Дмитрий", "Капетий", 32);
        arr.insert("Олег", "Равоид", 24);
        arr.insert("Василиса", "Саровская", 19);
        arr.insert("Вадим", "Совитский", 20);
        arr.insert("Браин", "Дыкун", 20);
        arr.insert("Арина", "Раевская", 21);
        arr.insert("Юрий", "Мельников", 48);
        arr.insert("Валентин", "Юдашкин", 99);
        
        arr.displayA();
        
        String searchKey = "Олег";              //Поиск элемента
        Person fond;
        fond = arr.find(searchKey);
        if(fond != null){
            System.out.print("Найден ");
            fond.displayPerson();
        }
        else
            System.out.println("Не удалось найти " + searchKey);
        
        System.out.println("Удаление Арина, Юрий, Валентин");
        arr.delete("Арина");                    //Удаление 3х элементов
        arr.delete("Юрий");
        arr.delete("Валентин");
        
        arr.displayA();                         //Вывод содержимого
    }
    
}
