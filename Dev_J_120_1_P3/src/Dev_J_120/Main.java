package Dev_J_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        //Из задания 110 курса: Создайте массив и заполните его следующими данными:
        
        Person person1 = new Teachers("Ronald Turner", Gender.M, "Computer science", "Programming paradigms", Degree.PHD);
        Person person2 = new Teachers("Ruth Hollings", Gender.F, "Jurisprudence", "Domestic arbitration", Degree.MSC);
        Person person3 = new Students("Leo Wilkinson", Gender.M, "Computer science", Stage.BACHELOR, 3);
        Person person4 = new Students("Anna Cunningham", Gender.F, "World economy", Stage.BACHELOR, 1);
        Person person5 = new Students("Jill Lundqvist", Gender.F, "Jurisprudence", Stage.MASTER, 1);
        Person person6 = new Aspirant("Ronald Correa", Gender.M, "Computer science", "Design of a functional programming language.");
        
        Person[] personsArray = new Person[]{person1, person2, person3, person4, person5, person6};
       
        //Из задания 110 курса: Распечатайте содержимое массива. Метод printAllFromArray(Person[] personsArray).
        Person.printAllFromArray(personsArray);       
        System.out.println();
    
        // По заданию 120 курса.... 
        
        //создаем коллекцию Collection<Person> persons и помещаем в нее массив Person[] personsArray.
        
        Collection<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(personsArray));
        /*Работает статический метод printAll(Collection<Person> collection), 
          печатающий данные обо всех персонах, содержащихся в заданной 
          коллекции типа Collection<Person>.*/
        Person.printAll(persons); 
        System.out.println();
        /*создаем коллекцию, параметризованную классом, дочерним к Person - например Students 
         и помещаем в нее всех Students:*/
        Collection<Students> students = new LinkedList<>();
        students.add((Students)person3);
        students.add((Students)person4);
        students.add((Students)person5);
        /*пробуем печатать методом printAll(Collection<Person> collection):
        Person.printAll(students); 
        эта попытка завершается ошибкой "...incompatible types...Students cannot be converted .... Person.. */
        /*изменили тип коллекции в параметре метода на wildcard: 
          printAll(Collection<? extends Person> collection). Теперь работает.*/
        Person.printAll(students); 
    }
    
}
