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
	 * ドメインオブジェクトからインスタンスを生成
	 *
	 * @param user ドメインオブジェクト
	 * @return UserEntity
	 */
	public static UserEntity build(User user) {
		return UserEntity.builder().id(user.getId()).value(user.getValue()).build();
	}

	/**
	 * ドメインオブジェクトへ変換
	 *
	 * @return ドメインオブジェクト
	 */
	public User toDomainUser() {
		return User.builder().id(this.id).value(this.value).build();
	}
}
