package com.example.Conditioner2Spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CondeiService {
    List <Conditioner> conditionerList = new ArrayList<>();

    public void add(Conditioner c){
        conditionerList.add(c);
    }

    public List<Conditioner> getConditioner() {
        return conditionerList;
    }
//    public String getConditioner() {
//        return conditionerList.toString();
//    }
}
