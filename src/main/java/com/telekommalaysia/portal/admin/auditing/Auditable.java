package com.telekommalaysia.portal.admin.auditing;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {
      
	@CreatedDate
    @Temporal(TIMESTAMP)
	@Column(name = "created_date")
    protected Date creationDate;
    
	@LastModifiedDate
    @Temporal(TIMESTAMP)
	@Column(name = "last_modified_date")
    protected Date lastModifiedDate;
}