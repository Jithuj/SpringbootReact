package com.qatofullstack.curdApp.firstApp.repository;

import com.qatofullstack.curdApp.firstApp.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
    Group findByName(String name);
}
