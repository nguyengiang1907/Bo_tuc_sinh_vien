package Bo_Tuc_Sinh_Vien_T7;

public class Person {

    String name ;
    String sex ;
    int age ;
    int lop ;

public Person (String name , String sex , int age , int lop){
    this.name=name;
    this.sex=sex;
    this.age=age;
    this.lop=lop;
}
    public String getName () { return name; }
    public String getSex  (){return  sex;}
    public int getAge (){return age;}
    public int getLop (){return lop;}

    public void setName (String name){this.name=name;}
    public void setSex (String sex){this.sex=sex;}
    public void setAge (int age){this.age=age;}
    public void setLop(int lop ){this.lop=lop;}

    public void check (){
        System.out.println("Name -" + name);
        System.out.println("Sex -"+sex);
        System.out.println("Age -"+age);
        System.out.println("Class - " +lop);
    }
}
