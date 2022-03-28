package session4.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
//        for(int i=0;i<PhoneList.size()-1;i++){
//            for(int j=0;j<PhoneList.size()-i-1;j++){
//                if(PhoneList.get(j).name.compareTo(PhoneList.get(j+1).name) > 0){
//                    PhoneNumber temp = PhoneList.get(j);
//                    PhoneList.set(j,PhoneList.get(j+1));
//                    PhoneList.set(j+1,temp);
//                }
//            }
//        }

        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for(PhoneNumber p:PhoneList){
            System.out.println(p.name);
        }
    }
}
