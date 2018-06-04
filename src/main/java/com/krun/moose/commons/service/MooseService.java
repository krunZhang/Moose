/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseService.java
 * Date:    18-6-4 下午6:06
 * Author: krun
 */

package com.krun.moose.commons.service;

import com.krun.moose.commons.repository.MooseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;

/**
 * MooseService.java
 *
 * @author krun
 * @date 2018/6/4 16:12
 */
public interface MooseService <T, ID, R extends MooseRepository<T, ID>> {

	R getRepository ();

	default Page<T> findAll (Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	default Page<T> findAll (Specification<T> specification, Pageable pageable) {
		return getRepository().findAll(specification, pageable);
	}

	default Optional<T> findByID (ID id) {
		return getRepository().findById(id);
	}

	default List<T> findByIDs (Iterable<ID> id) {
		return getRepository().findAllById(id);
	}

	/**
	 * 返回符合 {@link Specification} 的实体，如果找不到则会返回一个 {@link Optional#empty()} .
	 *
	 * @param specification 可以为 {@literal null}.
	 *
	 * @return 永远不为 {@literal null}.
	 *
	 * @throws org.springframework.dao.IncorrectResultSizeDataAccessException 如果超过一个实体符合条件则抛出异常.
	 */
	default Optional<T> findOne (Specification<T> specification) {
		return getRepository().findOne(specification);
	}

	default T saveAndFlush (T entity) {
		return getRepository().saveAndFlush(entity);
	}

	default List<T> saveAll (Iterable<T> list) {
		return getRepository().saveAll(list);
	}

	default void delete (T entity) {
		getRepository().delete(entity);
	}

	default void deleteAll () {
		getRepository().deleteAll();
	}

	default void deleteAll (Iterable<? extends T> list) {
		getRepository().deleteAll(list);
	}

	default long count () {
		return getRepository().count();
	}

	default long count (Specification<T> specification) {
		return getRepository().count(specification);
	}

	default boolean existByID (ID id) {
		return getRepository().existsById(id);
	}
}
