package com.parth_collab.search_service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "documents")
public class DocumentIndex {
    @Id
    private String id;
    private String documentId;
    private String title;
    private String content;
    private String ownerId;
    private Instant createdAt;
}
