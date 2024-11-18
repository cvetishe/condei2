package com.example.Conditioner2Spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CondeiService {
    List <Conditioner> conditioner = new ArrayList<>();

    public void add(Conditioner c){
        conditioner.add(c);
    }

    public List<Conditioner> getConditioner() {
        return conditioner;
    }
}
