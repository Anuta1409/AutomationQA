package jdbc;

public class Abonent extends Entity{

    private int phone;
    private String lastname;

    public Abonent() {
    }

    public Abonent(int id, int phone, String lastname) {
        super(id);
        this.lastname = lastname;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return "Abonent[phone="+phone + ",lastname="+lastname+"]";
    }
}
