/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.service;

import com.muqui.dao.IPersonDAO;
import com.muqui.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mq12
 */
@Service
public class PersonService implements IPersonService  {
@Autowired
	private IPersonDAO personDAO;
    @Override
    public boolean addPerson(Person person) {
        personDAO.addPerson(person);
        return true;
    }
    
}
