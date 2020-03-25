public class NamePhoneEmail {
    private String name;
    private String mail;
    private String phone;

    public NamePhoneEmail(String name, String mail, String phone){
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getMail(){
        return mail;
    }

    public String getPhone(){
        return phone;
    }
}
