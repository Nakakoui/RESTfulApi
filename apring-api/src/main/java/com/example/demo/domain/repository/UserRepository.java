package com.example.demo.domain.repository;

import java.util.Optional;

import com.example.demo.domain.object.User;

public interface UserRepository {
	/**
     * ユーザ検索
     *
     * @param id 検索したいユーザID
     * @return ユーザ
     */
    Optional<User> findById(String id);

    /**
     * ユーザ作成、更新
     *
     * @param user 作成、更新したユーザ
     * @return 更新後のユーザ
     */
    User save(User user);

    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザID
     */
    void deleteById(String id);
}
