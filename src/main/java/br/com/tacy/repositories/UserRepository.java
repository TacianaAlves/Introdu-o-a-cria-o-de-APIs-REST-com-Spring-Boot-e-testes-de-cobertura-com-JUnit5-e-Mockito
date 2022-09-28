package br.com.tacy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tacy.domain.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Integer> {

}
