package com.ateam.survivalprep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateam.survivalprep.Entity.TipsEntity;

@Repository
public interface TipsRepository extends JpaRepository<TipsEntity, Integer>{
        public List<TipsEntity> findByIsdeleted(boolean isdeleted);
        public TipsEntity findByTipid(int tipid);
}
