package com.bbnl.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_provider_documents")
public class RegisteredDocuments {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "sp_doc_id")
	    private Integer spDocId;
	     
	    @Column(name = "sp_id")
	    private String spId;
	     
	    @Column(name = "sp_doc_name")
	    private String spDocName;

		public RegisteredDocuments() {
			super();
		}

		public RegisteredDocuments(Integer spDocId, String spId, String spDocName) {
			super();
			this.spDocId = spDocId;
			this.spId = spId;
			this.spDocName = spDocName;
		}

		public String getSpId() {
			return spId;
		}

		public void setSpId(String spId) {
			this.spId = spId;
		}

		public String getSpDocName() {
			return spDocName;
		}

		public void setSpDocName(String spDocName) {
			this.spDocName = spDocName;
		}

		@Override
		public int hashCode() {
			return Objects.hash(spDocId, spDocName, spId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RegisteredDocuments other = (RegisteredDocuments) obj;
			return Objects.equals(spDocId, other.spDocId) && Objects.equals(spDocName, other.spDocName)
					&& Objects.equals(spId, other.spId);
		}

		@Override
		public String toString() {
			return "RegisteredDocuments [spDocId=" + spDocId + ", spId=" + spId + ", spDocName=" + spDocName + "]";
		}
	    
	    
	    

}
