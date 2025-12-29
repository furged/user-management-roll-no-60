package com.exam.usersscrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserssRepository extends JpaRepository<Userss, Long> {
}
