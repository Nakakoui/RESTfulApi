package com.example.demo.application.controller;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.demo.application.resource.UserBody;
import com.example.demo.domain.object.User;
import com.example.demo.domain.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {
	
	@NonNull
	private final UserService userService;

	/**
	 * ���[�U����
	 *
	 * @param id �������������[�UID
	 * @return ���[�U
	 */
	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public User findById(@PathVariable("id") String id) {
		return this.userService.findById(id).orElseThrow(RuntimeException::new);
	}

	/**
	 * ���[�U�쐬�A�X�V
	 *
	 * @param userBody ���N�G�X�g�{�f�B
	 * @return �X�V��̃��[�U
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody @Validated UserBody userBody) {
		return this.userService.save(userBody.toDomainUser());
	}

	/**
	 * ���[�U�폜
	 *
	 * @param id �폜���������[�UID
	 */
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable("id") String id) {
		this.userService.deleteById(id);
	}
}
