package io.github.vieirafabio98.domain.repository;

import io.github.vieirafabio98.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
