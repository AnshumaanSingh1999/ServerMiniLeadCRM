package com.superleap.ServerMiniLeadCRM.Model;


import com.superleap.ServerMiniLeadCRM.Enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.apache.logging.log4j.message.Message;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NotFound;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Leads")
public class Leads {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @PrePersist
    public void setDefaultStatus() {
        if (status == null) {
            status = Status.NEW;
        }
    }

    @Column(name = "source")
    private String source;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @CreationTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;


}