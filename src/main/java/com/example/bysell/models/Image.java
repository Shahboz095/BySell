package com.example.bysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "OriginalFileName")
    private String originalFileName;
    @Column(name = "Size")
    private Long size;
    @Column(name = "ContentType")
    private String contentType;
    @Column(name = "isPreviewImage")
    private boolean isPreviewImage;

    @Lob
    private byte[] bytes;

    // image bn product boglash -->
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Product product;
}
