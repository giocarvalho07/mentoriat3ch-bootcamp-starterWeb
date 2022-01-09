package com.cursoweb.repository;

import com.cursoweb.domain.CursoWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoWebRepository extends JpaRepository< CursoWeb, Long > {
}
