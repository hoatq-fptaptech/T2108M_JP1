package session4.lab1;

public class Main {
    public static void main(String args[]){
        PhoneBook pb = new PhoneBook();

        pb.insertPhone("Tuan","0911222355");
        pb.insertPhone("Duy","0911222333");
        pb.insertPhone("Duy","0988777666");

        pb.insertPhone("Lan","01828282828");

//        for (PhoneNumber pn : pb.PhoneList){
//           System.out.println(pn.name);
//           System.out.println(pn.phone);
//        }
        pb.sort();

    }
}
