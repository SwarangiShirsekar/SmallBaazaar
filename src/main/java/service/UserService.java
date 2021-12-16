package service;

import entities.product_master;
import interfaces.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

@Autowired
    productrepo repository;

  public List retrieve(){
    List ref= repository.find();
      return ref;
  }


}
