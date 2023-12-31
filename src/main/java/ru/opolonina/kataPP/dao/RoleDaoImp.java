package ru.opolonina.kataPP.dao;

import org.springframework.stereotype.Repository;
import ru.opolonina.kataPP.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class RoleDaoImp implements RoleDao {
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public List<Role> findAll() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    ;
}
