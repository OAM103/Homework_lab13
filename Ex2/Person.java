
public class Person{

    String name, surname, middlename;

    public String getName()
    { return name;}

    public String getSurname()
    { return surname;}

    public String getMiddlename()
    { return middlename; }


    Person(String name, String surname, String middlename){
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }
    Person(String surname) {
        name = null;
        this.surname = surname;
        middlename = null;
    }

    public String toString(){
        try{
            return "Person: " + surname + " " + name.charAt(0)+ ". " + middlename.charAt(0) +".";
        }catch (Exception e){
            return "Person: " + surname;
        }

    }
}
