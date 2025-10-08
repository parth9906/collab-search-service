package com.parth_collab.search_service.controller;

import com.parth_collab.search_service.model.DocumentIndex;
import com.parth_collab.search_service.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/index")
    public ResponseEntity<DocumentIndex> indexDocument(@RequestBody DocumentIndex doc) {
        return ResponseEntity.ok(searchService.indexDocument(doc));
    }

    @GetMapping
    public ResponseEntity<List<DocumentIndex>> search(@RequestParam String query) {
        return ResponseEntity.ok(searchService.search(query));
    }
}
