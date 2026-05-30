package com.agroscan.apiscan.repository;



import com.agroscan.apiscan.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeituraRepository extends JpaRepository<Leitura, Long> {
}