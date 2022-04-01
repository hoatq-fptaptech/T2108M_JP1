package javafx;

public final class Person {
    public String fullname;
    public String email;
    public Integer age;

    public Person() {
    }

    public Person(String fullname, String email, Integer age) {
        this.fullname = fullname;
        this.email = email;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString(){
        String s = "\n-------------";
        s+= "\n"+getFullname();
        s+= "\n"+getEmail();
        s+= "\n"+getAge();
        return s;
    }
}
