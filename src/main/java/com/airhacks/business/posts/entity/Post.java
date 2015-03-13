/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.business.posts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author brunosantos
 */
@Entity
public class Post {
    
    @Id
    private long id;
    
    private String message;

    public Post(String message) {
        this.message = message;
    }

   public Post(){
   
   }
    
    
}

