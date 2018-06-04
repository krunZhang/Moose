/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseRepository.java
 * Date:    18-6-4 下午6:06
 * Author: krun
 */

package com.krun.moose.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * MooseRepository.java
 *
 * @author krun
 * @date 2018/6/4 16:10
 */
@NoRepositoryBean
public interface MooseRepository <T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {}
