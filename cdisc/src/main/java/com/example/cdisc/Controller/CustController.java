package com.example.cdisc.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cdisc.Model.User;
import com.example.cdisc.Service.CustService;

import io.micrometer.common.lang.NonNull;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class CustController {
    @Autowired
    private CustService custService;

    @PostMapping("/adddata")
    public User postDetails(@RequestBody User user) {
        
        
        return custService.saveDetails(user);
    }
    @GetMapping("/getdata")
   
    
    public java.util.List<User> getDetails(){
        return custService.getAllDetails();
    }
    
   @PutMapping("/updateData/{email}")
    public ResponseEntity<User> updateUser(@NonNull @PathVariable  String email,@RequestBody User user)
    {
        if(custService.updateDetails(email,user)==true)
        {
            return new ResponseEntity<>(user,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteData/{Id}")
    public String deleteDetails(@PathVariable int Id) {
        return custService.deleteUser(Id);
    }
}
