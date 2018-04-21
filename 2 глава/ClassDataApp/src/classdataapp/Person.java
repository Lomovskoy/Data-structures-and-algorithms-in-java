package classdataapp;

/**
 * Класс персоны содержащий данный о человеке
 * @author imxo
 */
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    
    public void displayPerson(){
        System.out.print("Имя: " + lastName);
        System.out.print(", Фамилия: " + firstName);
        System.out.println(", Возраст: " + age);
    }
    
    public String getLast(){                            //Получить фамилию
        return lastName;
    }
}
