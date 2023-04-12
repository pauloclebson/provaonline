package br.com.provaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.provaonline.model.Provas;

public interface ProvasRepositorio extends JpaRepository<Provas, Integer> {
}
