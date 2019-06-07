package com.shmakov.java_app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shmakov.java_app.persistence.model.UserAccount;

/**
 * Интерфейс - репозиторий
 *
 *
 *
 */
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

}