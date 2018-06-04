/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePropertiesRepository.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.repository;

import com.krun.moose.commons.repository.MooseRepository;
import com.krun.moose.entity.MooseProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * MoosePropertiesRepository.java
 *
 * @author krun
 * @date 2018/6/4 16:11
 */
@Repository
public interface MoosePropertiesRepository extends MooseRepository<MooseProperty, String> {

	Optional<MooseProperty> findByKey (String key);

	Page<MooseProperty> findAllByKeyLike (String key, Pageable pageable);
}
