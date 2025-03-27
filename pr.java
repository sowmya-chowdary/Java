class pr{
    public static void main(String[]args){
        Person person1=new Person("Sunder",26,"chennai");
        Person person2=new Person("Sowmya",20,"chennai");
        Person person3=new Person("pallavi",15,"chennai");
        person1.personInfo();
        person2.personInfo();
        person3.personInfo();
        System.out.println(person1.name);
        System.out.println(person3.age);


    }
}