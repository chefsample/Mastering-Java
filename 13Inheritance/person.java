package student;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName,int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson(){
        System.out.println("Name:"+firstName+" , " +lastName +"\nID:"+idNumber);
    }
}