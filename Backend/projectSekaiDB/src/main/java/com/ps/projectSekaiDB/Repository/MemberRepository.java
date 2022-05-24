package com.ps.projectSekaiDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.projectSekaiDB.Model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
