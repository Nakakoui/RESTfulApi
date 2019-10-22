package com.example.demo.domain.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.object.User;
import com.example.demo.domain.repository.UserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	@NonNull
    private final UserRepository userRepository;

    /**
     * ���[�U����
     *
     * @param id �������������[�UID
     * @return ���[�U
     */
    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

    /**
     * ���[�U�쐬�A�X�V
     *
     * @param user �쐬�A�X�V�������[�U
     * @return �X�V��̃��[�U
     */
    public User save(User user) {
        return this.userRepository.save(user);
    }

    /**
     * ���[�U�폜
     *
     * @param id �폜���������[�UID
     */
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }
}
