package com.example.demo.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.domain.object.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_users")
public class UserEntity {
	@Id
    @Column(name = "id")
    private String id;

    @Column(name = "value")
    private String value;
    
	/**
	 * �h���C���I�u�W�F�N�g����C���X�^���X�𐶐�
	 *
	 * @param user �h���C���I�u�W�F�N�g
	 * @return UserEntity
	 */
	public static UserEntity build(User user) {
		return UserEntity.builder().id(user.getId()).value(user.getValue()).build();
	}

	/**
	 * �h���C���I�u�W�F�N�g�֕ϊ�
	 *
	 * @return �h���C���I�u�W�F�N�g
	 */
	public User toDomainUser() {
		return User.builder().id(this.id).value(this.value).build();
	}
}
