package com.parth_collab.search_service.service;

import com.parth_collab.search_service.model.DocumentIndex;
import com.parth_collab.search_service.repository.DocumentIndexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final DocumentIndexRepository repository;

    public DocumentIndex indexDocument(DocumentIndex doc) {
        return repository.save(doc);
    }

    public List<DocumentIndex> search(String query) {
        return repository.findByTitleContainingOrContentContaining(query, query);
    }
}
