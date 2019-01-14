class Employee{
    private String name,id;
    private int age;

    public Employee(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setID(String id){
        this.id=id;
    }

    public void setage(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public void printAboutEmployee(){
        System.out.println("Name:"+this.name+"\n ID:"+this.id+"\n Age:"+this.age);
    }

}