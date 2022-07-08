package com.mikeequinto.housechores.repository;

import com.mikeequinto.housechores.models.ERole;
import com.mikeequinto.housechores.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
