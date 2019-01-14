class Address{
    private String street,city,state;

    public Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public void setStreet(String street){
        this.street=street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getStreet(){
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
}