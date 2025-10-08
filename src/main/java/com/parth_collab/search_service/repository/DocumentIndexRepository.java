package com.parth_collab.search_service.repository;

import com.parth_collab.search_service.model.DocumentIndex;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentIndexRepository extends ElasticsearchRepository<DocumentIndex, String> {
    List<DocumentIndex> findByTitleContainingOrContentContaining(String title, String content);
}
