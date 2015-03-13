package com.airhacks.business.posts.boundary;

import com.airhacks.business.posts.control.PostValidator;
import com.airhacks.business.posts.entity.Post;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brunosantos
 */
@Stateless
public class BlogEngine {
    
    @Inject
    PostValidator pv;

    @PersistenceContext
    EntityManager em;
    
    public void savePost(String message) {
        pv.isValid(message);
        em.merge(new Post(message));
    }
    
}
