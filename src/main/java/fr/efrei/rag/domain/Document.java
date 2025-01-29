package fr.efrei.rag.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;


    @GetMapping("/documents")
    public List<Document> getDocuments() {
        return documentRepository.findAll();
    }


}
