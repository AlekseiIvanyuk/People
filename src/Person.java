import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
//
    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (Person.this.age == 0) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (Person.this.address == null) {
            return false;
        } else return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
//TODO OptionalInt
    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge() == true) {
            this.age = age + 1;
        }
    }




//    public static class PersonBuilder {
//        //...
//
//        protected String name;
//        protected String surname;
//        protected int age;
//        protected String address;
//
//        public PersonBuilder setName(String name) {
//            this.name = name;
//            return this;
//        }
//        public PersonBuilder setSurname(String surname) {
//            this.surname = surname;
//            return this;
//        }
//        public PersonBuilder setAge(int age) {
//            this.age = age;
//            return this;
//        }
//        public PersonBuilder setAddress(String address) {
//            this.address = address;
//            return this; }
//
//        public Person build() {
//            return new Person(this);
//        }
//    }
//
//    private Person(PersonBuilder personBuilder){
//        this.name = personBuilder.name;
//        this.surname = personBuilder.surname;
//        this.age = personBuilder.age;
//        this.address = personBuilder.address;
//    }

//    @Override
//    public int hashCode() { /*...*/ }
//
//    public PersonBuilder newChildBuilder() { /*...*/ }



    //TODO
    @Override
    public String toString() {
        return "Person("+"mom:  "+ "name "+name+", surname "+
                surname+ ", age "+age+ ", address "+address+")";

    }
}

