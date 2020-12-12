package com.example.config.dao;

import com.example.config.pojo.Communication;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class communicationdao {

    public static Map<Integer, Communication> people =null;

    static{
        people=new HashMap<Integer, Communication>();
        people.put(1,new Communication(1,"张三","123@qq.com","学一123","123432312","87462376"));
        people.put(2,new Communication(2,"李四","ssasdzxc@126.com","学十三323","92732312","13146634576"));
        people.put(3,new Communication(3,"王五","axsd123@bupt.com","学四453","1087532312","15646560788"));
    }

    public static Collection<Communication> getAll(){

        return people.values();
    }
    public Communication getPersonById(Integer Id){

        return people.get(Id);
    }
    public Communication getPersonByTel(String tel){
        return people.get(tel);
    }
    private static Integer intiId = 4;
    public void addPerson(Communication person){
        if(person.getId()==null){
            person.setId(intiId++);
        }
        people.put(person.getId(),person);
    }
    public void deletePerson(Integer Id){
        people.remove(Id);
    }


}
