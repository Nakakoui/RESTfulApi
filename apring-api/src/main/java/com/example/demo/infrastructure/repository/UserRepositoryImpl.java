package com.example.demo.infrastructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.object.User;
import com.example.demo.domain.repository.UserRepository;
import com.example.demo.infrastructure.entity.UserEntity;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

	@NonNull
    private final UserJpaRepository userJpaRepository;
	
	/* (non-Javadoc)
	 * @see com.example.demo.domain.repository.UserRepository#findById(java.lang.String)
	 */
	@Override
	public Optional<User> findById(String id) {
		return this.userJpaRepository.findById(id)
                .map(UserEntity::toDomainUser);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.domain.repository.UserRepository#save(com.example.demo.domain.object.User)
	 */
	@Override
	public User save(User user) {
		return this.userJpaRepository.save(UserEntity.build(user))
                .toDomainUser();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.domain.repository.UserRepository#deleteById(java.lang.String)
	 */
	@Override
	public void deleteById(String id) {
		this.userJpaRepository.deleteById(id);
	}

}
