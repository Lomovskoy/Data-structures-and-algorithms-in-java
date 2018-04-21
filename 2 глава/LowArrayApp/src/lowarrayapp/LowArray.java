package lowarrayapp;

/**
 * Класс инкапсулирующий работу с массивом.
 * @author imxo
 */
public class LowArray {
    
    private long[] a;                               //Сcылка на массив а

    public LowArray(int size) {                     //Контруктор
        this.a = new long[size];                    //Создание массива
    }

    public void setElem(int index, long value) {    //Вставка элемента
        this.a[index] = value;
    }
    
    public long getElem(int index) {                //Чтение элемента
        return a[index];
    }
}
