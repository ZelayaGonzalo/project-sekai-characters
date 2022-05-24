package com.ps.projectSekaiDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.projectSekaiDB.Model.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long>{

}
