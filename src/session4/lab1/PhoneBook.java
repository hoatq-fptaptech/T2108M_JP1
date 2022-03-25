package session4.lab1;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                for(String s:p.phone){
                    if(s == phone) return;
                }
                p.phone.add(phone);
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                p.phone.removeAll(p.phone);// xoa het
                p.phone.add(newphone);
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
//                System.out.println(p.name+":"+p.phone);
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {
       // bubble sort
    }
}
