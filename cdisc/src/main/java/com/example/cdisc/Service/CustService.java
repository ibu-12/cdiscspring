package com.example.cdisc.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cdisc.Model.User;
import  com.example.cdisc.Repository.CustRepo;

@Service
public class CustService {
    @Autowired
    private CustRepo custRepo;

    public User saveDetails(User user){
        return custRepo.save(user);
    }

    public java.util.List<User> getAllDetails(){
        return custRepo.findAll();
    }
    public Optional <User>getUserByEmail(String email)
    {
        return custRepo.findByEmail(email);
    }
    public boolean updateDetails(String email,User user)
    {
        if(this.getUserByEmail(email)==null)
        {
            return false;
        }
        try{
            custRepo.save(user);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public String deleteUser(int Id){
         custRepo.deleteById(Id);
         return "deleted "+ Id;
    }
}