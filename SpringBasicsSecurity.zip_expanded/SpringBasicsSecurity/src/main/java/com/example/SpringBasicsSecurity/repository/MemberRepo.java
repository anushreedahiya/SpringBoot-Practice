package com.example.SpringBasicsSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBasicsSecurity.entity.MemberPo;

public interface MemberRepo extends JpaRepository<MemberPo, Long> {
	MemberPo findByUsername(String username);

}