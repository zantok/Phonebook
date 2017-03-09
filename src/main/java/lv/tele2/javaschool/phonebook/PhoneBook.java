package lv.tele2.javaschool.phonebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zansdzan on 07.03.2017.
 */
public class PhoneBook {
    private List<Record> recordList =new ArrayList<>();
@Command
    public void create(String name, String phone, String email){
    Record r=new Record(name,phone, email);
    if (email.indexOf('@')<0) {
        System.out.println(" Please provide correct email with @");
        return;
    }



        recordList.add(r);

    }
    @Command
    public List<Record> list(){
        return recordList;
    }
}
