package com.app.adventurehub.user.domain.persistence;

import com.app.adventurehub.user.domain.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
