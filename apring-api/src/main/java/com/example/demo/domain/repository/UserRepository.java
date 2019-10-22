package com.example.demo.domain.repository;

import java.util.Optional;

import com.example.demo.domain.object.User;

public interface UserRepository {
	/**
     * ���[�U����
     *
     * @param id �������������[�UID
     * @return ���[�U
     */
    Optional<User> findById(String id);

    /**
     * ���[�U�쐬�A�X�V
     *
     * @param user �쐬�A�X�V�������[�U
     * @return �X�V��̃��[�U
     */
    User save(User user);

    /**
     * ���[�U�폜
     *
     * @param id �폜���������[�UID
     */
    void deleteById(String id);
}
