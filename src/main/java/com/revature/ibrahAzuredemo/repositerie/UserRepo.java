package com.revature.ibrahAzuredemo.repositerie;

import com.revature.ibrahAzuredemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository()
public interface UserRepo extends JpaRepository<User, Integer> {

}
