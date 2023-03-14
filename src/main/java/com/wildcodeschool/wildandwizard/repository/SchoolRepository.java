package com.wildcodeschool.wildandwizard.repository;

// TODO : update this interface


import org.springframework.data.jpa.repository.JpaRepository;
import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
