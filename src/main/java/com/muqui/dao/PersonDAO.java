/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.dao;

import com.muqui.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mq12
 */
@Transactional
@Repository
public class PersonDAO implements IPersonDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean addPerson(Person person) {
        hibernateTemplate.save(person);
        return false;
    }

}
